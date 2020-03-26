public class Training1 {
    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double z;

        // z = ((a - 3 )* b / 2) + c
        a = 7.4;
        b = 3.2;
        c = 5.1;
        z = ((a - 3) * b / 2) + c;
        System.out.println(z);

        double v = 45;
        double n;
        n = Math.sin(v);
        System.out.println(n);

        // Поиск углов треугольника , если известны длины сторон
        double cornerC = Math.acos((a*a + b*b - c*c) / 2*a*b ); // теорема косинусов для определения угла треугольника
        double cornerCRadian = cornerC * Math.PI / 180; // перевод из градусов в радианы
        System.out.println(cornerC + " градусов и " + cornerCRadian + " радиан");

        double cornerA = Math.acos((c*c + b*b - a*a) / 2*c*b );
            System.out.println(cornerA);

        double cornerB = Math.acos((a*a + c*c - b*b) / 2*a*c );
        System.out.println(cornerB);




    }
}