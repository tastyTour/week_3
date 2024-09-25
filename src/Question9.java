import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("연산자를 선택하세요(+, -, *, /) : ");
        String emp = sc.next();

        System.out.print("첫 번째 숫자 : ");
        int first_num = sc.nextInt();

        System.out.print("두 번째 숫자 : ");
        int second_num = sc.nextInt();
        switch (emp) {
            case "-":
                System.out.println(first_num - second_num);

            case "+":
                System.out.println(first_num + second_num);

            case "*":
                System.out.println(first_num * second_num);

            case "/":
                if (0 == second_num) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    System.out.println(first_num / second_num);
                }
        }
    }
}