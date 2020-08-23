public class AreSame {
// определить являются ли числа из  массива A квадратным корнем чисел из массива B
    public static void main(String[] args) {
        System.out.println(comp(a, b));
    }

//    static int[] a = {121, 144, 121, 161, 19, 121, 2, 11};
//    static int[] b = {121, 14641, 20736, 14641, 25921, 4, 14641, 361};

    static int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
    static int[] b = {132, 14641, 20736, 361, 25921, 361, 20736, 361};

    public static boolean comp(int[] a, int[] b) {
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == Math.sqrt(b[j])) {
                    count++;
                    break;
                }
            }
        }
        for (int h = 0; h < b.length; h++) {
            for (int k = 0; k < a.length; k++) {
                if (a[k] == Math.sqrt(b[h])) {
                    count2++;
                    break;
                }
            }
        }
        System.out.println(count);
        System.out.println(count2);
        return count == count2 & count == a.length & count2 == b.length;
    }
}