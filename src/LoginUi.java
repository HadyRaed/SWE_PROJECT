import java.util.Scanner;

public class LoginUi {
	CAddStoreUi CAdd=new CAddStoreUi();
    BrandDatabase bdb = new BrandDatabase();
    AdminController ac =new AdminController();
    ProductDatabase pdb = new ProductDatabase();
    ExistingStoreUi ExStore=new ExistingStoreUi();
    CreateStoreUi CrStore=new CreateStoreUi();
    BuyUi buyUi=new BuyUi();
	Scanner x = new Scanner(System.in);
	public void showLoginFormC(CustomerDatabase cdb)
	{
		System.out.println("Enter your name");
		
		String Namee=x.next(); 
		
		System.out.println("Enter your password");
		
		String Pass=x.next(); 
		
		System.out.println("Enter your mail");
		String Maill=x.next(); 
		
		
		Customer customerii=new Customer(Namee,Pass,Maill);
		CustomerController cc = new CustomerController();
                if (cc.validateLogin(customerii, cdb)==true) {
                    System.out.println ("1-Add a store \n 2-Buy product");
                            int val = x.nextInt();
                    switch (val){
                    case 1:
                    CAdd.AddStore(customerii);
                    break;
                    case 2:
                    buyUi.buy(pdb,customerii,cc);
                }
                
                }
	}
	
	
	
	public void showLoginFormS(StoreOwnerDatabase sdb)
	{
		System.out.println("Enter your name");
		String Nameee=x.next(); 
		
		System.out.println("Enter your password");
		String Passs=x.next(); 
		
		System.out.println("Enter your mail");
		String Mailll=x.next(); 
		
		
		StoreOwner storeOwnerii=new StoreOwner(Nameee,Passs,Mailll);
		StoreOwnerController ss = new StoreOwnerController ();
		boolean check=true;
                        if (ss.validateLogin(storeOwnerii, sdb)){
                         while(check)
                         {  System.out.println("1-Have an existing store?\n2-Create a store \n3-Logout");

                        
                        int k=x.nextInt();
                     
                            if (k==1)
                            {
                             ExStore.ExistingStore(storeOwnerii, ss, ac, bdb, pdb);
                               
                        
                            }
                        else if(k==2)
                        {    
                        
                        CrStore.CreateStore(storeOwnerii);
                
     
                        
                        }
                        else if(k==3)
                        {
                            check=false;
                        }
		
            }}
	}

    private void Switch(int val) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	
	
	
}
