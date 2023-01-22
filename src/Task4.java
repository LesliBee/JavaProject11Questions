public class Task4 {
    public static void main(String[] args) {
        //Create a 2D array or integer type where you will store odd and even numbers.
        //Develop a program which will identify/print the even numbers only.

        int [] [] num={{10,18,20,7,14},{12,9,8,7,7}};
        System.out.println("even numbers are :");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if((num[i][j])%2==0){
                    System.out.print(num[i][j]+ " ");
                }
            }
        }
        System.out.println();
        System.out.println("odd numbers are :");
        for (int a = 0; a < num.length; a++) {
            for (int b = 0; b < num[a].length; b++) {
                if ((num[a][b]) % 2 != 0) {
                    System.out.print(num[a][b]+" ");
                }
            }
        }
    }
}
