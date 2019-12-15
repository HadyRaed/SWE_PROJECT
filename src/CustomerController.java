
import java.util.Scanner;

public class CustomerController {

    public void validateRegister(Customer x, CustomerDatabase cdb) {

        if (cdb.addCustomer(x) == true) {
            System.out.println("Registered Successfully");
        } else {
            System.out.println("This Username already exists");
        }
    }

    public boolean validateLogin(Customer x, CustomerDatabase cdb) {

        if (cdb.searchUser(x) == true) {

            System.out.println("Logged in successfully");
            return true;
        } else {
            System.out.println("Login failed");
            return false;

        }
    }

    public boolean validateSearch(Customer x, ProductDatabase pdb, Product product, CustomerController cc) {

        if (pdb.searchProduct(product) != -1) {
            System.out.println("aloooo");
            cc.checkStock(pdb.searchProduct(product), x);
            return true;
        } else {
            System.out.println("No Product is found");
        }
        return false;
    }

    public void checkStock(int wanted, Customer cust) {
        System.out.println("Enter the quantity you want");

        Scanner y = new Scanner(System.in);
        int z = y.nextInt();

        if (z > wanted) {
            System.out.println("not availabe in stock");
        } else {
            System.out.println("Availabe");
            System.out.println("enter the shipping address");
            String ShipA = y.next();

        }

    }
}
