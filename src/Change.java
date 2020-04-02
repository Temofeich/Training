import java.util.Arrays;

public class Change {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 7, 6, 45, 2, 34, 11, 3};
        System.out.println(Arrays.toString(array));
        int NUMBER = 6;
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > NUMBER){
                array[i] = NUMBER;
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Количество замен " + count);
    }
}
