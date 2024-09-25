import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 : ");
        int first_num = sc.nextInt();

        System.out.print("두 번째 숫자 : ");
        int second_num = sc.nextInt();

        System.out.print("연산자(+, -, *, /) : ");
        String emp = sc.next();

        switch (emp){
            case "-":
                System.out.println(first_num - second_num);
            case "+":
                System.out.println(first_num + second_num);
            case "*":
                System.out.println(first_num * second_num);
            case "/":
                System.out.println(first_num / second_num);

        }
    }
}