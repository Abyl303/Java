import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class cycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = sc.next();

        System.out.println("Введите возраст: ");
        int age = sc.nextInt();

        // Подключение к PostgreSQL
        String url = "jdbc:postgresql://localhost:5432/db_test"; // или твоя база
        String user = "postgres";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "INSERT INTO users (name, age) VALUES (?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setInt(2, age);

            stmt.executeUpdate();
            System.out.println("Данные сохранены в базу!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
