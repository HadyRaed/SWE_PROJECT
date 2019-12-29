


import java.util.Scanner;

public class AdminAddBrandUi {

    public void AdminAddBr(AdminController ac, BrandDatabase bdb) {
        System.out.println("Enter brand Name");
        Scanner brandN = new Scanner(System.in);
        String brann = brandN.nextLine();

        System.out.println("Enter brand category");
        Scanner brandNum = new Scanner(System.in);
        String brandCat = brandNum.nextLine();

        if (ac.validateBrand(brann, bdb) == false) {
            Brand brand = new Brand(brann, brandCat);
            ac.addBrand(brand, bdb);
            System.out.print("Brand is added \n \n");

        } else {
            System.out.println("Brandname already exists \n \n");
        }
    }

}
