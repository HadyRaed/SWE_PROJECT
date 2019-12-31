
import java.util.Scanner;

public class CAddStoreUi {

    Scanner x = new Scanner(System.in);

    public void AddStore(Customer customerii, CustomerController cc) {

        System.out.println("Enter Store Name");
        String storeName = x.next();

        System.out.println("Enter store category");
        String storeCategory = x.next();

        Store store = new Store(storeName, "Online", storeCategory);

        if (customerii.addStore(store, cc)) {
            System.out.println("Store is added");
        } else {
            System.out.println("Can't add");
        }
    }
}
