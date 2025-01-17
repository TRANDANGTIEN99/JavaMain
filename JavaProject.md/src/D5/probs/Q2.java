package D5.probs;
/*
`int[]`와 정수 두개(index 두개)를 인자로 받아,

- 첫번째 정수 index 원소 포함
- 두번째 정수 index 원소 제외

범위의 `int[]`을 반환하는 메서드를 작성하시오.
 */
public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int start = 1;
        int end = 3;
        int[]  result = subArray(arr,start,end);
        for(int num : result) {
            System.out.println(String.format ("%d", num));
        }

    }
    public static int[] subArray(int[]arr, int start, int end){
       int[] result = new int[end - start];
       for (int i =0; i < result.length; i++){
           result[i]= arr[start+i];
        }
       return result;
    }
}
/*
설명:

다음 배열과 정수들이 인자로 전달될 때

```java
int[] arr = {1, 2, 3, 4, 5, 6};
int start = 1;
int end = 3;
```

메서드의 결과로 반환되는 배열은 아래와 같다.

```java
int[] result = {2, 3};
```
 */