import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Using Scanner, create an array of countries.
        When an array is created, retrieve all values from it and while retrieving those values
        print capital for each country. (use 2 different loops).
         */
        Scanner input = new Scanner(System.in);

        String[] countries = new String[5];
        String[] capitals = new String[5];

        int i = 0;
        int j=0;
        while (i < countries.length) {
            System.out.print("Enter name of the country: ");
            countries[i] = input.nextLine();
            System.out.print("Enter it's capital: ");
            capitals[i] = input.nextLine();
            //   System.out.println(capitals[i]+" is the capital of "+countries[i]);
            i++;
        }
        while(j < capitals.length) {
            System.out.println(capitals[j] + " is the capital of " + countries[j]);
            j++;
        }}}