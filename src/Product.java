
public class Product {

    private String productName;
    private int serialNumber;
    private double price;
    private String category;
    private String brandName;
    private int Stock;

    Product(String productName, int serialNumber, int price, String category, int Stock, String brandName) {
        this.productName = productName;
        this.serialNumber = serialNumber;
        this.price = price;
        this.category = category;
        this.Stock = Stock;
        this.brandName = brandName;
    }

    String getProductName() {

        return productName;
    }
     public void setPrice(double price) {

        this.price=price;
    }

    int getSerialNumber() {
        return serialNumber;
    }

    double getPrice() {
        return price;
    }

    int getStock() {
        return Stock;
    }

    String getCatgory() {
        return category;
    }

}
