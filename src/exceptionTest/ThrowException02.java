package exceptionTest;

public class ThrowException02 {
    //심부름 하는 자식
    public static int divide(int x, int y)throws ArithmeticException{
            return x / y;
    }

    //심부름 시키는 무보
    static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("0 으로 나누면 안돼요");
        }
    }
}
