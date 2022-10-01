import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), min = 10000000;
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = in.nextInt();
        for (int i:arr) {
            if (i > 0 && i < min){
                min = i;
            }
        }
        System.out.println(min);
    }
}
