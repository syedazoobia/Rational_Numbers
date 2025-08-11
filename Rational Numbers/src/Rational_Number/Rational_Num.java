package Rational_Number;
public class Rational_Num {
    private int numerator;
    private int denominator;

    public Rational_Num() {
        this.denominator = 1;
        this.numerator = 1;
    }

    public Rational_Num(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can not be zero");
            System.exit(0);
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
            simplify();
        }
    }

    public Rational_Num(Rational_Num other) {
        this.numerator = other.numerator;
        this.denominator = other.denominator;
    }

    public void set(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can not be zero");
            System.exit(0);
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public int getN() {
        return numerator;
    }

    public int getD() {
        return denominator;
    }

    public void simplify() {
        int a = numerator;
        int b = denominator;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;
        numerator /= gcd;
        denominator /= gcd;
    }

    @Override
    public String toString() {
    return numerator + "/" + denominator;
}


}