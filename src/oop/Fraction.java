package oop;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        if (denominator == 0){
            throw new RuntimeException("Denominator = 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(int number){
        int newNum;
        int newDen;

        newDen = denominator * 1;
        newNum = numerator * 1 + number * denominator;

        return new Fraction(newNum,newDen);
    }

    public Fraction add(Fraction obj){
        int newNum;
        int newDen;

        newDen = denominator * obj.denominator;
        newNum = numerator * obj.denominator + denominator * obj.numerator;

        return new Fraction(newNum,newDen);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

}