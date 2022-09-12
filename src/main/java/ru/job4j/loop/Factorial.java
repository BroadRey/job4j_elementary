package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int result = 0;
        result += n * calc(n - 1);
        return result;
    }
}