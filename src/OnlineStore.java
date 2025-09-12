import java.util.ArrayList;
import java.util.List;

public class OnlineStore {
    private List<User> users;
    private static int initialUsers;
    private static int initialProducts;

    static {
        initialUsers = 0;
        initialProducts = 0;
        System.out.println("Инициализация OnlineStore...");
    }
    public OnlineStore() {
        this(new ArrayList<>());
    }

    public OnlineStore(List<User> users) {
        this.users = users;
    }
    public void addUser(User user) {
        users.add(user);
        initialUsers++;
    }
    public List<User> getUsers() {
        return users;
    }
    public static int countAllProducts(List<User> users) {
        int total = 0;
        for (User user : users) {
            for (Cart cart : user.getCarts()) {
                total += cart.getProducts().size();
            }
        }
        return total;
    }
    @Override
    public String toString() {
        return "OnlineStore{" + "users=" + users + '}';
    }
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();

        User user1 = new User("Alex", 1);
        Cart cart1 = new Cart();
        cart1.addProduct(new Product("iPhone", "Apple", 999));
        cart1.addProduct(new Product("Galaxy", "Samsung", 899));
        user1.addCart(cart1);

        store.addUser(user1);

        System.out.println(store);
        System.out.println("Общее кол-во продуктов: " + OnlineStore.countAllProducts(store.getUsers()));
    }
}
