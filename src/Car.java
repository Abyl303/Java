public class Car extends Transport{
    private int doors;

    public Car(String model, int maxSpeed, double weight, int doors){
        super(model,maxSpeed, weight);
        this.doors=doors;
    }
    @Override
    public void move(){
        System.out.println("Car is driving on the road");
    }

    @Override
    void printInfo(){
        System.out.println("Модель: "+getModel()+". Скорость: "+getMaxspeed()+". Вес: "+getWeight()+". Количество дверей:"+doors);
    }
}
