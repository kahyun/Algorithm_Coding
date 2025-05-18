import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();  // 층 수
            int W = sc.nextInt();  // 호 수 (사용 안함)
            int N = sc.nextInt();  // N번째 손님

            int floor, room;

            if (N % H == 0) {
                floor = H;
                room = N / H;
            } else {
                floor = N % H;
                room = N / H + 1;
            }

            System.out.println(floor * 100 + room);
        }
    }
}


