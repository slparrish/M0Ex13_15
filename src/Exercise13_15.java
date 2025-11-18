// Look for WRITE YOUR CODE to write your code
import java.math.*;
import java.util.Scanner;

public class Exercise13_15 {
    public static void main(String[] args) {
        // Prompt the user to enter two Rational numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rational r1 with numerator and denominator seperated by a space: ");
        String n1 = input.next();
        String d1 = input.next();

        System.out.print("Enter rational r2 with numerator and denominator seperated by a space: ");
        String n2 = input.next();
        String d2 = input.next();

        RationalUsingBigInteger r1 = new RationalUsingBigInteger(
                new BigInteger(n1), new BigInteger(d1));
        RationalUsingBigInteger r2 = new RationalUsingBigInteger(
                new BigInteger(n2), new BigInteger(d2));

        // Display results
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}

// Name the revised Rational class RationalUsingBigInteger 
class RationalUsingBigInteger extends Number
        implements Comparable<RationalUsingBigInteger> {
    // Data fields for numerator and denominator
    private BigInteger numerator = BigInteger.ZERO;
    private BigInteger denominator = BigInteger.ONE;

    public RationalUsingBigInteger(BigInteger bigInteger, BigInteger bigInteger1) {
    }


    @Override
    public int compareTo(RationalUsingBigInteger o) {
        return 0;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    public RationalUsingBigInteger add(RationalUsingBigInteger o) {
        return  o;
    }

    public RationalUsingBigInteger subtract(RationalUsingBigInteger o) {
        return o;
    }

    public RationalUsingBigInteger multiply(RationalUsingBigInteger o) {
        return o;
    }

    public RationalUsingBigInteger divide(RationalUsingBigInteger o) {
        return o;
    }

    // WRITE YOUR CODE
}