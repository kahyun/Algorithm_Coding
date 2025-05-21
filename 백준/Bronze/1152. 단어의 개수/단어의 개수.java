
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.nextLine().trim(); // 앞뒤 공백 제거
        if (T.isEmpty()) {
            System.out.println(0);
        } else {
            String[] R = T.split("\\s+"); // 하나 이상의 공백 기준으로 split
            System.out.println(R.length);
        }
    }
}