package D5;

public class D51Methods {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int sum = addTwo(a , b);
        System.out.println(sum);

        int c =20;

        int result = diff(addTwo(b,c), subTwo(a,b));
        System.out.println(result);
    }
    public static int diff(int a, int b) {
        int diff = a - b;
        if (diff < 0) diff *= -1;
        return diff;
    }
    public static int subTwo( int a, int b){
        return a - b;
    }
    public static int addTwo(int a, int b){
        return a + b;

    }
}
