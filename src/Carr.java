public class Carr extends Vehicle{

    private int doors;

    public Carr(String brand,String model,int year, int doors){
        super(brand, model, year);
        this.doors=doors;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started: Vroom!");
    }

    @Override
    public void showInfo(){
        System.out.println("Брэнд: "+getBrand()+". Модель: "+getModel()+". Год: "+getYear()+". Двери: "+doors);
    }


}
