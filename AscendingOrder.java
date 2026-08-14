import java.util.*;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums [] = new int [n];
        
        for(int i=0;i<n; i++){
            nums[i] = sc.nextInt();
        }
    }
    public static void ascendingOrder(int[] nums) {
        int min = nums[0];
        for(int i=1; i<nums.length;i++){
            if(nums[i]>min){
                min = nums[i];
            }
    }
    } 
}
