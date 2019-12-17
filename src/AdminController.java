
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
        
        
        
        public void CreateStats (Admin a,CustomerDatabase cd,ProductDatabase pd)
        {
        a.CreateStat(cd,pd);    
         }

}
