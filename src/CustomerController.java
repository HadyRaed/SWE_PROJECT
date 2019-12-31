
import java.util.ArrayList;
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

    public int validateSearch(Customer x, ProductDatabase pdb, Product product, CustomerController cc, int wantedQuantity) {
        if (pdb.searchProduct(product) != -1) {

            if (cc.Buy(wantedQuantity, pdb.searchProduct(product), x)==1) {

                return 1;
            }
                     if (cc.Buy(wantedQuantity, pdb.searchProduct(product), x)==2) {

                return 2;
            }

        }
        return -1;
    }

    public int Buy(int wantedQuantity, int stock, Customer cust) {

        if (wantedQuantity > stock) {
            return -1;
        } else {
            double newPrice = 1;

            if (wantedQuantity >= 2) {
                newPrice += newPrice * 0.10;
                return 1;
            }
           return 2;

        }
    }
public boolean addStore(Store x,ArrayList<Store> onlinestores) {
        boolean flag = true;

       
            for (int i = 0; i < onlinestores.size(); i++) {
                if (onlinestores.get(i).getStoreName().contentEquals(x.getStoreName())) {
                    flag=false;

                }

            }
        
        if (flag == true) {
            onlinestores.add(x);
            return true;
        }
return false;    
}


}
