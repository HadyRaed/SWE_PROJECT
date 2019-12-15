
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
public class StoreOwnerDatabase {

    ArrayList<StoreOwner> storeOwners = new ArrayList<>();

    StoreOwnerDatabase() {
    }

    ;

	public boolean addStoreOwner(StoreOwner storeOwner) {
        int x = 0;
        if (storeOwners.size() == 0) {
            storeOwners.add(storeOwner);

            return true;
        } else {
            for (int i = 0; i < storeOwners.size(); i++) {
                if (storeOwner.getUserName().contentEquals(storeOwners.get(i).getUserName())) {
                    x = 1;

                }
            }

            if (x == 0) {
                storeOwners.add(storeOwner);

                return true;
            } else {
                return false;
            }
        }
    }

    public boolean searchStoreOwner(StoreOwner storeOwner) {
        int x = 0;
        if (storeOwners.size() == 0) {
            return false;
        } else {
            for (int i = 0; i < storeOwners.size(); i++) {
                if (storeOwner.getUserName().contentEquals(storeOwners.get(i).getUserName())
                        && storeOwner.getPassword().contentEquals(storeOwners.get(i).getPassword())) {

                    x = 1;

                }
            }
            if (x == 1) {

                return true;

            } else {
                return false;
            }
        }
    }

}
