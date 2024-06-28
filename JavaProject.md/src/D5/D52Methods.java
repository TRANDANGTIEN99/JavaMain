package D5;

public class D52Methods {
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
    public static int addTwo(int a, int b) {
        return a + b;


       // String str = "TIEN";
      //  int n = 5;



        // 특정 문자열을 n번 반복해서
        // 출력(검은 창에 보이게)하는 메서드
        //public static void printNTime(String str, int n) {
        //for (int i = 0; i < n; i++) {
         //   System.out.println(str);
        }



}
  //  }}