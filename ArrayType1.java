public class ArrayType1 {
    public static void main(String[] args) {
        
    //Intilize the array value
    //Type-Using new keyword
    int size =5;
    int nums[] =new int [size];
    
    //Intilize the array value
    nums[0] =3;
    nums[1]=23;
    nums[3] =34;
    nums[4] =45;

    //print array
    for(int i=0; i<size; i++){
        System.out.println(nums[i]);
    }
    }
}
