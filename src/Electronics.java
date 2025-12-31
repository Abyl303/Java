public class Electronics extends Product{

    private String phone;
    private String laptop;

    public Electronics(String name,double price, String phone,String laptop ){
        super(name, price);
        this.phone=phone;
        this.laptop=laptop;
    }

    @Override
    public String getInfo() {
        return "Имя товара: "+getName()+". Цена: "+getPrice()+". Модель телефона: "+phone+". Модель ноутбука: "+laptop;
    }
}
