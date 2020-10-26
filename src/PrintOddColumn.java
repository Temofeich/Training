import java.util.Random;

public class PrintOddColumn {
    // Дана матрица. Вывести на экран все нечетные столбцы, у которых
//    первый элемент больше последнего
    public static void main(String[] args) {
        int[][] matrix = new int[6][4];
        init(matrix);
        print(matrix);
        printOddColumn(matrix);
    }

    public static void init(int[][] matrix) {
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void printOddColumn(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j += 2) {
                if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                    System.out.printf("%4d", ints[j]);
                }
            }
            System.out.println();
        }
    }
}