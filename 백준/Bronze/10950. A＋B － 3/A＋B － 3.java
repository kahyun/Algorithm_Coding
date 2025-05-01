import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int A = 0;
		int B = 0;
		int[] result = new int[t];
		for(int i = 0; i<t; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			result [i] = A+B;
		}
		for(int i = 0; i<t; i ++) {
		System.out.println(result[i]);
		}
	}
}