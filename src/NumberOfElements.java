public class NumberOfElements {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 7, 6, 0, 45, -8, 2, 34, -4,  11, 3};
        int countPositive = 0;
        int countNegative = 0;
        int countNull = 0;
        for (int value : array){
            if (value > 0){
                countPositive++;
            }else if (value < 0){
                countNegative++;
            } else {
                countNull++;
            }
        }
        System.out.println(countPositive);
        System.out.println(countNegative);
        System.out.println(countNull);
    }
}
