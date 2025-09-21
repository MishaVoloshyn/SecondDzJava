public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.setOrderId(101);
        order.setUserName("Ivan");
        order.setAmount(450.75);
        order.setPaid(true);
        order.setCreatedAt("2025-09-22");

        System.out.println("Замовлення №" + order.getOrderId());
        System.out.println("Покупець: " + order.getUserName());
        System.out.println("Сума: " + order.getAmount());
        System.out.println("Оплачено: " + order.isPaid());
        System.out.println("Дата: " + order.getCreatedAt());
    }
}