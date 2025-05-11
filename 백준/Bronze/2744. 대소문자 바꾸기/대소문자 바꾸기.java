import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();  // 입력 받은 문자열

        StringBuilder result = new StringBuilder();  // 결과를 저장할 StringBuilder

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);  // 하나씩 문자를 가져옴

            // 대문자일 경우 소문자로 변환
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            }
            // 소문자일 경우 대문자로 변환
            else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            }
        }

        System.out.println(result);  // 결과 출력
    }
}
