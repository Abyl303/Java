import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args){
        int[] sum={1,3,4,2,1};
        Arrays.sort(sum);
        System.out.println(Arrays.toString(sum));
        for(int i= sum.length-1; i>=0; i--){
            System.out.print(sum[i]+" ");
        }
    }
}
