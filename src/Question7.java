import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월을 입력하시오: ");
        int month = sc.nextInt();
        switch (month) {
            case 1: case 12: case 2:
                System.out.println("겨울");
                break;

            case 3: case 4: case 5:
                System.out.println("봄");
                break;

            case 6: case 7: case 8:
                System.out.println("여름");
                break;

            case 9: case 10: case 11:
                System.out.println("가을");
                break;
        }
    }
}
