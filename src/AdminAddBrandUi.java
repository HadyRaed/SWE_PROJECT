import java.util.Scanner;

public class AdminAddBrandUi {

	public void AdminAddBr(AdminController ac,Admin o,BrandDatabase bdb )
	{
		System.out.println("Enter brand Name");
		Scanner brandN=new Scanner(System.in);
		String brann=brandN.nextLine(); 
		
		System.out.println("Enter brand category");
		Scanner brandNum=new Scanner(System.in);
		String brandCat=brandNum.nextLine(); 

                 if(ac.validateBrand(brann,bdb)==false)
                     
                 {	System.out.print("Brand is added");
                     Brand brand=new Brand(brann,brandCat);
		o.addBrand(brand, bdb);
                 
                 }else{System.out.println("Brandname already exists");}
	}
	
}
