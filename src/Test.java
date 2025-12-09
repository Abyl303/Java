import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        massive();
        dmassive();
    }

//    public static void massive(){
//        Scanner scan=new Scanner(System.in);
//        System.out.println("vvedite razmer massiva");
//        int a=scan.nextInt();
//        int [] arr=new int[a];
//        for(int i=0; i<a; i++){
//            arr[i]=scan.nextInt();
//        }
//
//        for(int i=0; i<a; i++){
//            System.out.print(arr[i]+" ");
//        }
//    }

    public static void dmassive(){
        Scanner sc=new Scanner(System.in);
        System.out.println("vvedi razmer massiva");
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] arr=new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

    }

}