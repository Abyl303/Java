public class Sait {
    public static void main(String[] args){
        Electronics phone = new Electronics("iPhone 15", 120000, "iPhone 15", "MacBook Pro");
        Electronics laptop = new Electronics("MacBook Air", 150000, "iPhone 13", "MacBook Air M2");
        User user=new User("Abylai", "abylai200245@gmail.com");

        user.addToCart(phone);
        user.addToCart(laptop);

        user.info();
    }
}
