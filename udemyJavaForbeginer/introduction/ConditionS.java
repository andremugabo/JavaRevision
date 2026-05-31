
public class ConditionS {
    public static void main(String args[]){
        int number;

        number  =(int) ((Math.random() * 100 + 1) - 28);
        if(number > 0){
            System.out.println("The number is positif " + number);
        } else if (number < 0){
            System.out.println("The numbeer is negative " + number);
        } else{
            System.out.println("The number is zero " + number);
        }
    }
    
}
