package beginer;


public class RecFunc {
    public static void main(String[] args){
        System.out.println("The factorial of: " + factorial(5));
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }
    
}
