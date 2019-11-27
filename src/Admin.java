import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

	public void addProduct(Product product, ProductDatabase pd) throws IOException {
		pd.add(product);

	}

	public void addBrand(Brand brand, brandDatabase bd) {
		bd.add(brand);

	}

	public boolean login(Admin admin1, Admindb adminlogin) {
		boolean y = adminlogin.searchUser(admin1);
		if (y) {
			return true;
		} else {
			return false;
		}
	}
	public void CreateStat()
	{
		System.out.println("1- user");
		System.out.println("2- products");
		System.out.println("3- offers");
		Scanner x = new Scanner(System.in);
		int f=x.nextInt();
		switch(f) {
		case 1:
			System.out.println(new CustomerDatabase().getCounter());
		}
	
	}

}
