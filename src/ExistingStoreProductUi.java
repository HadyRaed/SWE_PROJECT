
import java.util.Scanner;

public class ExistingStoreProductUi {

    Scanner x = new Scanner(System.in);

    public void AddStoreProducts(StoreOwner storeOwnerii, StoreOwnerController ss, AdminController ac, BrandDatabase bdb, ProductDatabase pdb,String storename) {
        System.out.println("Enter product Name");

        String prdctName = x.next();

        System.out.println("Enter product Serial number");

        int prdctNo = x.nextInt();

        System.out.println("Enter product category");
        String prdctCat = x.next();

        System.out.println("Enter product Stock");
        int prdctStock = x.nextInt();

        System.out.println("Enter Brand Name");
        String brndName = x.next();
        Product product = new Product(prdctName, prdctNo, 0, prdctCat, prdctStock, brndName);

        if (ac.validateBrand(brndName, bdb) && ac.validateProduct(storeOwnerii.storesOfStoreOwner.get(0), product, pdb)) {
            
            storeOwnerii.addPds(ss, storename, product, pdb);
            System.out.println("Product is added");
        } else if (ac.validateBrand(brndName, bdb) == false || ac.validateProduct(storeOwnerii.storesOfStoreOwner.get(0), product, pdb) == false) {
            System.out.println("There is a problem, pleae check your data");
        }

    }
}
