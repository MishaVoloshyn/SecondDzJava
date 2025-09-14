public abstract class Product implements Purchasable {
    private static int counter = 0;
    private int id;
    private String name;
    private String brand;
    private double price;

    public Product(String name, String brand, double price) {
        this.id = ++counter;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getBrand() { return brand; }
    public double getPrice() { return price; }
    @Override
    public String toString() {
        return "#" + id + " " + name + " (" + brand + "), $" + price;
    }
    public abstract String getInfo();
    @Override
    public void purchase() {
        System.out.println("Покупка продукта: " + name + " за $" + price);
    }
}

