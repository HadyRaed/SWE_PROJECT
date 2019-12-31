
import java.util.ArrayList;

public class CollaboratorController {

    public void addProductsCollab(StoreOwnerController soc, String productname, StoreOwner s, Product product, ProductDatabase pdb, History history) {
        soc.addPdsInStore(productname, s.storesOfStoreOwner, product, pdb);
        history.AddedProduct.add(product);

    }

    public Product editProductsCollab(StoreOwnerController soc, String storename, String productname, int price, StoreOwner s, History history) {
        if (soc.editPdsInStore(storename, productname, price, s.storesOfStoreOwner, history) != null) {
            history.editedProduct.add(soc.editPdsInStore(storename, productname, price, s.storesOfStoreOwner, history));
            return soc.editPdsInStore(storename, productname, price, s.storesOfStoreOwner, history);
        }
        return null;
    }

}
