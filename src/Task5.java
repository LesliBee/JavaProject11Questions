public class Task5 {
    public static void main(String[] args) {
//Create a 2D array of integers. Develop a program which will calculate the sum of even and odd numbers for that array.

        int sum1=0;
        int sum2=0;
        int [] [] num={{10,18,20,7,14},{12,9,8,7,7}};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if((num[i][j])%2==0){
                    sum1+=num[i][j];
                }else{
                    sum2+=num[i][j];
                }
            }
        }
        System.out.println("Sum of even numbers is "+sum1);
        System.out.println("Sum of odd numbers is "+sum2);
    }
}
