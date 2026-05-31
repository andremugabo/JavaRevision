public class DataType {
    public static void main(String args[]){
        int number = 10;
        double pi = 3.14;
        char letter = 'A';
        boolean isJavaFun = true;


        int[] num = {1,2,3,4,5};

        System.out.println("Number: " + number);
        System.out.println("Pi " + pi);
        System.out.println("Letter: " + letter);
        System.out.println("Is Java Fun: " + isJavaFun);


        for(int i = 0; i < num.length; i++){
            System.out.println("Element at index : " + i + " : " + num[i]);
        }


    }    
}
