package com.github.perscholas;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author leonhunter
 * @created 06/19/2020 - 7:57 PM
 */
public class IsValidNamePositiveTest {
    @Test
    public void test1() {
        // Given
        String input = "alice";
        Boolean expectedOutput = true;
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        Boolean actualOutput = nameEvaluator.isValidName(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test2() {
        // Given
        String input = "Alice";
        Boolean expectedOutput = true;
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        Boolean actualOutput = nameEvaluator.isValidName(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void test3() {
        // Given
        String input = "george";
        Boolean expectedOutput = true;
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        Boolean actualOutput = nameEvaluator.isValidName(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void test4() {
        // Given
        String input = "George";
        Boolean expectedOutput = true;
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        Boolean actualOutput = nameEvaluator.isValidName(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
