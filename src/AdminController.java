
import java.io.IOException;

public class AdminController {

    AdminStats as = new AdminStats();

    public boolean validateBrand(String b, BrandDatabase bd) {
      
        
        return bd.CheckBrandName(b);
    }

    public boolean validateProduct( Product p, ProductDatabase pdb) {

if (pdb.searchProduct(p)!=-1)
{return true;}
else return false;
    }

    public boolean addProduct(Product product, ProductDatabase pd, BrandDatabase bd) throws IOException {
        return pd.add(product, bd);

    }

    public void addBrand(Brand brand, BrandDatabase bd) {
        bd.add(brand);

    }

    public void CreateStats(CustomerDatabase cd, ProductDatabase pd) {
        as.setSumOfUsers(cd);
        as.setSumOfProducts(pd);
    }

}
