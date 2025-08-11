package Rational_Number;

public class Division {
    public Rational_Num divide(Rational_Num r1, Rational_Num r2) {
        int newN = r1.getN() * r2.getD();
        int newD = r1.getD() * r2.getN();

        if (newD == 0) {
            System.exit(0);
        }

        return new Rational_Num(newN, newD);
    }
}
