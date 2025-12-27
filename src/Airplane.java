public class Airplane extends Transport{
    private double wingspan;

    public Airplane(String model, int maxSpeed, double weight, double wingspan){
        super(model, maxSpeed,weight);
        this.wingspan=wingspan;
    }

    @Override
    public void move(){
        System.out.println("Airplane is flying in the sky");
    }

    @Override
    void printInfo(){
        System.out.println("Модель: "+getModel()+". Скорость: "+getMaxspeed()+". Вес: "+getWeight()+". Крылья:"+wingspan);
    }
}
