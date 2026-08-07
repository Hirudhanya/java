public class IfelseifCon {
    public static void main(String[] args) {
        int age=23;
        if(age<=3){
            System.out.println("child");
        }else if(age>=4 && age<=18){
            System.out.println("teenager");
        }else if(age>=19 && age<=60){
            System.out.println("Adult");
        }else{
            System.out.println("old age");
        }
    }
}
