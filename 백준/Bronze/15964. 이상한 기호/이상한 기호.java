import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        long C = (A+B)*(A-B);
        System.out.println(C);
    }
}