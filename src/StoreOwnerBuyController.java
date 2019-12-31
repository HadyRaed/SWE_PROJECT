
import java.util.Scanner;

public class StoreOwnerBuyController {

    static int ProductCounter=0;
    public int validateSearch(StoreOwner storeowner, ProductDatabase pdb, Product product, StoreOwnerBuyController sobc, int givenQuantity) {

        if (pdb.searchProduct(product) != -1) {
            if(sobc.Buy(givenQuantity, pdb.searchProduct(product), storeowner,product)==1)
             {return 1;}
          
            else if(sobc.Buy(givenQuantity, pdb.searchProduct(product), storeowner,product)==2)
            {
              return 2;
            }
              else if(sobc.Buy(givenQuantity, pdb.searchProduct(product), storeowner,product)==3)
            {
              return 3;
            }
        
        
        
         }
return -1;
    }
//enter quantity he wants to buy

    public int Buy(int givenQuantity, int wanted, StoreOwner storeowner,Product product) {

       // Scanner y = new Scanner(System.in);
        //int z = y.nextInt();
     
        if (givenQuantity > wanted) {
            return -1;
        } else {
            double newPrice=product.getPrice()*0.15;
            
            if (givenQuantity>=2)
            {
            newPrice+=newPrice*0.10;
            return 1;
            }
            if (ProductCounter>=0)
            {
            newPrice+=newPrice*0.05;
            ProductCounter++;
            return 2;
            }
            
            return 3;
            //enter shipping adress

        }
    }
}
