
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

    public void addStore(Store x) {
        boolean flag = false;

        if (onlinestores.size() == 0) {
            onlinestores.add(x);
            flag = true;
            System.out.println("Your Store has been added successfully");

        } else {
            for (int i = 0; i < onlinestores.size(); i++) {
                if (onlinestores.get(i).getStoreName().contentEquals(x.getStoreName())) {
                    flag = true;
                    System.out.println("You have a store with the same name");
                    break;

                }

            }
        }
        if (flag == false) {
            onlinestores.add(x);
            System.out.println("Your Store has been added successfully");

        }
    }

}
