
import java.util.ArrayList;


public class StoreOwnerController {

   

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

    public boolean validateStore(StoreOwner x, String storeName) {
        if (x.storesOfStoreOwner.size() == 0) {
            System.out.println("Don't exists");

            return false;
        } else {
            for (int i = 0; i < x.storesOfStoreOwner.size(); i++) {
                if (storeName.contentEquals(x.storesOfStoreOwner.get(i).getStoreName())) {
                    System.out.println("Exists");

                    return true;

                }

            }
        }
        System.out.println("Don't exists");
        return false;
    }

    public void addStore(Store x, ArrayList<Store> storesOfStoreOwner) {
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

    public boolean addPdsInStore(String storename, ArrayList<Store> stores, Product z, ProductDatabase pdb) {
        for (int i = 0; i < stores.size(); i++) {
            if (storename.contentEquals(stores.get(i).getStoreName())) {
                stores.get(i).addProductInStore(z, pdb);
                return true;
            }

        }
        return false;
    }

    public Product editPdsInStore(String storename, String productname, int price, ArrayList<Store> stores,History history) 
    {
        Product prd=new Product(null,0,0,null,0,null);
        for (int i = 0; i < stores.size(); i++) 
        {
            if (storename.contentEquals(stores.get(i).getStoreName())) {
                for (int j = 0; j < (stores.get(i).prds.size()); j++) {
                    if (productname.contentEquals(stores.get(i).prds.get(j).getProductName()))
                    {
                        history.oldPrices.add(stores.get(i).prds.get(j));
                        stores.get(i).prds.get(j).setPrice(price);
                        prd=stores.get(i).prds.get(j);
                    }
                }
            }
        }
   return prd;
    }

    public void deletePdsInStore( String storename, String productname, ArrayList<Store> stores, Product z) {

        for (int i = 0; i < stores.size(); i++) {
            if (storename.contentEquals(stores.get(i).getStoreName())) {
                for (int j = 0; j < (stores.get(i).prds.size()); j++) {
                    if (productname.contentEquals(stores.get(i).prds.get(j).getProductName())) {
                        stores.get(i).prds.remove(stores.get(i).prds.get(j));
                    }
                }
            }
        }

    }

    public void addcollabs(String s, ArrayList<Store> stores, Collaborator c) {
        for (int i = 0; i < stores.size(); i++) {
            if (s.contentEquals(stores.get(i).getStoreName())) {
                stores.get(i).collabs.add(c);
            }

        }
    }
}


