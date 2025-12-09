import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("введите значение ");
        Scanner scan= new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("chislo a="+a);

        System.out.println("введите значение 2 ");
        Scanner scan1= new Scanner(System.in);
        int b = scan.nextInt();
        System.out.println("chislo b="+b);

        int sum=a+b;
        System.out.println(sum);
    }

}
