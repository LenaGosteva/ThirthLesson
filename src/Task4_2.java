import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int k = in.nextInt();
        String result = "";
        for (int i = 0; i < n - 1; i++) {
            if (k>c){
                result += " " + k;
                c = k;
                k = in.nextInt();
                continue;
            }
            else {
                c = k;
                k = in.nextInt();
            }
        }
        System.out.println(result);
    }
}
