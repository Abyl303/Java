import java.util.Scanner;

public class switch_case {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("vvedite 1 chislo ");
        int num= scan.nextInt();

        System.out.println("vvedite 2 chislo ");
        int num2= scan.nextInt();

        System.out.println("Deistvie ");
        String action=scan.nextLine();
        action=scan.nextLine();

        switch(action){
            case "+":
                System.out.println(num+num2);
                break;
            case "-":
                System.out.println(num-num2);
                break;
            case "*":
                System.out.println(num*num2);
                break;
            case "/":
                System.out.println(num/num2);
                break;
        }

    }
}
