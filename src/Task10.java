import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        //Write a java program to find the second-largest number in the array

        int[] my_array = {
                89, 20, 19, 14, 23,
                18, 24, 12, 72, 25,
                56, 65, 57, 45};
        System.out.println("Original numeric array : "+ Arrays.toString(my_array));
        Arrays.sort(my_array);
        int index = my_array.length-1;
        while(my_array[index]==my_array[my_array.length-1]){
            index--;
        }
        System.out.println("Second largest value: " + my_array[index]);
    }
}