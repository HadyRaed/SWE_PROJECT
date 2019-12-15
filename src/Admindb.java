
import java.util.ArrayList;

public class Admindb {

    ArrayList<Admin> admins = new ArrayList<Admin>();

    Admin admin1 = new Admin("999", "1999");
    Admin admin2 = new Admin("888", "1888");

    {
        admins.add(admin1);
        admins.add(admin2);
    }

    public boolean searchUser(Admin admin) {

        int x = 0;
        for (int i = 0; i < admins.size(); i++) {
            if (admin.getId().contentEquals(admins.get(i).getId())
                    && admin.getPassword().contentEquals(admins.get(i).getPassword())) {

                x = 1;

            }

        }
        if (x == 1) {

            System.out.println("Welcome back");
            return true;
        } else {
            System.out.println("Login failed");
            return false;
        }
    }
}
