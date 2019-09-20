package com.payment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceServiceTest {

    private  PriceService instance;

    @Before
    public void setUp() {
        instance = new PriceService();
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldReturnExceptionWhenPriceNegative () {
        instance.validatePrice(-1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldReturnExceptionWhenPriceEqualsZero () {
        instance.validatePrice(0);
    }

}