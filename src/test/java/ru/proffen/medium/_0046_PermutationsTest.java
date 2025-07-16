package ru.proffen.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class _0046_PermutationsTest {
    @Test
    void testExampleCase1(){
        _0046_Permutations solver = new _0046_Permutations();
        List<List<Integer>> result = solver.permute(new int[]{1,2});
        assertEquals(result, List.of(List.of(1, 2), List.of(2, 1)));
    }
}
