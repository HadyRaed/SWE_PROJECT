
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

    public boolean validateSearch(Customer x, ProductDatabase pdb, Product product, CustomerController cc,int givenQuantity) {

        if (pdb.searchProduct(product) != -1) {
            cc.Buy(givenQuantity,pdb.searchProduct(product), x);
            return true;
        } else 
            return false;
    }

    public boolean Buy(int givenQuantity,int wanted, Customer cust) {
       

        if (givenQuantity> wanted) {
            return false;
        } else {
            double newPrice=1;
            if (givenQuantity>=2)
            {
            newPrice+=newPrice*0.10;
            }
            return true;

        }

    }
}
