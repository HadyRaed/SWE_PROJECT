import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		CustomerDatabase cdb = new CustomerDatabase();
		StoreOwnerDatabase sdb = new StoreOwnerDatabase();
		
		SignupUi Signup = new SignupUi();
		LoginUi Login = new LoginUi();
		AdminLoginUi AdminLogin = new AdminLoginUi();

		while (true) {

			System.out.println("Press 1 for signup");
			System.out.println("Press 2 for login");
			System.out.println("Press 3 for admin login");
			Scanner x = new Scanner(System.in);
			int y = x.nextInt();

			switch (y) {

			case 1:

				System.out.println("1- Signup as a Customer");
				System.out.println("2- Signup as a Store Owner");
				int j = x.nextInt();
				switch (j) {
				case 1:

					Signup.showSignupFormC(cdb);

					break;
				case 2:
					Signup.showSignupFormS(sdb);

					break;
				}
				break;

			case 2:
				System.out.println("1- Login as a customer");
				System.out.println("2- Login as a storeowner");

				int f = x.nextInt();

				switch (f) {
				case 1:

					Login.showLoginFormC(cdb);

					break;
				case 2:
					Login.showLoginFormS(sdb);
				}
				break;

			case 3:
				AdminLogin.ShowAdminLoginForm();

			}

		}
	}
}
