package com.github.perscholas;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author leonhunter
 * @created 06/19/2020 - 8:02 PM
 */
public class GetNameEvaluationGeorge {
    @Test
    public void test1() {
        // Given
        String input = "george";
        String expectedOutput = "Welcome, George!";
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        String actualOutput = nameEvaluator.getNameEvaluation(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test2() {
        // Given
        String input = "George";
        String expectedOutput = "Welcome, George!";
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        String actualOutput = nameEvaluator.getNameEvaluation(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test3() {
        // Given
        String input = "GEorge";
        String expectedOutput = "Welcome, George!";
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        String actualOutput = nameEvaluator.getNameEvaluation(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
