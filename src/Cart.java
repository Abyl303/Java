import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> products;

    public Cart(){
        products=new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public double getTotalPrice(){
        double total=0;
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);   // берем i-й товар из списка
            total = total + p.getPrice();  // добавляем цену товара к общей сумме
        }
        return total;
    }

    public void showCart(){
        if (products.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println("В корзине:");
            for (int i = 0; i < products.size(); i++) {
                Product p = products.get(i);          // получить элемент по индексу i
                System.out.println(p.getInfo());      // вывести информацию о товаре
            }
            System.out.println("Итого: " + getTotalPrice());
        }
    }
}
