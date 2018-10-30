package com.alevel;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void validateTestShouldFail() {
        Utils.validate(0, 1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateStringTest() {
        Utils.validateString("[A-Z]{2,4}\\d{3,5}", "12345678");
    }
}