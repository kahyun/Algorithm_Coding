import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int result = 1;
		int n = sc.nextInt();
		for(int i=1; i<=n;i++) {
			
			result *= i;
		}System.out.println(result);
	}
}