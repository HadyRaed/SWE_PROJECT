import java.io.IOException;
import java.util.Scanner;

public class AdminLoginUi {
	Admindb adb = new Admindb();
	ProductDatabase pdb = new ProductDatabase();
    brandDatabase bdb = new brandDatabase();
    adminController ac =new adminController();
    AdminAddProductUi AdminProduct =new AdminAddProductUi();
    AdminAddBrandUi  AdminBrand=new AdminAddBrandUi();
	public void ShowAdminLoginForm() throws IOException
	{
		System.out.println("Enter your Id");
		Scanner z=new Scanner(System.in);
		String AdminId=z.nextLine(); 
		
		System.out.println("Enter your pass");
		Scanner c=new Scanner(System.in);
		String AdminPass=c.nextLine(); 
		
		Admin o=new Admin(AdminId,AdminPass);		
		 boolean flag;
		flag = o.login(o, adb);
                   while (flag)
		{
			System.out.println("To add more products press 1");
                        System.out.println("To add more brands press 2");
                        System.out.println("To exit press 3");
			Scanner p = new Scanner (System.in);
			int adminInput = p.nextInt();
					
                        if (adminInput==1)
			{
                        	AdminProduct.AdminAddProduct(o, pdb);
                   }
                        
                        else if (adminInput==2)
			{
                        	AdminBrand.AdminAddBr(ac, o, bdb);
		}
                        else if(adminInput==3)
                        {
                        flag=false;
                        
                        
                        }
                        else { System.exit(0);}
                        
                        
                        
		}
	}
	
}
