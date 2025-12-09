import java.util.Scanner;

public class massive {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("vvedi razmer massiva ");
        int a=scan.nextInt();
        int[] nums=new int[a];
        System.out.print("vvedi massiv: ");
        for(int i=0; i<a; i++){
            nums[i]=scan.nextInt();
        }
        System.out.println(nums[0]+nums[3]);
    }
}
