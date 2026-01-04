public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand,String model,int year ){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }

    public Vehicle(){}
    //getter

    public String getBrand(){
        return brand;
    }


    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    //setter

    public void setBrand(String brand){
        this.brand=brand;
    }

    public void setModel(String model){
        this.model=model;
    }

    public void setYear(int year){
        if (year > 1885) {
            this.year = year;
        } else {
            System.out.println("Ошибка: год должен быть больше 1885.");
        }
    }

    public abstract void startEngine();

    public void showInfo(){
        System.out.println("Брэнд: "+brand+". Модель: "+model+". Год: "+year);
    }
}
