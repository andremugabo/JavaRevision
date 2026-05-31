public class ArthOp {
    public static void main(String args[]){
        double a = 10;
        double b = 4;
        System.out.println("Addition: " + (a + b));
        System.out.println("Substraction: " + (a - b));
        System.out.println("Mulitiplication: " + ( a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b)); 

        double results = a / b + 3 * 2;

        System.out.println("Result: " + results);
    }
}
