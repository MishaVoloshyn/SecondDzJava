import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private int orderId;
    private String userName;
    private double amount;
    private boolean paid;
    private String createdAt;
}
