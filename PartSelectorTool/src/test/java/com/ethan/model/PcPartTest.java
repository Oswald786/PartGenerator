package com.ethan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PcPartTest {

    PcPart testPart = new PcPart("corsair dominater 32gb",340,"ram","mid");

    @Test
    void getPartName() {
        Assertions.assertEquals("corsair dominater 32gb",testPart.getPartName());
    }

    @Test
    void getMsrp() {
        Assertions.assertEquals(340,testPart.getMsrp());
    }

    @Test
    void getPartCatagory() {
        Assertions.assertEquals("ram",testPart.getPartCatagory());
    }
    @Test
    void getPartTier(){
        Assertions.assertEquals("mid",testPart.getPartTier());
    }
}