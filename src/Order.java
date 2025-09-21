import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private int orderId;           // номер заказа
    private String userName;       // имя покупателя
    private double amount;         // сумма заказа
    private boolean paid;          // статус оплаты
    private String createdAt;      // дата создания
}
