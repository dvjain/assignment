package com.example.dto;

public class ProductSalesDTO {
	
	private String productName;
	
	private Long countProductSold;
	
	private Double totalAmount;

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}	

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the countProductSold
	 */
	public Long getCountProductSold() {
		return countProductSold;
	}

	/**
	 * @param countProductSold the countProductSold to set
	 */
	public void setCountProductSold(Long countProductSold) {
		this.countProductSold = countProductSold;
	}

	/**
	 * @return the totalAmount
	 */
	public Double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
