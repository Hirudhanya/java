import java.util.Scanner;

public class switchCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        float a = sc.nextFloat();
        System.out.println("Select Operator :");
        char ch =sc.next().charAt(0);
        System.out.println("enter b:");
        float b = sc.nextFloat();

        switch (ch){
            case '+':
                System.out.println("sum ="+(a+b));
                break;
            case '-':
                System.out.println("sub ="+(a-b));
                break;
            case '*':
                System.out.println("multi ="+(a*b));
                break;
            case '/':
              System.out.println("divi ="+(a/b));
              break;
            default:
              System.out.println("Invaild input");
              break;
        }
    }
}
