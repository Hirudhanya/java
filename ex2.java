import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value :");
        int value = sc.nextInt();

        if(value>=1){
            System.out.println("profit");
        }
        else if(value<0){
            System.out.println("loss");
        }
        else
            System.out.println("no profit or loss");
    }
}
