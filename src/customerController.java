
public class customerController {

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
		}

		else {
			System.out.println("Login failed");
			return false;

		}
	}
}