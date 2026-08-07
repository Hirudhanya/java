import java.util.*;
public class ex3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the value1");
       int a = sc.nextInt();
       System.out.println("enter the value2");
       int b = sc.nextInt();
       System.out.println("enter the value3");
       int c = sc.nextInt();

       if(a>b && a>c){
        System.out.println(+(a));}
       else if(b>a && b>c){
        System.out.println(+(b));}
       else {
        System.out.println(+(c));
       }
    }
}
