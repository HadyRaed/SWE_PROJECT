
import java.util.Scanner;

public class ExistingStoreProductUi {

    Scanner x = new Scanner(System.in);

    public void AddStoreProducts(StoreOwner storeOwnerii, StoreOwnerController ss, AdminController ac, BrandDatabase bdb, ProductDatabase pdb,String storename) {
        System.out.println("Enter product Name");

        String prdctName = x.next();

            int SerialNum = 0;
        boolean flag = false;
        while (flag == false) {
            System.out.println("Enter product Serial number");
            Scanner Intscanner = new Scanner(System.in);

            if (Intscanner.hasNextInt()) {
                SerialNum = Intscanner.nextInt();
                flag = true;
            } else {
                System.out.println("Please enter a Number");
            }

        }

        System.out.println("Enter product category");
        String prdctCat = x.next();

             int Stock = 0;
        boolean flag1 = false;
        
        while (flag1 == false) {
            System.out.println("Enter Stock");
            Scanner Inttscanner = new Scanner(System.in);

            if (Inttscanner.hasNextInt()) {
                SerialNum = Inttscanner.nextInt();
                flag1 = true;
            } else {
                System.out.println("Please enter a Number");
            }

        }

        System.out.println("Enter Brand Name");
        String brndName = x.next();
        Product product = new Product(prdctName, SerialNum, 0, prdctCat,Stock, brndName);

        if (ac.validateBrand(brndName, bdb)||ac.validateProduct( product, pdb)) 
        {
            storeOwnerii.addPds(ss, storename, product, pdb);
            System.out.println("Product is added");
        }
         
        else if ((!ac.validateBrand(brndName, bdb)) && ac.validateProduct( product, pdb) == false) {
         System.out.println("There is a problem, pleae check your data");
        }}}

    







