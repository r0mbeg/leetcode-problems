package ru.proffen.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class _0069_SqrtXTest {

    @Test
    void testExampleCase(){
        _0069_SqrtX solver = new _0069_SqrtX();
        int result = solver.mySqrt(64);
        assertEquals(8, result);
    }
}
