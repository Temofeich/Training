public class MinLength {
    // найти минимальную длину отрезка , в который входят все значения массива
    public static void main(String[] args) {

        int[] array = new int[]{5, 4, 5, 35, 45, 34, 11, 3};
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
            int minLength = max - min;
        System.out.println(minLength);
        }
    }