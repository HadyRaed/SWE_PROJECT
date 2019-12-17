
import java.util.ArrayList;

public class StoreOwnerUndoController {

    public void UndoAdd(Store store, StoreOwnerController s, String storename, String productname, ArrayList<Store> stores, Product z, History history) {
        for (int i = 0; i < history.AddedProduct.size(); i++) {
            if (productname.contentEquals(history.AddedProduct.get(i).getProductName())) {
                store.deletePdsInStore(s, storename, productname,stores, z);
            }
        }
    }

    public void UndoEdit(Store store, StoreOwnerController s, String storename, String productname, ArrayList<Store> stores, Product z, History history) {
        double oldPrice=0;
        String old=null;
        boolean flag=false;
        for (int i = 0; i < history.editedProduct.size(); i++) {
            if (productname.contentEquals(history.editedProduct.get(i).getProductName())) {
               flag=true;
            old=history.editedProduct.get(i).getProductName();  
                    }
        }
        for (int i=0;i<history.oldPrices.size();i++)
        {
        if (old.contentEquals(history.oldPrices.get(i).getProductName()))
        {
        oldPrice=history.oldPrices.get(i).getPrice();
        
        }
    if (flag==true)
        store.editPdsInStore(s, storename, productname, oldPrice, stores, history);
    }
}}