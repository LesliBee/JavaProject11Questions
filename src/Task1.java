import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Using Scanner create an array of integer values. After the array is created,
        calculate the sum of all stored elements in that array.*/

        Scanner scan=new Scanner (System.in);
        System.out.println("Please enter 4 numbers");
        int [] arr=new int [4];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
