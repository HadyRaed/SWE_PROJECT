
import java.util.ArrayList;

public class ObjectCollector {

    Store store;
    StoreOwnerController s;
    String storename;
    String productname;
    ArrayList<Store> stores;
    Product z;
    History history;

    public void setStore(Store store) {
        this.store = store;
    }

    public void setS(StoreOwnerController s) {
        this.s = s;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setStores(ArrayList<Store> stores) {
        this.stores = stores;
    }

    public void setZ(Product z) {
        this.z = z;
    }

    public void setHistory(History history) {
        this.history = history;
    }

}
