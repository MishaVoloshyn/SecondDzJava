import java.util.ArrayList;
import java.util.List;

public class OnlineStore {
    private List<User> users;
    public OnlineStore() {
        users = new ArrayList<>();
    }
    public void addUser(User user) {
        users.add(user);
    }
    public List<User> getUsers() {
        return users;
    }
    public static void purchaseAll(Purchasable[] items) {
        for (Purchasable item : items) {
            item.purchase();
        }
    }

    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();
        PhysicalProduct phone = new PhysicalProduct("iPhone", "Apple", 999, 0.5);
        DigitalProduct game = new DigitalProduct("Cyberpunk 2077", "CDPR", 59, "ABC-123-XYZ");

        Cart cart1 = new Cart();
        cart1.addProduct(phone);
        cart1.addProduct(game);

        User user1 = new User("Alex", 1);
        user1.addCart(cart1);
        store.addUser(user1);

        Purchasable[] items = { phone, game };
        OnlineStore.purchaseAll(items);
    }
}
