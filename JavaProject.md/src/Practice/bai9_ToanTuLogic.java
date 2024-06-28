package Practice;

public class bai9_ToanTuLogic {
    public static void main(String[] args) {
        int i = 7;
        System.out.println(i>0 && i<10);// ca hai deu dung -- true
        System.out.println(i>0 && i>10);// 1 dung 1 sai  -- false


        System.out.println(i>6 || i<0); //1 dung 1 sai  -- true
        System.out.println(i>6 || i<10); // ca hai deu dung -- true

        System.out.println(!(i>6 || i<0)); //1 dung 1 sai  -- true--false
        System.out.println(!(i>6 || i<10)); // ca hai deu dung -- true--false


        // toan tien su hau to 단항 연산자
        int x = 100;
        int y = 90;
        int z = 80;
        int h = 70;
        x++;//tang len 1 gia tri
        x++;//tang len 1 gia tri

        ++y;
        z--;
        --h;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(h);

        //chu y quan trong tien su hau to
        int a = 1;
        int b = 2;
        int c =a++ - ++b +1;
        System.out.println(a);//tinh cuoi cung 1+1=2
        System.out.println(b);// 2+1
        System.out.println(c);// 1-3+1=-1
    }
}
