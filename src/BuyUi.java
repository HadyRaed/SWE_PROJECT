
import java.util.Scanner;

public class BuyUi {

    public void buy(ProductDatabase pdb, Customer customerii, CustomerController cc) {
        System.out.println("Enter prodcut name");
        Scanner x = new Scanner(System.in);
        String prdName = x.next();
        Product z = new Product(prdName, 0, 0, null, 0, null);
        System.out.println("Enter Quantity needed");
        int givenQuantity=x.nextInt();
        if(cc.validateSearch(customerii,pdb,z,cc,givenQuantity)){
        System.out.println("You can checkout");
        }
        else 
        {
        System.out.println("Quantity is too high or product doesn't exist, try again");
        }

    }
     public void buyS(ProductDatabase pdb, StoreOwner storeowner, StoreOwnerBuyController sobc) {
        System.out.println("Enter prodcut name");
        Scanner x = new Scanner(System.in);
        String prdName = x.next();
        Product z = new Product(prdName, 0, 0, null, 0, null);
        System.out.println("Enter Quantity needed");
        int givenQuantity=x.nextInt();
        if(sobc.validateSearch(storeowner, pdb, z, sobc,givenQuantity))
        {System.out.println("You Got a DISCOUNT!");}
        
    }
}
