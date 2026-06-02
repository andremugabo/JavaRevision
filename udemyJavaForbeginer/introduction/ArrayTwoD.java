public class ArrayTwoD {
    public static void main(String[] args){
        int[][] matrix = new int[3][3];

        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] arr3 = new int[3][3];

        int i,j;
        int sum;
        int k;

        for( i = 0; i < 3; i++){
            for( j = 0; j < 3; j++){
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }

        for( i = 0; i < 3; i++){
            for( j = 0; j < 3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
         }

         System.out.println("The transpose of this Matrix");

         for( i= 0; i < 3; i++){
            for( j = 0; j < 3; j++){
                    System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
         }


         for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                arr1[i][j] = 1;
            }
         }

         for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                arr2[i][j] = 3;
            }
         }

         System.out.println("Matrix One");

         for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
         }

         System.out.println("Matrix two");

         for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
         }


         System.out.println();
         System.out.println();
         System.out.println();

         System.out.println(" Matrix Multiplication ");
         System.out.println(" ===================== ");

         for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
           sum = 0;
                for(k = 0; k < 3; k++){
                    sum += arr1[i][k] * arr2[k][i];
                }
                arr3[i][j] = sum;
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
         }


         System.out.println();
         System.out.println();
         System.out.println();

         System.out.println("Multiplication Result");
         System.out.println("====================");


         for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
         }




    }
    
}
