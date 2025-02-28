package SORTING;

import java.util.Arrays;

public class InsertionSort {

    public int[] insertionSort(int number[]){
        for(int j = 1; j < number.length - 1; j++){
            int key = number[j+1];
            int i = j-1;
            while(i > 0 && number[i] > key){
                number[j+1] = number[j];
                i = i -1;
            }
            number[i+1] = key;

        }
            return number;
    }
    public static void main(String[] args){
            int[] numbers = {2,9,8,4,2,3,9,10,7,8,24,19};
            InsertionSort obj = new InsertionSort();
            int[] sortedArray =  obj.insertionSort(numbers);
            System.out.println("The sorted array is :"+ Arrays.toString(sortedArray));
    }
}
