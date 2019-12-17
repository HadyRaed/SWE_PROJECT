
public class AdminStats {

    private int sumOfUsers;
    private int sumOfProducts;
    private int maxBought;
    private int minBought;

    public int getSumOfUsers() {
        return sumOfUsers;
    }

    public int getSumOfProducts() {
        return sumOfProducts;
    }

    public void setSumOfUsers(CustomerDatabase cd) {
        sumOfUsers = cd.getCounter();
    }

    public void setSumOfProducts(ProductDatabase pd) {
        sumOfProducts = pd.getCounter();
    }
}
