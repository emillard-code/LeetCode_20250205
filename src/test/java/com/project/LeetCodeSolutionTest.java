package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void areAlmostEqualTest() {

        assertTrue(LeetCodeSolution.areAlmostEqual("bank", "kanb"));
        assertFalse(LeetCodeSolution.areAlmostEqual("attack", "defend"));
        assertTrue(LeetCodeSolution.areAlmostEqual("kelb", "kelb"));

    }

}
