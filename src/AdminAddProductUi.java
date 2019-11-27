import java.io.IOException;
import java.util.Scanner;

public class AdminAddProductUi {
public void AdminAddProduct(Admin o,ProductDatabase pdb) throws IOException
{
	System.out.println("Enter product Name");
	Scanner brandN=new Scanner(System.in);
	String brann=brandN.nextLine(); 
	
	System.out.println("Enter product Serial number");

                Scanner brandNum=new Scanner(System.in);             
                int brandnum=brandNum.nextInt(); 
                

	
	System.out.println("Enter product category");
	Scanner brandCategory=new Scanner(System.in);
	String brandcategory=brandCategory.nextLine(); 
                
                
                System.out.println("Enter brand name");
	String brandName=brandCategory.nextLine(); 
	

	 
	Product product=new Product(brann,brandnum,0,brandcategory,0,brandName);
	o.addProduct(product, pdb);
}
}
