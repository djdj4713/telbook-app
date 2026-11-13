package exceptionTest;

public class ThrowExceptionEX {
    //심부름 하는 자식
    public static int divide(int x, int y){
        try {
            return x / y;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }

    }

    //심부름 시키는 무보
    static void main(String[] args) {
        int result = divide(10, 3);
        System.out.println(result);
    }
}
