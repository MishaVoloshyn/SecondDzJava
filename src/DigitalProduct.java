public class DigitalProduct extends Product {
    private String licenseKey;

    public DigitalProduct(String name, String brand, double price, String licenseKey) {
        super(name, brand, price);
        this.licenseKey = licenseKey;
    }

    public String getLicenseKey() { return licenseKey; }

    @Override
    public String getInfo() {
        return super.toString() + ", ключ активации: " + licenseKey;
    }

    @Override
    public void purchase() {
        System.out.println("Цифровой продукт куплен: " + getInfo());
    }
}
