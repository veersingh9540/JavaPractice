import java.util.Arrays;


public class Misc2{
    public static void main(String args[]){
        int num[][] = new int[4][4];
        int nums[] = new int[5];
        double random2 = Math.random();

        for (int i =0; i < num.length; i++){
            nums[i] = i;
        }
        // System.out.println(Arrays.deepToString(num));
        // System.out.println(Arrays.toString(nums));

        // Enhanced For loop
        for (int n: nums){
            System.out.println(n);
        }
    
    }   
}