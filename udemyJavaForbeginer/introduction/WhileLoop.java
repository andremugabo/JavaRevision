public class WhileLoop {
    public static void main(String[] args){
        int count = 0;
        while(count < 10){
            if(count == 5){
                count ++;
                continue;
            }

            if(count == 8){
                break;
            }

            System.out.println("Count: " + count);
            count++;
        }
    }
    
}
