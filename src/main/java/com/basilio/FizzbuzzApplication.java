package com.basilio;

public class FizzbuzzApplication {

    // "Write a program that prints the numbers from 1 to 100.
    // But for multiples of three print “Fizz” instead of the number
    // and for the multiples of five print “Buzz”.
    // For numbers which are multiples of both three and five print “FizzBuzz”."
    public static void main(String[] args) {

        // iterate from 100 to 0 b/c i heard on CodingBlocks an additional
        // requirement is to not start with for (int i = 1 ...)
        int count = 100;
        do {
            if (count % 3 == 0 && count % 5 == 0) {

                // highest priority is multiple of 3 and 5
                System.out.println("FizzBuzz");

            } else if (count % 3 == 0) {

                // multiples of 3 print Fizz
                System.out.println("Fizz");

            } else if (count % 5 == 0) {

                // multiples of 5 print Buzz
                System.out.println("Buzz");

            } else {

                // then if nothing else matches print number
                System.out.println(count);

            }

            --count;
        } while (count != 0);

    }
}
