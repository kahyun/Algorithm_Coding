import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        long C = sc.nextInt();
        long D = sc.nextInt();
        long E = sc.nextInt();
        long F = (A*A)+(B*B)+(C*C)+(D*D)+(E*E);
        System.out.println(F%10);
    }
}