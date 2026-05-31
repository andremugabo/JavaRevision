public class ArrayTwoD {
    public static void main(String[] args){
        int[][] matrix = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
         }

         System.out.println("The transpose of this Matrix");

         for(int i= 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                    System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
         }
    }
    
}
