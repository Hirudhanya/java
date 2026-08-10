import java.util.*;

public class specialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the m :");

        int m = sc.nextInt();
        System.out.println("Enter the n :");
        int n = sc.nextInt();

        for(int i=m; i<=n; i++){
            int dig1 = i%10;
            int dig2 = i/10;
            int sum = dig1 + dig2;
            int product = dig1 * dig2;
            int result = sum + product;
            
        if(result==i){
                System.out.println(i);
            }
        }

    }
}
