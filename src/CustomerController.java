
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

    public boolean validateSearch(Customer x, ProductDatabase pdb, Product product, CustomerController cc, int wantedQuantity) {
        if (pdb.searchProduct(product) != -1) {

            if (cc.Buy(wantedQuantity, pdb.searchProduct(product), x)) {

                return true;
            }

        }
        return false;
    }

    public boolean Buy(int wantedQuantity, int stock, Customer cust) {

        if (wantedQuantity > stock) {
            return false;
        } else {
            double newPrice = 1;

            if (wantedQuantity >= 2) {
                newPrice += newPrice * 0.10;
            }
            return true;

        }
    }
}
