package practice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopConsoleApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProductDAO productDAO = new ProductDAO();
        OrderDAO orderDAO = new OrderDAO();

        User user = new User(1, "ivan", "ivan@mail.com", "hash", LocalDateTime.now());
        List<OrderItem> cart = new ArrayList<>();

        System.out.println("Товары в магазине:");
        List<Product> products = productDAO.findAll();

        for (Product p : products) {
            System.out.println(p.getId() + " | " + p.getName() + " | " + p.getPrice());
        }

        System.out.print("Введите ID товара: ");
        int productId = Integer.parseInt(scanner.nextLine());

        System.out.print("Введите количество: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        Product selected = products.stream()
                .filter(p -> p.getId() == productId)
                .findFirst()
                .orElse(null);

        if (selected != null) {
            cart.add(new OrderItem(
                    selected.getId(),
                    quantity,
                    selected.getPrice()
            ));
        }

        int total = cart.stream()
                .mapToInt(i -> i.getPrice() * i.getQuantity())
                .sum();

        Order order = new Order(
                user.getId(),
                LocalDateTime.now(),
                "pending",
                total,
                cart
        );

        orderDAO.save(order);
    }
}
