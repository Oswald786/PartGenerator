package com.ethan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FundsRequestTest {
    FundsRequest fundsTest = new FundsRequest();



    @Test
    void getFunds() {
       Assertions.assertEquals(0.00,fundsTest.getFunds());
    }

    @Test
    void setFunds() {
        fundsTest.setFunds(20);
        Assertions.assertEquals(20,fundsTest.getFunds());
    }

}