import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		 sc.nextLine();
		for(int i =1; i<=B;i++) {
			String A = sc.nextLine();
			String[] C = A.split("");
			System.out.println(C[0]+C[C.length-1]);
			
		}
			
		
	}
}