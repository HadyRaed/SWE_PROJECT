
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Store extends TimerTask {

    private String storeName;
    private String storeType;
    private String storeLocation;
    private String storeCategory;
    private Statistics stats;
    ArrayList<Product> prds = new ArrayList<>();
    ArrayList<Collaborator>collabs= new ArrayList<>();

    Store() {
        stats = new Statistics();
    }

    Store(String storeName, String storeLocation, String storeCategory) {
        this.storeName = storeName;
        this.storeLocation = storeLocation;
        this.storeCategory = storeCategory;
        Timer timer = new Timer();
        timer.schedule(new Store(), 0, 60000);
    }

    public String getStoreName() {
        return storeName;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public String getStoreCategory() {
        return storeCategory;
    }
public void set(String storeName, String storeLocation, String storeCategory)
{
        this.storeName = storeName;
        this.storeLocation = storeLocation;
        this.storeCategory = storeCategory;
}

    public boolean addProductInStore(Product p, ProductDatabase pd) {

        if (pd.searchProduct(p) != -1) {
            prds.add(p);
            return true;
        } else {
            return false;
        }
    }
    public void editPdsInStore(StoreOwnerController s,String storename, String productname, double price, ArrayList<Store> stores,History history)
    {
    s.editPdsInStore(storename,productname,price,stores,history);
    }
     public void deletePdsInStore(StoreOwnerController s,String storename, String productname, ArrayList<Store> stores, Product z)
    {
    s.deletePdsInStore(storename,productname,stores,z);
    }

    @Override
    public void run() {
        System.out.println(stats.getNumOfProducts());
        System.out.println(stats.getNumOfView());
        System.out.println(stats.getSoldOutProducts());
    }
}

