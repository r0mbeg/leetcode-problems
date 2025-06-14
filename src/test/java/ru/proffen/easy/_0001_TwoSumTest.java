package ru.proffen.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class _0001_TwoSumTest {

    @Test
    void testExampleCase() {
        _0001_TwoSum solver = new _0001_TwoSum();
        int[] result = solver.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertTrue(isValidResult(result, new int[]{0, 1}));
    }

    @Test
    void testNegativeNumbers() {
        _0001_TwoSum solver = new _0001_TwoSum();
        int[] result = solver.twoSum(new int[]{-3, 4, 3, 90}, 0);
        assertTrue(isValidResult(result, new int[]{0, 2}));
    }

    @Test
    void testMultipleSolutions() {
        _0001_TwoSum solver = new _0001_TwoSum();
        int[] result = solver.twoSum(new int[]{1, 3, 2, 4}, 6);
        assertTrue(isValidResult(result, new int[]{2, 3}));
    }

    @Test
    void testDuplicateElements() {
        _0001_TwoSum solver = new _0001_TwoSum();
        int[] result = solver.twoSum(new int[]{3, 3}, 6);
        assertTrue(isValidResult(result, new int[]{0, 1}));
    }

    // Вспомогательный метод для проверки результата без учёта порядка индексов
    private boolean isValidResult(int[] result, int[] expected) {
        return result.length == 2 &&
                ((result[0] == expected[0] && result[1] == expected[1]) ||
                        (result[0] == expected[1] && result[1] == expected[0]));
    }
}
