package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ProductSalesDTO;
import com.example.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService personService;

    @RequestMapping(value="/salesreport", method=RequestMethod.GET, produces="application/json")
    public List<ProductSalesDTO> getSalesReport() {
        return personService.getProductSales();
    }
}
