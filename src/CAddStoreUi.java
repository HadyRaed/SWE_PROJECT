import java.util.Scanner;

public class CAddStoreUi {
	Scanner x = new Scanner(System.in);
	public void AddStore(Customer customerii)
	{
        
        System.out.println("Enter Store Name");
	String storeName=x.next(); 

       System.out.println("Enter store category");
	String storeCategory=x.next(); 
	

	
	
	Store store=new Store(storeName,"Online",storeCategory);
	
               customerii.addStore(store);
	}
}
