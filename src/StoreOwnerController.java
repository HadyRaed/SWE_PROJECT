
import java.util.ArrayList;


public class StoreOwnerController {

   

    public boolean validateRegister(StoreOwner x, StoreOwnerDatabase sdb) {

        return sdb.addStoreOwner(x) ;
         
    }

    public boolean validateLogin(StoreOwner x, StoreOwnerDatabase sdb) {

        if (sdb.searchStoreOwner(x) == true) {
            return true;
        } else {
            return false;
        }
    }

    public Store validateStore(StoreOwner x, String storeName) {
        if (x.storesOfStoreOwner.size() == 0) {

            return null;
        } else {
            for (int i = 0; i < x.storesOfStoreOwner.size(); i++) {
                if (storeName.contentEquals(x.storesOfStoreOwner.get(i).getStoreName())) {

                    return x.storesOfStoreOwner.get(i);

                }

            }
        }
        return null;
    }

    public boolean addStore(Store x, ArrayList<Store> storesOfStoreOwner) {
        boolean flag = true;

      
            for (int i = 0; i < storesOfStoreOwner.size(); i++) {
                if (storesOfStoreOwner.get(i).getStoreName().contentEquals(x.getStoreName())) {
                    flag = false;
                    return false;
                }}

            
        
        if (flag == true) {
            storesOfStoreOwner.add(x);
            
            return true;
        
        }
return false;
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

    public Product editPdsInStore(String storename, String productname, double price, ArrayList<Store> stores,History history) 
    {
        Product prd=null;
        for (int i = 0; i < stores.size(); i++) 
        {
            if (storename.contentEquals(stores.get(i).getStoreName())) {
                for (int j = 0; j < (stores.get(i).prds.size()); j++) {
                    if (productname.contentEquals(stores.get(i).prds.get(j).getProductName()))
                    {
                        history.oldPrices.add(stores.get(i).prds.get(j));
                        stores.get(i).prds.get(j).setPrice(price);
                        prd=stores.get(i).prds.get(j);
                           return prd;

                    }
                }
            }
        }
    return null;
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


