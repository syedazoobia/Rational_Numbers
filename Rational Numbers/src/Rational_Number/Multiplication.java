package Rational_Number;

public class Multiplication {
    public Rational_Num multiply(Rational_Num r1, Rational_Num r2) {
        int newN = r1.getN() * r2.getN();
        int newD = r1.getD() * r2.getD();
        return new Rational_Num(newN, newD);
    }
}
