public class Product {
    private String name;
    private String brand;
    private double price;

    public Product() {
        this("Unknown", "Unknown", 0.0);
    }
    public Product(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return name + " (" + brand + "), $" + price;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Продукт " + name + " удален из памяти.");
        super.finalize();
    }
}
