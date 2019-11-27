
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hady
 */
public class storeOwnerController {
	public void validateRegister(StoreOwner x, StoreOwnerDatabase sdb) {

		if (sdb.addStoreOwner(x) == true) {
			System.out.println("Registered Successfully");
		} else {
			System.out.println("This Username already exists");
		}
	}

	public boolean validateLogin(StoreOwner x, StoreOwnerDatabase sdb) {

		if (sdb.searchStoreOwner(x) == true) {
			System.out.println("Logged in successfully");
			return true;
		} else {
			System.out.println("Login failed");
			return false;
		}
	}

	public boolean validateStore(StoreOwner x, String storeName)

	{
		if (x.storesOfStoreOwner.size() == 0) {
			System.out.println("dont exists");

			return false;
		} else {
			for (int i = 0; i < x.storesOfStoreOwner.size(); i++) {
				if (storeName.contentEquals(x.storesOfStoreOwner.get(i).getStoreName())) {
					System.out.println("exists");

					return true;

				}

			}
		}
		System.out.println("dont exists");
		return false;
	}
}