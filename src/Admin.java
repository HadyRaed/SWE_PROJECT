import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {

	private String ID;
	private String password;
        AdminStats as = new AdminStats();

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

	public void addBrand(Brand brand, BrandDatabase bd) {
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

        public void CreateStat(CustomerDatabase cd,ProductDatabase pd)
	{
	as.setSumOfUsers(cd);
        as.setSumOfProducts(pd);
	}

}