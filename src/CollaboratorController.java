
import java.util.ArrayList;


public class CollaboratorController {
public void addProductsCollab(StoreOwnerController soc,String productname,ArrayList <Store> stores,Product product,ProductDatabase pdb,History history)
    {
    soc.addPdsInStore(productname, stores, product, pdb);
    history.AddedProduct.add(product);
    
    }

public void editProductsCollab(StoreOwnerController soc,String storename, String productname, int price, ArrayList<Store> stores,History history)
    {
    soc.editPdsInStore(storename, productname, price, stores,history);
    history.editedProduct.add(soc.editPdsInStore(storename, productname, price, stores,history));
    }


}               