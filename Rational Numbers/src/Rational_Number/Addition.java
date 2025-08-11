package Rational_Number;

public class Addition {
    public Rational_Num add(Rational_Num r1, Rational_Num r2) {
        int newN = (r1.getN() * r2.getD()) + (r2.getN() * r1.getD());
        int newD = r1.getD() * r2.getD();
        return new Rational_Num(newN, newD);
    }
}
