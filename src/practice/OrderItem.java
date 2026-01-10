package practice;

public class OrderItem {

    private int id;
    private int orderId;
    private int productId;
    private int quantity;
    private int price;

    // Полный конструктор (для БД)
    public OrderItem(int id, int orderId, int productId, int quantity, int price) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    // Упрощённый конструктор (для корзины)
    public OrderItem(int productId, int quantity, int price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public int getPrice() { return price; }
}
