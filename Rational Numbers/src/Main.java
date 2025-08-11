import Rational_Number.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Rational_Num r1 = new Rational_Num(34, 90);
        Rational_Num r2 = new Rational_Num(7, 9);

        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication m = new Multiplication();
        Division d = new Division();

        System.out.println("ADDITION: "+add.add(r1, r2));
        System.out.println("SUBTRACTION: "+sub.sub(r1, r2));
        System.out.println("MULTIPLICATION: "+m.multiply(r1, r2));
        System.out.println("DIVISION: "+d.divide(r1, r2));

    }

}
