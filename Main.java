import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BottleOfWater bottleOfWater1 = new BottleOfWater("cola", 100, 1.0);
        BottleOfWater bottleOfWater2 = new BottleOfWater("pepsi", 200, 1.5);
        BottleOfWater bottleOfWater3 = new BottleOfWater("fanta", 250, 1.5);
        BottleOfWater bottleOfWater4 = new BottleOfWater("sprite", 260, 1.5);
        HotDrink hotDrink1 = new HotDrink("coffee", 250, 200, 90);
        HotDrink hotDrink2 = new HotDrink("latte", 300, 200, 90);
        HotDrink hotDrink3 = new HotDrink("cacao", 200, 200, 90);

        List<Product> productList1 = new ArrayList<>();
        List<Product> productList2 = new ArrayList<>();

        productList1.add(bottleOfWater1);
        productList1.add(bottleOfWater2);
        productList1.add(bottleOfWater3);
        productList1.add(bottleOfWater4);

        productList2.add(hotDrink1);
        productList2.add(hotDrink2);
        productList2.add(hotDrink3);

        BottleOfWaterVendingMachine vendingMachine1 = new BottleOfWaterVendingMachine();
        HotDrinkVendingMachine vendingMachine2 = new HotDrinkVendingMachine();
        vendingMachine1.initProduct(productList1);
        vendingMachine2.initProduct(productList2);

        System.out.println(vendingMachine1.getProduct("cola"));
        System.out.println(vendingMachine2.getProduct("cacao"));

    }
}
