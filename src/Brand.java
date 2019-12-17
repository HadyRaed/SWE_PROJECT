
public class Brand {

    private String brandCategory;
    private String brandName;

    Brand(String brandName, String brandCategory) {

        this.brandCategory = brandCategory;
        this.brandName = brandName;
    }

    String getbrandCatgory() {
        return brandCategory;
    }

    String getBrandName() {
        return brandName;
    }

}
