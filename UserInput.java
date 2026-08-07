import java.util.Scanner;

class UserInput {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = in.nextLine();
        System.out.println("Enter your Department:");
        String Department= in.nextLine();
        System.out.println("Enter your CGPA:");
        Float CGPA = in.nextFloat();
        System.out.println("Enter your Register number:");
        Long register_number = in.nextLong();
        in.close();

        System.out.println("Name:"+name);
        System.out.println("Register_name:"+register_number);
        System.out.println("Department:"+Department);
        System.out.println("CGPA:"+CGPA);
        
    }
}