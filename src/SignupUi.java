
import java.util.Scanner;

public class SignupUi {

    Scanner x = new Scanner(System.in);

    public void showSignupFormC(CustomerDatabase cdb) {

        System.out.println("Enter your name");
        String Name = x.next();

        System.out.println("Enter your pass");
        String Pass = x.next();

        System.out.println("Enter your mail");
        String Mail = x.next();

        Customer customeri = new Customer(Name, Pass, Mail);
        CustomerController c = new CustomerController();
        c.validateRegister(customeri, cdb);

    }

    public void showSignupFormS(StoreOwnerDatabase sdb) {
        System.out.println("Enter your Storename");
        String Name1 = x.next();

        System.out.println("Enter your pass");
        String Pass1 = x.next();

        System.out.println("Enter your mail");
        String Mail1 = x.next();

        StoreOwner storeOwneri = new StoreOwner(Name1, Pass1, Mail1);
        StoreOwnerController s = new StoreOwnerController();
       if ( s.validateRegister(storeOwneri, sdb))
       {
       System.out.println("Registered Successfully");
       }
       else {
       System.out.println("Can't register");
       }
    }

}
