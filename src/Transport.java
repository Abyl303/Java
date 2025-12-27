public class Transport {

    private String model;
    private int maxSpeed;
    private double weight;

    public Transport(){}

    public Transport(String model, int maxSpeed, double weight){
        this.model=model;
        this.maxSpeed=maxSpeed;
        this.weight=weight;
    }

    public String getModel(){
        return model;
    }

    public int getMaxspeed(){
        return maxSpeed;
    }

    public double getWeight(){
        return weight;
    }

    public void setModel(String model){
        this.model=model;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }

    public void setWeight(double weight){
        this.weight=weight;
    }


    public void move(){
        System.out.println("Transport is moving");
    }

    void printInfo(){
        System.out.println("Модель машины:"+model+". Макс.скорость: "+maxSpeed+". Вес машины: "+weight);
    }
}
