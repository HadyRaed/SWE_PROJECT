
import java.util.ArrayList;
import java.util.List;


public class History {
 ArrayList<Product> AddedProduct = new ArrayList<>();
   ArrayList<Product> editedProduct = new ArrayList<>();
   ArrayList<Product> oldPrices = new ArrayList<>();

    public void setAddedProduct(ArrayList<Product> AddedProduct) {
        this.AddedProduct = AddedProduct;
    }

    public void setEditedProduct(ArrayList<Product> editedProduct) {
        this.editedProduct = editedProduct;
    }

    public void setOldPrices(ArrayList<Product> oldPrices) {
        this.oldPrices = oldPrices;
    }

  
   
}
