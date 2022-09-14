package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {1, 2, 3, 4, 5};
        int result = FindLoop.indexOf(data, 10);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[] {1, 2, 3, 4};
        int el = 8;
        int start = 1;
        int finish = 3;
        int expected = -1;
        int result = FindLoop.indexInRange(data, el, start, finish);
    }

    @Test
    public void whenDiapasonHas6Then4() {
        int[] data = new int[] {1, 2, 3, 4, 6, 8, 9, 10};
        int el = 6;
        int start = 2;
        int finish = 4;
        int expected = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
    }
}