import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List<Product> productList = new ArrayList<>();

    @Override
    public void initProduct(List<Product> productList) {
        this.productList = productList;

    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public Product getProduct(String name, double volume, double temp) {
        for (Product product : productList) {
            if (product.getName().equals(name) && ((BottleOfWater) product).getVolume() == volume
                    && ((HotDrink) product).getTemp() == temp) {
                return product;
            }
        }
        return null;
    }
}
