public class Truck extends Vehicle{

    private double maxLoadKg;

    public Truck(String brand, String model, int year, double maxLoadKg) {
        super(brand, model, year);
        this.maxLoadKg = maxLoadKg;
    }

    public double getMaxLoadKg() {
        return maxLoadKg;
    }

    public void setMaxLoadKg(double maxLoadKg) {
        this.maxLoadKg = maxLoadKg;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine started: RRRRUMBLE!");
    }

    @Override
    public void showInfo() {
        System.out.println("Брэнд: " + getBrand() + ". Модель: " + getModel() + ". Год: " + getYear() + ". Макс. нагрузка (кг): " + maxLoadKg);
    }

}
