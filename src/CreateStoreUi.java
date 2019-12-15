
import java.util.Scanner;

public class CreateStoreUi {

    Scanner x = new Scanner(System.in);

    public void CreateStore(StoreOwner storeOwnerii,StoreOwnerController sc) {
        System.out.println("Enter Store Name");
        String storeName = x.next();

        System.out.println("Enter Store Location");
        String storeLocation = x.next();

        System.out.println("Enter store category");
        String storeCategory = x.next();

        Store store = new Store(storeName, storeLocation, storeCategory);

        storeOwnerii.addStore(store,sc);
    }
}
