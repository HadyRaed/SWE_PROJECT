
import java.util.Scanner;

public class StoreOwnerBuyController {

    static int ProductCounter=0;
    public boolean validateSearch(StoreOwner storeowner, ProductDatabase pdb, Product product, StoreOwnerBuyController sobc, int givenQuantity) {

        if (pdb.searchProduct(product) != -1) {
            sobc.Buy(givenQuantity, pdb.searchProduct(product), storeowner,product);
            return true;
        } else {
            return false;
        }

    }
//enter quantity he wants to buy

    public boolean Buy(int givenQuantity, int wanted, StoreOwner storeowner,Product product) {

       // Scanner y = new Scanner(System.in);
        //int z = y.nextInt();
     
        if (givenQuantity > wanted) {
            return false;
        } else {
            double newPrice=product.getPrice()*0.15;
            
            if (givenQuantity>=2)
            {
            newPrice+=newPrice*0.10;
            }
            if (ProductCounter>=0)
            {
            newPrice+=newPrice*0.05;
            ProductCounter++;
            }
            
            return true;
            //enter shipping adress

        }
    }
}
