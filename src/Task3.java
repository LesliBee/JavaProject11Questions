public class Task3 {
    public static void main(String[] args) {
        //Create a 2D array of integer values. Print the sum of all numbers.

        int [] [] num={{10,18,20,7,14},{12,9,8,7,7}};


        int sum=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum+=num[i][j];
            }

        }
        System.out.println("Sum of all numbers is "+sum);
    }
}
