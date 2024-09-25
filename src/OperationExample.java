public class OperationExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean flag = false;

        int result = (++a * b - 15) > (b / 2) && !flag ? a + b : b - a;

        System.out.println("Result: " + result);
    }
}
