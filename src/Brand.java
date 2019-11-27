/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hady
 */
public class Brand {

	private String brandCategory;
	private String brandName;

	Brand(String brandName, String brandCategory) {

		this.brandCategory = brandCategory;
		this.brandName = brandName;
	}

	String getbrandCatgory() {
		return brandCategory;
	}

	String getBrandName() {
		return brandName;
	}

}
