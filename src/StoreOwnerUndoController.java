
import java.util.ArrayList;

public class StoreOwnerUndoController {

    public void UndoAdd(Store store, StoreOwnerController s, String storename, String productname, int price, ArrayList<Store> stores, Product z, History history) {
        for (int i = 0; i < history.AddedProduct.size(); i++) {
            if (productname.contentEquals(history.AddedProduct.get(i).getProductName())) {
                store.deletePdsInStore(s, storename, productname, price, stores, z);
            }
        }
    }

    public void UndoEdit(Store store, StoreOwnerController s, String storename, String productname, int price, ArrayList<Store> stores, Product z, History history) {
        for (int i = 0; i < history.editedProduct.size(); i++) {
            if (productname.contentEquals(history.AddedProduct.get(i).getProductName())) {
                store.editPdsInStore(s, storename, productname, price, stores, history);
            }
        }
    }
}