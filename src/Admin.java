



public class Admin {

    private String ID;
    private String password;

    Admin(String ID, String password) {
        this.ID = ID;
        this.password = password;
    }

    String getId() {
        return ID;

    }

    String getPassword() {
        return password;

    }

   

    public boolean login(Admin admin1, Admindb adminlogin) {
        boolean y = adminlogin.searchUser(admin1);
        if (y) {
            return true;
        } else {
            return false;
        }
    }

   

}
