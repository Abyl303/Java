package practice;

import java.time.LocalDateTime;

public class Product {

    private int id;
    private String name;
    private String description;
    private int price;
    private int stockQuantity;
    private LocalDateTime createdAt;

    public Product(int id, String name, String description, int price, int stockQuantity, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.createdAt = createdAt;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getPrice() { return price; }
    public int getStockQuantity() { return stockQuantity; }
}
