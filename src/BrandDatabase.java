import java.util.ArrayList;

public class BrandDatabase {

	ArrayList<Brand> brands = new ArrayList<>();

	public void add(Brand b) {
		brands.add(b);
	}

	/**
	 *
	 * @param target
	 * @return
	 */
	public boolean CheckBrandName(String target) {

		if (brands.isEmpty()) {
			return false;
		}

		for (Brand brand : brands) {
			if (target.contentEquals(brand.getBrandName())) {
				return true;
			}
		}
		return false;
	}
}
