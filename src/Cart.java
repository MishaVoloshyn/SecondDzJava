import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart() {
        this(new ArrayList<>());
    }
    public Cart(List<Product> products) {
        this.products = products;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct(Product product) {
        products.remove(product);
    }
    public List<Product> getProducts() {
        return products;
    }
    @Override
    public String toString() {
        return "Cart{" + "products=" + products + '}';
    }
}
