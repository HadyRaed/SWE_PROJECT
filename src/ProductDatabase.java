
import java.util.ArrayList;

public class ProductDatabase {

    ArrayList<Product> products = new ArrayList<>();
    int Counter = 0;

    public boolean add(Product p, BrandDatabase bdb) {

        if (searchProduct(p) == -1) {
            if (bdb.CheckBrandName(p.getBrandName())) {
                products.add(p);
                Counter++;
                return true;

            }
        }
        return false;
    }

    public int getCounter() {
        return Counter;
    }

    public int searchProduct(Product product) {
        int x = 0;
        int y = 0;
        if (products.size() == 0) {

            return -1;
        } else {
            for (int i = 0; i < products.size(); i++) {
                if (product.getProductName().contentEquals(products.get(i).getProductName())) {

                    x = 1;
                    y = product.getStock();

                }
            }
            if (x == 1) {
                return y;

            } else {

                return -1;
            }
        }
    }

}
