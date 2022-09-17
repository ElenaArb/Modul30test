package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    @DataProvider(name = "isTeenagerCorrect")
    Object[][] isTeenagerCorrect() {
        return new Object[][] {
                {13},
                {14},
                {15},
                {16},
                {17},
                {19}
        };
    }


    @DataProvider(name = "isTeenagerFalse")
    Object[][] isTeenagerFalse() {
        return new Object[][] {
                {-1},
                {0},
                {1},
                {12},
                {13},
                {19},
                {20}
        };

    }

    @Test (dataProvider = "isTeenagerCorrect")
    public void isTeenagerCorrectAge(int age) {
        boolean result = Person.isTeenager(age);
        assertTrue(result);

    }
    @Test (dataProvider = "isTeenagerFalse")
    public void isTeenagerWrongAge(int age) {
        boolean result = Person.isTeenager(age);
        assertFalse( result);

    }
}
