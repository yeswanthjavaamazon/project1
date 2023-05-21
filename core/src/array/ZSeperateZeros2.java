package array;

import java.util.Arrays;

//Write a java program to separate zeros from non-zeros in an integer array?
//Moving Zeros To The Front Of An Array :
public class ZSeperateZeros2 {
    static void moveZerosToFront(int inputArray[])
    {
        System.out.println("Input Array :"+Arrays.toString(inputArray));
         
        //Initializing counter to position of last element
  
        int counter = inputArray.length-1;
  
        //Traversing the inputArray from right to left
  
        for (int i = inputArray.length-1; i >= 0; i--)
        {
            //If inputArray[i] is non-zero
  
            if(inputArray[i] != 0)
            {
                //Assigning inputArray[i] to inputArray[counter]
  
                inputArray[counter] = inputArray[i];
  
                //Decrementing the counter by 1
  
                counter--;
            }
        }
  
        //Assigning 0 to remaining elements
  
        while (counter >= 0)
        {
            inputArray[counter] = 0;
  
            counter--;
        }
  
        System.out.println("Input Array After Moving Zeros To The Front :");
         
        System.out.println(Arrays.toString(inputArray));
         
        System.out.println("====================================");
    }
  
    public static void main(String[] args)
    {
        moveZerosToFront(new int[] {12, 0, 7, 0, 8, 0, 3});
  
        moveZerosToFront(new int[] {1, -5, 0, 0, 8, 0, 1});
  
        moveZerosToFront(new int[] {0, 1, 0, 1, -5, 0, 4});
  
        moveZerosToFront(new int[] {-4, 1, 0, 0, 2, 21, 4});
    }
}
