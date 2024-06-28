package D4;

public class D22Comparison
{
    public static void main(String[] args) {
        //비교 연산자
        // 두개의 값을 비교해서 참 / 거짓을 만드는 연산자
        int small1 = 10;
        int small2 = 10;
        int big = 21;
        // true
        System.out.println(small1 == small2);
        // false
        System.out.println(small1 == big);
        // 같지 않다?  false
        System.out.println(small1 != small2);
        // true
        System.out.println(big != small1);
        // 초과
        System.out.println(big > small1);  // true
        System.out.println(small2 > small1);  // false
        // 미만
        System.out.println(big < small1);  // false
        System.out.println(small2 < big);  // true
        // 이상
        System.out.println(big >= small1);    // true
        System.out.println(small1 >= small2); // true
        // 이하
        System.out.println(big <= small1);    // false
        System.out.println(small1 <= small2); // true

        int temerature = 37;
        // 체온이 36도 미만 또는 38도 이상인지
        System.out.println(temerature < 36);
        System.out.println(temerature >= 38);
        //System.out.println(temerature<36 );



        // base가 num의 배수인가?
        //int base;
        //int num;
        //System.out.println(base % num == 0);

        //int[] scores = {10, 9, 8};
        // 점수의 평균이 8.5 보다 큰가?
       // int sum = scores[0] + scores[1] + scores[2];
        //double avg = (double) sum / 3;
       // System.out.println(avg > 8.5);
    }}