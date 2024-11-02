import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMethods {
    
    public static void main(String[] args) {
        // We will not be using the main method, it is included to keep the compiler happy :)
    }
    
    public static String arrayString(int[] a) {
        String result = "{ ";
        for (int i = 0; i < a.length; i++) {
            result += a[i];
            if (i < a.length - 1) {
            result += ", ";
            }
        }
        result += " }";
        return result;
    }
    
    public static void swap(int[] array, int a, int b) {
        int valueAtIndexA = array[a];
        int valueAtIndexB = array[b];
        array[a] = valueAtIndexB;
        array[b] = valueAtIndexA;
    }
    
    public static int indexOfMin(int[] array, int startIndex) {
        int minIndex = startIndex;
        for (int i = startIndex; i < array.length - 1; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static void reverse(int[] array) {
        int[] reverseArray;
        reverseArray = new int[array.length];
        int reverseIndex = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            reverseArray[reverseIndex] = array[i];
            reverseIndex -= 1;
        }
        System.out.println(arrayString(reverseArray));
    }
    
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = indexOfMin(array, i);
            swap(array, i, minIndex);
        }
        System.out.println(arrayString(array));
    }
    
}