package D5.probs;

public class Q3 {
    public static void main(String[] args) {
        System.out.println();

    }
    public static int calculate(char operator, int left, int right){
        switch (operator){
            case '+':
                return left + right;
            case '-':
                return left - right;
            case '*':
                return left * right;
            case '/':
                return left / right;
            default:
                return 0;

        }
    }
}
//사칙연산을 나타내는 문자(char) (+, -, *, /) 하나와 두개의 정수를 입력받아
// 각 기호에 대응하는 연산의 결과를 반환하는 메서드를 작성하시오.
//단, 정수 범위에서만 결과를 반환합니다.