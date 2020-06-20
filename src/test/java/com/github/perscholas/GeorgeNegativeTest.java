package com.github.perscholas;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author leonhunter
 * @created 06/19/2020 - 7:56 PM
 */
public class GeorgeNegativeTest {
    @Test
    public void test1() {
        // Given
        String input = "george ";
        Boolean expectedOutput = false;
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        Boolean actualOutput = nameEvaluator.isGeorge(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test2() {
        // Given
        String input = " George";
        Boolean expectedOutput = false;
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        Boolean actualOutput = nameEvaluator.isGeorge(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test3() {
        // Given
        String input = "GE orge";
        Boolean expectedOutput = false;
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        Boolean actualOutput = nameEvaluator.isGeorge(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void test4() {
        // Given
        String input = "alice";
        Boolean expectedOutput = false;
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        Boolean actualOutput = nameEvaluator.isGeorge(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void test5() {
        // Given
        String input = "alan";
        Boolean expectedOutput = false;
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        Boolean actualOutput = nameEvaluator.isGeorge(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void test6() {
        // Given
        String input = "sally";
        Boolean expectedOutput = false;
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        Boolean actualOutput = nameEvaluator.isGeorge(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void test7() {
        // Given
        String input = "bill";
        Boolean expectedOutput = false;
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        Boolean actualOutput = nameEvaluator.isGeorge(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
