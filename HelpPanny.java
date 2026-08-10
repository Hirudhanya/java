import java.util.*;
public class HelpPanny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the m value");
        int m = sc.nextInt();
        System.out.println("Enter the n value");
        int n = sc.nextInt();

        for(int i=1;i<=m; i++) {
           System.out.println(i+"*"+n+"="+(i*n));
        }

    }
}
