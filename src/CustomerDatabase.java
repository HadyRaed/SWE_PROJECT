
import java.util.ArrayList;

public class CustomerDatabase {

    ArrayList<Customer> customers = new ArrayList<>();
    int Counter = 0;

    CustomerDatabase() {
    }

    ;

public int getCounter() {
        return Counter;
    }

    public boolean addCustomer(Customer customer) {
        int x = 0;
        int Counter = 0;
        if (customers.size() == 0) {
            customers.add(customer);
            return true;
        } else {
            for (int i = 0; i < customers.size(); i++) {
                if (customer.getUserName().contentEquals(customers.get(i).getUserName())) {
                    x = 1;
                    Counter++;

                }
            }

            if (x == 0) {
                customers.add(customer);
                Counter++;
                return true;
            } else {
                return false;
            }
        }

    }

    public boolean searchUser(Customer customer) {
        int x = 0;
        if (customers.size() == 0) {
            System.out.println("Login failed");
            return false;
        } else {
            for (int i = 0; i < customers.size(); i++) {
                if (customer.getUserName().contentEquals(customers.get(i).getUserName())
                        && customer.getPassword().contentEquals(customers.get(i).getPassword())) {

                    x = 1;

                }
            }
            if (x == 1) {

                return true;
            } else {

                return false;
            }
        }
    }

}
