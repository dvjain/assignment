/**
 * 
 */
package com.example.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author djain
 *
 */
@Entity
@Table(name = "SalesEntry")
public class SalesEntry {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SalesId")
	private Integer salesId;
	
	@Column(name="DateofSale")
	private Date dateOfSale;
	
	@OneToOne
	@JoinColumn(name = "ProductID")
	private ProductTable product;
	
	@Column(name="SaleAmount")
	private Double saleAmount;

	/**
	 * @return the salesId
	 */
	public Integer getSalesId() {
		return salesId;
	}

	/**
	 * @param salesId the salesId to set
	 */
	public void setSalesId(Integer salesId) {
		this.salesId = salesId;
	}

	/**
	 * @return the dateOfSale
	 */
	public Date getDateOfSale() {
		return dateOfSale;
	}

	/**
	 * @param dateOfSale the dateOfSale to set
	 */
	public void setDateOfSale(Date dateOfSale) {
		this.dateOfSale = dateOfSale;
	}

	/**
	 * @return the saleAmount
	 */
	public Double getSaleAmount() {
		return saleAmount;
	}

	/**
	 * @param saleAmount the saleAmount to set
	 */
	public void setSaleAmount(Double saleAmount) {
		this.saleAmount = saleAmount;
	}

	/**
	 * @return the product
	 */
	public ProductTable getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(ProductTable product) {
		this.product = product;
	}
}
