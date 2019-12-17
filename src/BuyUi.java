
import java.util.Scanner;

public class BuyUi {

    public void buy(ProductDatabase pdb, Customer customerii, CustomerController cc) {
        System.out.println("Enter prodcut name");
        Scanner x = new Scanner(System.in);
        String prdName = x.next();
        Product z = new Product(prdName, 0, 0, null, 0, null);
        cc.validateSearch(customerii, pdb, z, cc);

    }
}
