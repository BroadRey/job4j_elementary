package ru.job4j.converter;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ConverterTest {

    @Test
    void whenConvert200RblThen3dot3333Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvertNegativeNumberThen0Dlr() {
        float in = -1;
        float expected = 0;
        float result = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, result, eps);
    }
}