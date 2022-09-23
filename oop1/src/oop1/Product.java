package oop1;

import java.text.DecimalFormat;

//PascalCase
public class Product {
	private String name;
	private double unitPrice;
	private double getdisCount;
	public String imageUrl;
	public int unitsInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getGetdisCount() {

		return getdisCount;
	}

	public void setGetdisCount(double getdisCount) {
		this.getdisCount = getdisCount;
	}

	public String getImageUrl() {
		return imageUrl;
	} 

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
