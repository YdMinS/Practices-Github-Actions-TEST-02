package com.ydmins.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodTest {

    @Test
    void checkTrue() {
        // given
        String strLongerThan5 = "String";
        String str5Long = "aaaaa";
        String strShorterThan5 = "bbbb";
        String strEmpty = "";
        // when
        boolean result1 = Method.checkTrue(strLongerThan5);
        boolean result2 = Method.checkTrue(str5Long);
        boolean result3 = Method.checkTrue(strShorterThan5);
        boolean result4 = Method.checkTrue(strEmpty);
        // then
        assertTrue(result1);
        assertFalse(result2);
        assertFalse(result3);
        assertFalse(result4);
    }
}