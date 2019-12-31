
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

    public boolean addStore(Store x, StoreOwnerController sc) {
        if(sc.addStore(x, storesOfStoreOwner))
        {return true;}
        else return false;
    }

    public void addPds(StoreOwnerController stc, String y, Product p, ProductDatabase pd) {
         stc.addPdsInStore(y, storesOfStoreOwner, p, pd);
}

    public void addcollab(StoreOwnerController stc, String StoreName, Collaborator c) {
        stc.addcollabs(StoreName, storesOfStoreOwner, c);
    }

}
