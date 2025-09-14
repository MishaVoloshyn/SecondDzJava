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
    public Product findProductById(int id) throws ProductNotFoundException {
        for (User user : users) {
            for (Cart cart : user.getCarts()) {
                for (Product product : cart.getProducts()) {
                    if (product.getId() == id) {
                        return product;
                    }
                }
            }
        }
        throw new ProductNotFoundException("Продукт с id=" + id + " не найден!");
    }

    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();

        PhysicalProduct laptop = new PhysicalProduct("Laptop", "Lenovo", 1200, 2.5);
        DigitalProduct ebook = new DigitalProduct("Java Book", "O'Reilly", 15, "XYZ-111");

        Cart cart = new Cart();
        cart.addProduct(laptop);
        cart.addProduct(ebook);

        User user = new User("Olena", 101);
        user.addCart(cart);
        store.addUser(user);

        try {
            Product found = store.findProductById(ebook.getId());
            System.out.println("Найден продукт: " + found);
        } catch (ProductNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            Product notFound = store.findProductById(999);
            System.out.println("Найден продукт: " + notFound);
        } catch (ProductNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
