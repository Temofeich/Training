import java.util.stream.IntStream;

public class AreSame {
// определить являются ли числа из  массива A квадратным корнем чисел из массива B
    public static void main(String[] args) {
        System.out.println(comp(a, b));
    }

    static int[] a = {121, 144, 121, 161, 19, 121, 2, 11};
    static int[] b = {121, 14641, 20736, 14641, 25921, 4, 14641, 361};

//    static int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
//    static int[] b = {132, 14641, 20736, 361, 25921, 361, 20736, 361};

    public static boolean comp(int[] a, int[] b) {
        int count;
        int count2;
        count = (int) IntStream.range(0, a.length).filter(i -> IntStream.range(0, b.length).anyMatch(j -> a[i] == Math.sqrt(b[j]))).count();
        count2 = (int) IntStream.range(0, b.length).filter(h -> IntStream.range(0, a.length).anyMatch(k -> a[k] == Math.sqrt(b[h]))).count();
        return count == count2 & count == a.length & count2 == b.length;
    }
}