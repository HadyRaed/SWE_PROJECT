
import java.util.Scanner;

public class BuyUi {

    public void buy(ProductDatabase pdb, Customer customerii, CustomerController cc) {
        System.out.println("Enter prodcut name");
        Scanner x = new Scanner(System.in);
        String prdName = x.next();
        Product z = new Product(prdName, 0, 0, null, 0, null);
        System.out.println("Enter Quantity needed");
        int givenQuantity=x.nextInt();
        cc.validateSearch(customerii, pdb, z, cc,givenQuantity);

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
