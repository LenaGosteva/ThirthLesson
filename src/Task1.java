import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = 0, l = in.nextInt();
        String result = "";
        for (int i = 0; n!=0; i++) {
            if (n%10 == l){

            n/=10;}
            else{
                result = n%10 + result;
                n/=10;}
            }

        System.out.println(result);

    }
}
