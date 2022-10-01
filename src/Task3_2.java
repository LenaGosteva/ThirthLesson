import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min = 1000000000;
        int k = in.nextInt();
        for (int i = 0; i < n - 1; i++) {
            if (k > 0 && k < min){
                min = k;
                k = in.nextInt();
                continue;
            }
            else{
                k = in.nextInt();
                continue;
            }
        }
        System.out.println(min);
    }
}
