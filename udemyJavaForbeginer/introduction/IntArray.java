public class IntArray {
    public static void main(String[] arg){
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        } 

        for(int j = 0; j < numbers.length; j ++){
            System.out.println("Entries of numbers are: " + numbers[j]);
        }
    }
    
}
