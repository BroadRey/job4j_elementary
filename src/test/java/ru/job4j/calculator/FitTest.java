package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FitTest {

    @Test
    void whenMan150Then57dot5() {
        short height = 150;
        double expected = 57.5;
        double result = Fit.manWeight(height);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    void whenWoman178Then78dot2() {
        short height = 178;
        double expected = 78.2;
        double result = Fit.womanWeight(height);
        Assert.assertEquals(expected, result, 0.01);
    }
}