package D4;

public class D21Rithmetics
{
    public static void main(String[] args) {
        int result = 3+2*3;
        System.out.println(result);//9

        result = (3+2)*3;
        System.out.println(result);//15

        System.out.println(21/10);//2
        int notDividedInt = 21/10;
        System.out.println(notDividedInt); //2

        double notDividedDouble = 21/10;
        System.out.println(notDividedDouble);  //2.0

        int integer = (int) 2.1;
        System .out.println(integer);//2

        byte aByte = 1;
        short aShort = aByte;
        int aInt = aShort;
        long aLong = aInt;
        float aFloat = aLong;
        double aDouble = aFloat;


        double doubleVar = 10.24;
        int castDouble = (int) doubleVar;
        System.out.println(castDouble); //10
//        데이터 손실이 가능성이 가능하다
        int dataLost = (int) 4294967296L;
        System.out.println(dataLost); //0

        double doubleDivide = (double) 21/10;
        System.out.println(doubleDivide); // 2.1

        char aChar = 10;
        System.out.println(aChar+10);
        System.out.println((char) (aChar +10));//75
        //char aChar = 'b';
        // System.out.println(aChar+10);
        // System.out.println((char) (aChar +10));//75

        // 문자열 덧셈(?)이 아니라
        // String Concatenation
        String hello = "Hello, ";
        String world = "World!!!";
        String helloWorld = hello + world;
        System.out.println(helloWorld);
        helloWorld = "Hello," + " " + "World!!!";
        System.out.println(helloWorld);

        // 다른 자료형과 함께라면?
        int date = 21;
        System.out.println("Today is " + date + ".");

         // 증감 연산자
        int count = 0;
        count++;
        System.out.println(count);
        count--;
        System.out.println(count);
        //int count = 0;
        //        count= count + 1;
        //        System.out.println(count);
        //        count= count -1;
        //        System.out.println(count);


        // ++ truoc ++ sau khac nhau count
        count=10;
        // 앞에 붙으면 먼저 올리고 값을 사용
        ++count;//11
        // 사용하고 값을 올린다.
        count++;//11
        System.out.println(++count);//13
        System.out.println(count++);//14
        System.out.println(count);//14

        // '=' 활용하기
        int addTo = 1;
        // addTo = addTo + 10;
        addTo += 10;
        System.out.println(addTo);  // 11
        addTo -= 10;
        addTo *= 10;
        addTo /= 10;
        addTo %= 10;
        System.out.println(addTo);

        int base = 2;
        // base = base * base;
        base *= base;
        System.out.println(base);
    }
}
