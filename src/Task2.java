import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), i= 0;
        if (n%10 ==0)n/=10;
        boolean minus = false;
        if (n==0) {System.out.println(0);}
        if (n<0){
            n *=-1;
            minus = true;
        }
        while (n!=0){
            i = 10*i+n%10;
            n /=10;
        }

        if (minus)System.out.println(-1*i);
        else  System.out.println(i);




    }
}
