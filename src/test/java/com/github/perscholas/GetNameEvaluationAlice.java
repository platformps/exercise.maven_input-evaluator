package com.github.perscholas;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author leonhunter
 * @created 06/19/2020 - 8:01 PM
 */
public class GetNameEvaluationAlice {
    @Test
    public void test1() {
        // Given
        String input = "alice";
        String expectedOutput = "Welcome, Alice!";
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        String actualOutput = nameEvaluator.getNameEvaluation(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test2() {
        // Given
        String input = "Alice";
        String expectedOutput = "Welcome, Alice!";
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        String actualOutput = nameEvaluator.getNameEvaluation(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test3() {
        // Given
        String input = "ALice";
        String expectedOutput = "Welcome, Alice!";
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        String actualOutput = nameEvaluator.getNameEvaluation(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
