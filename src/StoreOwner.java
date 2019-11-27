
import java.util.ArrayList;

public class StoreOwner extends User {

	ArrayList<Store> storesOfStoreOwner = new ArrayList<>();

	StoreOwner(String userName, String password, String email) {
		super(userName, password, email);
		// TODO Auto-generated constructor stub

	}

	public void register(StoreOwner storeOwner1, StoreOwnerDatabase storeOwnerReg) {
		storeOwnerReg.addStoreOwner(storeOwner1);

	}

	public void login(StoreOwner storeOwner1, StoreOwnerDatabase storeOwnerLogin) {
		storeOwnerLogin.searchStoreOwner(storeOwner1);
	}

	public void addStore(Store x) {
		boolean flag = false;

		if (storesOfStoreOwner.size() == 0) {
			storesOfStoreOwner.add(x);
			flag = true;
			System.out.println("Your Store has been added successfully");

		} else {
			for (int i = 0; i < storesOfStoreOwner.size(); i++) {
				if (storesOfStoreOwner.get(i).getStoreName().contentEquals(x.getStoreName())) {
					flag = true;
					System.out.println("You have a store with the same name");
					break;

				}

			}
		}
		if (flag == false) {
			storesOfStoreOwner.add(x);
			System.out.println("Your Store has been added successfully");
			for (int i = 0; i < storesOfStoreOwner.size(); i++) {
				System.out.println(storesOfStoreOwner.get(i));
			}
		}

	}
}
