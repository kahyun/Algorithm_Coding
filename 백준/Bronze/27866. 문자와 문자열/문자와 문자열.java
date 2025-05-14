import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		int B = sc.nextInt();
		
		String[] C = A.split("");
		System.out.println(C[B-1]);
	}
}