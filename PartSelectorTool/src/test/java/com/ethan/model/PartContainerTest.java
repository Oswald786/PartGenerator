package com.ethan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PartContainerTest {

    PartContainer testContainer = new PartContainer("testContainer");
    PcPart mockPartToRemoveAndAdd = new PcPart("4090 pro",2000,"GPU","legendary");
    PcPart mockPartToFind = new PcPart("4080 pro",1600,"GPU","high");

    @Test
    void getContainer() {
        Assertions.assertNotNull(testContainer);

    }

    @Test
    void addPart() {
        testContainer.addPart(mockPartToRemoveAndAdd);
        Assertions.assertEquals(1,testContainer.getContainerContents().size());
    }

    @Test
    void removePart() {
        testContainer.removePart(mockPartToRemoveAndAdd);
        Assertions.assertEquals(0,testContainer.getContainerContents().size());
    }

    @Test
    void findPart() {
        testContainer.addPart(mockPartToFind);
        PcPart foundPart = testContainer.findPart(mockPartToFind);
        Assertions.assertSame(mockPartToFind,foundPart);
    }
}