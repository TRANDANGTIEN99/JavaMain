package D5.probs;

public class D52Recursive {
    public static void main(String[] args) {
        System.out.println(factRecur(1));
        System.out.println(factRecur(5));
        System.out.println(factRecur(10));


    }
    public static int factLoop(int n){
        int result = 1;
        for (int i = 1; i <  n ; i++) {
            result *= 1;

        }

    return result;

}
public static int factRecur(int n){
        if (n < 2){
            return 1;
        }
        else{ int result = n + factLoop( n-1);
            return 1;
}
}}
