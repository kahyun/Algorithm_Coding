import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	int max = Integer.MIN_VALUE;
    	int min = Integer.MAX_VALUE;
    
    	for(int i=0; i<T; i++) {
    		int num = sc.nextInt();
    		if(max<num) {
    			max = num;
    		}
    		if(min>num) {
    			min = num;
    		}
    	}
    	System.out.print(min+" ");
    	System.out.println(max);
    }
}

