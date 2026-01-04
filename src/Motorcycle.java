public class Motorcycle extends Vehicle{

    private boolean hasSidecar;

    public Motorcycle(String brand,String model,int year,boolean hasSidecar){
        super(brand, model, year);
        this.hasSidecar=hasSidecar;
    }

    @Override
    public void showInfo(){
        System.out.println("Брэнд: "+getBrand()+". Модель: "+getModel()+". Год: "+getYear()+". Имеет боковой прицеп: "+hasSidecar);
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started: Brrrr!");
    }
}
