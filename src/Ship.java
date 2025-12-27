public class Ship {
    public static void main(String[] args){
        Transport tr1=new Transport("Audi", 210, 15000);
        tr1.move();
        tr1.printInfo();

        Transport tr2=new Car("Audi", 210, 15000, 4);
        tr2.move();
        tr2.printInfo();

        Transport tr3=new Airplane("Audi", 210, 15000, 2);
        tr3.move();
        tr3.printInfo();
    }
}
