package com.example.service;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dto.ProductSalesDTO;
import com.example.model.SalesEntry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @PersistenceContext
    EntityManager em;
        
    @Transactional
    public List<ProductSalesDTO> getProductSales ()  
    {  
        Session session = (Session) em.getDelegate();
        
        Criteria salesEntryCriteria = session.createCriteria(SalesEntry.class, "sales");
        salesEntryCriteria.createAlias("sales.product", "pt");
        @SuppressWarnings("unchecked")  
        List<ProductSalesDTO> results = salesEntryCriteria.setProjection(Projections.projectionList()
        															.add(Projections.property("pt.productName"), "productName")
        															.add(Projections.groupProperty("product.productId"))
        															.add(Projections.count("salesId"), "countProductSold")
        															.add(Projections.sum("saleAmount"), "totalAmount"))  
                .setResultTransformer(Transformers.aliasToBean(ProductSalesDTO.class))  
                .list();  
          
        return results;  
    }
    
}
