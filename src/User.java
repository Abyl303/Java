public class User {

    private String username;
    private String email;
    private final Cart cart;

    public User(String username, String email){
        this.username=username;
        this.email=email;
        this.cart = new Cart();
    }

    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }

    public void setUsername(String username){
        this.username=username;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public void addToCart(Product product) {
        cart.addProduct(product);
    }

    public void info(){
        System.out.println("Пользователь: " + username + ", email: " + email);
        cart.showCart();  // вызов метода корзины для отображения товаров
    }
}
