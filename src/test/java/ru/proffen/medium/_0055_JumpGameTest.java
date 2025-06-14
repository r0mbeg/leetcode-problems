package ru.proffen.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class _0055_JumpGameTest {

    @Test
    void testExampleCase_ShouldReturnTrue(){
        _0055_JumpGame solver = new _0055_JumpGame();
        boolean result = solver.canJump(new int[]{2,3,1,1,4});
        assertTrue(result);
    }

    @Test
    void testExampleCase_ShouldReturnFalse(){
        _0055_JumpGame solver = new _0055_JumpGame();
        boolean result = solver.canJump(new int[]{3,2,1,0,4});
        assertFalse(result);
    }

}
