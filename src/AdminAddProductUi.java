


import java.io.IOException;
import java.util.Scanner;

public class AdminAddProductUi {

    public void AdminAddProduct(AdminController ac, ProductDatabase pdb, BrandDatabase bdb) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product Name");
        

        String productName = scanner.nextLine();

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
        String productCategory = scanner.nextLine();

        System.out.println("Enter brand name");
        String brandName = scanner.nextLine();

        System.out.println("Enter Stock");
        int stock=scanner.nextInt();
        
        Product product = new Product(productName, SerialNum, 0, productCategory,stock , brandName);
        if (ac.addProduct(product, pdb, bdb)) {
            System.out.println("Product is added Successfully\n");
        } else {
            System.out.print("The product name already exists or the brand doesn't exist, try again \n \n");
        }
    }
}
