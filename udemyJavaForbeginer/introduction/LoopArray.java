public class LoopArray {
    
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6};
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Number: " + numbers[i]);
        }


        String[] fruits = {"Apple", "Banana", "Cherry"};

        for(int i = 0; i < fruits.length; i++){
            fruits[i] = fruits[i].toUpperCase();
        }

        for(String fruit: fruits){
            System.out.println("Fruit: " + fruit);
        }
    }
}
