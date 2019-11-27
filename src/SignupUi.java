import java.util.Scanner;

public class SignupUi {

	Scanner x = new Scanner(System.in); 
	
	public void showSignupFormC(CustomerDatabase cdb)
	{
	    
        System.out.println("Enter your name");
        String Name=x.next(); 

System.out.println("Enter your pass");
String Pass=x.next(); 

System.out.println("Enter your mail");
String Mail=x.next(); 

        Customer customeri=  new Customer(Name,Pass,Mail);
customerController c=new customerController();
        c.validateRegister(customeri, cdb);
             
	}
	
	
	public void showSignupFormS(StoreOwnerDatabase sdb)
	{
		 System.out.println("Enter your Storename");
         String Name1=x.next(); 
	
	System.out.println("Enter your pass");
	String Pass1=x.next(); 
	
	System.out.println("Enter your mail");
	String Mail1=x.next(); 
	
         StoreOwner storeOwneri=  new StoreOwner(Name1,Pass1,Mail1);
	storeOwnerController s = new storeOwnerController ();
         s.validateRegister(storeOwneri, sdb);
	}
	
	
	
	
	
	
	
	
	
	
	
}
