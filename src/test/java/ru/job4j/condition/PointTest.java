package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void when32to66Then5() {
        int x1 = 3;
        int y1 = 2;
        int x2 = 6;
        int y2 = 6;
        double expected = 5;
        double result = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    void when90to07Then11dot40() {
        int x1 = 9;
        int y1 = 0;
        int x2 = 0;
        int y2 = 7;
        double expected = 11.40;
        double result = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    void when00to00Then0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double expected = 0;
        double result = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    void when44to41Then3() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 4;
        int y2 = 1;
        double expected = 3;
        double result = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, result, 0.01);
    }
}