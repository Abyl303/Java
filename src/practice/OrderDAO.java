package practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDAO {

    public void save(Order order) {

        String orderSql =
                "INSERT INTO orders (user_id, status, total_amount) VALUES (?, ?, ?) RETURNING id";

        String itemSql =
                "INSERT INTO order_items (order_id, product_id, quantity, price) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection()) {
            conn.setAutoCommit(false);

            int orderId;

            try (PreparedStatement stmt = conn.prepareStatement(orderSql)) {
                stmt.setInt(1, order.getUserId());
                stmt.setString(2, order.getStatus());
                stmt.setInt(3, order.getTotalAmount());

                ResultSet rs = stmt.executeQuery();
                rs.next();
                orderId = rs.getInt(1);
            }

            try (PreparedStatement stmt = conn.prepareStatement(itemSql)) {
                for (OrderItem item : order.getItems()) {
                    stmt.setInt(1, orderId);
                    stmt.setInt(2, item.getProductId());
                    stmt.setInt(3, item.getQuantity());
                    stmt.setInt(4, item.getPrice());
                    stmt.addBatch();
                }
                stmt.executeBatch();
            }

            conn.commit();
            System.out.println("Заказ сохранён в БД");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
