package com.interviewdot.ILoveJavaProgramming;

import java.math.BigInteger;

public class BigIntegerToPrimitive {
    public static void main(String[] args) {
        BigInteger bigNr = BigInteger.valueOf(Long.MAX_VALUE);
        long longNr = bigNr.longValue();

        System.out.println(bigNr);
        System.out.println(longNr);

        int intNr = bigNr.intValue();
        System.out.println(intNr);

        long nrExactLong = bigNr.longValueExact();
        int nrExactInt = bigNr.intValueExact();

    }
}
