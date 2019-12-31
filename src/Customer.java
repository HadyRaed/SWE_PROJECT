
import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends User {

    ArrayList<Store> onlinestores = new ArrayList<>();
    ArrayList<String> Cart = new ArrayList<>();
    private int Age;

    Customer(String userName, String password, String email) {
        super(userName, password, email);

        // TODO Auto-generated constructor stub
    }

    public int getAge() {
        return Age;
    }

    public void register(Customer customer1, CustomerDatabase customerReg) {
        customerReg.addCustomer(customer1);

    }

    public void login(Customer customer1, CustomerDatabase customerlogin) {
        customerlogin.searchUser(customer1);
    }

    public boolean addStore(Store x, CustomerController cc) {
        if (cc.addStore(x, onlinestores)) {
            return true;
        } else {
            return false;
        }
    }
}
