import java.util.Scanner;

public class Leet {
    public static void main(String[] args) {
        int x=3;
        System.out.println(isPowerOfTwo(x));
    }

    public static boolean isPowerOfTwo(int n){
        if(n<=0){
            return false;
        }
        while(n%2==0){
            n=n/2;
        }

        return n==1;
    }

}

