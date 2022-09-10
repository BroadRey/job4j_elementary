package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SqAreaTest {

    @Test
    void whenP3K7Then0dot24() {
        int p = 3;
        double k = 7;
        double expected = 0.24;
        double result = SqArea.square(p, k);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    void whenP5K2Then1dot38() {
        int p = 5;
        double k = 2;
        double expected = 1.38;
        double result = SqArea.square(p, k);
        Assert.assertEquals(expected, result, 0.01);
    }
}