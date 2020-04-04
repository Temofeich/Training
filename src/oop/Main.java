package oop;

public class Main {
    public static void main(String[] args) {

     Fraction fr1 = new Fraction(1,3);
     Fraction fr2 = new Fraction(4,5);

     int num = 2;

     Fraction fr3 = fr1.add(num);
     Fraction fr4 = fr1.add(fr2);

        System.out.println(fr3.getNumerator() + "/" + fr3.getDenominator());
        System.out.println(fr4.getNumerator() + "/" + fr4.getDenominator());
    }
}