package practice;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private int userId;
    private LocalDateTime orderDate;
    private String status;
    private int totalAmount;
    private List<OrderItem> items;

    public Order(int userId, LocalDateTime orderDate, String status, int totalAmount, List<OrderItem> items) {
        this.userId = userId;
        this.orderDate = orderDate;
        this.status = status;
        this.totalAmount = totalAmount;
        this.items = items;
    }

    public int getUserId() { return userId; }
    public String getStatus() { return status; }
    public int getTotalAmount() { return totalAmount; }
    public List<OrderItem> getItems() { return items; }
}
