public class MaxPointDistance {
    // найти наибольшее расстояние между двумя точками на оси координат
    public static void main(String[] args) {
        int xx1 = 0;
        int yy1 = 0;
        int xx2 = 1;
        int yy2 = 1;

        int[] masX = new int[]{2, 1, 2, 3, 3, 6};
        int[] masY = new int[]{2, 6, 4, 1, 3, 1};

        double dis = dist(masX[0], masY[0], masX[1], masY[1]);

        for (int i = 0; i < masX.length - 1; i++) {
            for (int j = 1; j < masY.length; j++) {
                double dd = dist(masX[i], masY[i], masX[j], masY[j]);
                if (dd > dis) {
                    dis = dd;
                    xx1 = i;
                    yy1 = i;
                    xx2 = j;
                    yy2 = j;
                }
            }
        }
        System.out.println("1:{ " + masX[xx1] + "; " + masY[yy1] + " }");
        System.out.println("2:{ " + masX[xx2] + "; " + masY[yy2] + " }");
    }

    public static double dist(int x, int y, int x1, int y1) {
        if (x == x1){
            return Math.abs(y-y1);
        } else if (y == y1){
            return Math.abs(x-x1);
        } else
            return Math.sqrt(Math.pow((x - x1),2) + Math.pow((y - y1), 2));
    }

}