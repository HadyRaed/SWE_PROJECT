/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hady
 */
public class Statistics {
	private int numOfView;
	private int numOfProducts;
	private int soldOutProducts;
	Product product;

	Statistics() {
	}

	Statistics(int numOfView, int numOfProducts, int soldOutProducts) {

		this.numOfView = numOfView;
		this.numOfProducts = numOfProducts;
		this.soldOutProducts = soldOutProducts;

	}

	public int getNumOfView() {
		return numOfView;
	}

	public int getNumOfProducts() {
		return numOfProducts;
	}

	public int getSoldOutProducts() {
		return soldOutProducts;
	}

	public void UpdateOnView() {
		numOfView++;
	}

	public void UpdateOnBuy() {
		numOfProducts++;
	}

	public boolean checkStock() {

		if (product.getStock() == 0) {
			System.out.println("Product is out of stock");
			return true;
		} else {
			return false;
		}

	}

}
