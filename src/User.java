import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int id;
    private List<Cart> carts;

    public User() {
        this("Anonymous", 0);
    }
    public User(String name, int id) {
        this.name = name;
        this.id = id;
        this.carts = new ArrayList<>();
    }
    public void addCart(Cart cart) {
        carts.add(cart);
    }
    public List<Cart> getCarts() {
        return carts;
    }
    @Override
    public String toString() {
        return "User{" + "name='" + name + "', id=" + id + ", carts=" + carts + '}';
    }
}
