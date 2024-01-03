public class HotDrink extends BottleOfWater {
    private double temp;

    public HotDrink(String name, int cost, double volume, double temp) {
        super(name, cost, volume);
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name = '" + super.getName() + '\'' +
                ", cost = " + super.getCost() +
                ", volume = " + volume +
                ", temprature = " + temp +
                '}';
    }
}