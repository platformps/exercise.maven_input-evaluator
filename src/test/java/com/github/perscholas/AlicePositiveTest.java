package com.github.perscholas;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class AlicePositiveTest {
    @Test
    public void test1() {
        // Given
        String input = "alice";
        Boolean expectedOutput = true;
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        Boolean actualOutput = nameEvaluator.isAlice(input);

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
        Boolean actualOutput = nameEvaluator.isAlice(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test3() {
        // Given
        String input = "ALice";
        Boolean expectedOutput = true;
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        Boolean actualOutput = nameEvaluator.isAlice(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void test4() {
        // Given
        String input = "ALIce";
        Boolean expectedOutput = true;
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        Boolean actualOutput = nameEvaluator.isAlice(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void test5() {
        // Given
        String input = "ALICe";
        Boolean expectedOutput = true;
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        Boolean actualOutput = nameEvaluator.isAlice(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void test6() {
        // Given
        String input = "ALICE";
        Boolean expectedOutput = true;
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        Boolean actualOutput = nameEvaluator.isAlice(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void test7() {
        // Given
        String input = "AlicE";
        Boolean expectedOutput = true;
        NameEvaluator nameEvaluator = new NameEvaluator();

        // when
        Boolean actualOutput = nameEvaluator.isAlice(input);

        //then
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
