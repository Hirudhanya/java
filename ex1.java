// given a integer input num. write prgm to check whether a given integer is even or odd.
import java.util.*;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value :");
        int value = sc.nextInt();

        if(value%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }
}
