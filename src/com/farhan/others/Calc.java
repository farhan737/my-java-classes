package com.farhan.others;

public class Calc {

    public boolean isOdd(int num) {
        return !(num % 2 == 0);
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public int countDigits(int num) {
        int i = 0;
        while (num > 0) {
            num = num / 10;
            i++;
        }
        return i;
    }

    public boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = countDigits(num);

        while (num > 0) {
            sum += Math.pow(num % 10, digits);
            num /= 10;
        }
        return sum == original;
    }

    public int reverseNum(int num) {
        int reverse = 0;
        int i = (int) Math.pow(10, (countDigits(num) - 1));
        int n = 1;
        while (i > 0) {
            reverse += (num / i) * n;
            num %= i;
            i /= 10;
            n *= 10;
        }
        return reverse;
    }
}
