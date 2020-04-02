import java.util.Arrays;

public class ChangeMinAndMax {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 5, 35, 45, 34, 11, 3};
        System.out.println("Array before change : " + Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        System.out.println("Minimum " + min + " ; " + "Maximum " + max);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[i] = min;
            }
            else if (array[i] == min) {
                array[i] = max;
            }
        }
            System.out.println("Array after change : " + Arrays.toString(array));
        }
    }