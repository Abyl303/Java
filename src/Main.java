import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles=new ArrayList<>();

        vehicles.add(new Carr("Lexus", "RX 570", 2015, 4));
        vehicles.add(new Motorcycle("Yokohama", "BN 101", 2022, false));
        vehicles.add(new Truck("Volvo", "AM 141", 2010, 2500));


        for (int i=0; i<vehicles.size(); i++) {
            Vehicle v=vehicles.get(i);
            System.out.println("Транспортное средство #" + (i + 1) + ":");
            v.startEngine();  // Полиморфный вызов
            v.showInfo();
            System.out.println();
        }

    }
}
