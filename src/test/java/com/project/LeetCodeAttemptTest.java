package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void checkIfOneStringSwapCanMakeStringsEqualTest() {

        assertTrue(LeetCodeAttempt.checkIfOneStringSwapCanMakeStringsEqual("bank", "kanb"));
        assertFalse(LeetCodeAttempt.checkIfOneStringSwapCanMakeStringsEqual("attack", "defend"));
        assertTrue(LeetCodeAttempt.checkIfOneStringSwapCanMakeStringsEqual("kelb", "kelb"));

    }

}
