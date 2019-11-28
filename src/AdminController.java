/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hady
 */
public class AdminController {

	public boolean validateBrand(String b, BrandDatabase bd) {
		if (bd.CheckBrandName(b) == true) {
			return true;

		} else {
			

			return false;
		}

	}

	public boolean validateProduct(Store s, Product p, ProductDatabase x) {
		if (s.addProductInStore(p, x) == true) {

			System.out.println("Your product is added");
			return true;
		} else {
			System.out.println("Can't add");
			return false;
		}

	}
        
        
        
        public void CreateStats (Admin a,CustomerDatabase cd)
        {
        a.CreateStat(cd);
         }

}
