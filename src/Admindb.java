


import java.util.ArrayList;

public class Admindb {

    ArrayList<Admin> admins = new ArrayList<>();

    Admin admin1 = new Admin("999", "1999");
    Admin admin2 = new Admin("888", "1888");

    {
        admins.add(admin1);
        admins.add(admin2);
    }

    /**
     *
     * @param admin
     * @return
     */
    public boolean searchUser(Admin admin) {

        int x = 0;
        for (Admin admin3 : admins) {
            if (admin.getId().contentEquals(admin3.getId()) && admin.getPassword().contentEquals(admin3.getPassword())) {
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
