package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    public void left5Right3Then5() {
        int left = 5;
        int right = 3;

        int expected = 5;

        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void right8Left3Then8() {
        int left = 3;
        int right = 8;

        int expected = 8;

        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void left6Right6Then6() {
        int left = 6;
        int right = 6;

        int expected = 6;

        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }
}