/********************************************
* AUTHOR: Charles Fator
* COLLABORATORS: <names>
* COURSE: CS 111 Intro to CS I - Java
* LAST MODIFIED:	11/2/24
********************************************/

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {12, 16, 26, 42, 53, 77, 84};
        System.out.println("Printing the given array...");
        System.out.println(ArrayMethods.arrayString(numbers));
        
        int indexA = 1;
        int indexB = 5;
        System.out.printf("\n");
        System.out.println("Swapping index " + indexA + " with index " + indexB + "...");
        ArrayMethods.swap(numbers, indexA, indexB);
        System.out.println(ArrayMethods.arrayString(numbers));
        System.out.printf("\n");
        System.out.println("The minimum index of the array is index: " + ArrayMethods.indexOfMin(numbers, 0));
        System.out.printf("\n");
        System.out.println("Printing the array in reverse order...");
        ArrayMethods.reverse(numbers);
        
        System.out.printf("\n");
        System.out.println("Printing the array in acending order...");
        ArrayMethods.selectionSort(numbers);
    }
}