package operator;

public class Operator1 {
    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력 7

        // 뺼셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b; // int형 계산은 int 값만 출력 => 2.5에서 2로 출력됨
        System.out.println("a / b = "+ div);

        // 나머지
        int mod = a % b;// 몫은 2 나머지는 1
        System.out.println("a % b = " + mod);

        /*
        int zero = 10 / 0;
        수학적으로 0으로는 나눌수 없다
        오류 : Exception in thread "main" java.lang.ArithmeticException: / by zero
         */
        
    }
}
