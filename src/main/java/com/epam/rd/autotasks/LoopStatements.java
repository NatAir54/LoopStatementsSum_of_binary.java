package com.epam.rd.autotasks;
class LoopStatements {
    public static int task2(int n) {
       int sum = 0;
       if (n>0) {
       String convert = Integer.toBinaryString(n);
       int digit;
       for (int i=0; i<convert.length(); i++) {
           digit = convert.charAt(i) - '0';
           if (digit==1) {
               sum++;}
           } return sum;
       } else {
           throw new IllegalArgumentException();}
    }
}
