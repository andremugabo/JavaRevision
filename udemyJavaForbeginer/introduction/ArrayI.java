public class ArrayI {
    public static void main(String arg[]){
        int[] numbers = {1,2,3,4,5,5,6,7,8,};

        numbers[2] = 99;
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Element at Index : " + i + ": " + numbers[i]);
        }
    }
    
}
