import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ProductDatabase {

	ArrayList<Product> products = new ArrayList<>();
        int Counter = 0;
	public void add(Product p) {

		products.add(p);
                Counter ++;

	}
        public int getCounter()
        {
        return Counter;
        }

	public int searchProduct(Product product) {
		int x = 0;
		int y=0;
		if (products.size() == 0) {

			return -1;
		} else {
			for (int i = 0; i < products.size(); i++) {
				if (product.getProductName().contentEquals(products.get(i).getProductName())) {

					x = 1;
					 y=product.getStock();

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
