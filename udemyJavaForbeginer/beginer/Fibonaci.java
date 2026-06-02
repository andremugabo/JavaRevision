package beginer;

public class Fibonaci {

    public static void main(String[] args){
            for(int i = 0; i <= 10; i++){
                System.out.print(fibonaci(i) + " ");
            }
    }
    
    public static int fibonaci(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fibonaci(n - 1) + fibonaci(n - 2);
        }
    }


}
