package ru.mirea.kvbo6.smetanin;

import java.math.BigInteger;
public class Factorial {
    public static BigInteger calculateFactorial(int number) {
        if (number <= 1) {
            return BigInteger.ONE;
        } else {
            return calculateFactorial(number - 1).multiply(BigInteger.valueOf(number));
        }
    }
}
