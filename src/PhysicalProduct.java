public class PhysicalProduct extends Product {
    private double weight;

    public PhysicalProduct(String name, String brand, double price, double weight) {
        super(name, brand, price);
        this.weight = weight;
    }

    public double getWeight() { return weight; }

    @Override
    public String getInfo() {
        return super.toString() + ", вес: " + weight + " кг";
    }

    @Override
    public void purchase() {
        System.out.println("Физический продукт куплен: " + getInfo());
    }
}
