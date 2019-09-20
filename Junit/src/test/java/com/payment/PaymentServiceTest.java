package com.payment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentServiceTest {

    private  PaymentService instance;

    @Before
    public void setUp() {
        instance = new PaymentService();
    }

    @Test
    public void shouldReturnNotNullResult () {
        PaymentResult result = instance.getPaymentResult();
        assertNotNull(result);
    }

    @Test
    public void shouldReturnJustTwoOption() {
        PaymentResult result = instance.getPaymentResult();
        boolean check = false;

        if (result.equals(PaymentResult.SUCCESS) | result.equals(PaymentResult.FAILURE)) {
            check = true;
        }

        assertTrue(check);

    }

}