import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " 은 짝수입니다.");
        }else
            System.out.println(num+" 은 홀수입니다.");
    }
}
