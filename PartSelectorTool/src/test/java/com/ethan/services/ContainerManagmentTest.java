package com.ethan.services;

import com.ethan.model.PcPart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainerManagmentTest {
    ContainerManagment testContainer = new ContainerManagment();

    @Test
    void getPartListLowTier() {
        for (PcPart part:testContainer.getLowTierContainer().getContainer()){
            Assertions.assertNotNull(part);
        }
    }

    @Test
    void getAllParts() {
        for (PcPart part:testContainer.getAllPartsContainer().getContainer()){
            Assertions.assertNotNull(part);
        }
    }

    @Test
    void getPartListMidTier() {
        for (PcPart part:testContainer.getMidTierContainer().getContainer()){
            Assertions.assertNotNull(part);
        }
    }

    @Test
    void getPartListHighTier() {
        for (PcPart part:testContainer.getHighTierContainer().getContainer()){
            Assertions.assertNotNull(part);
        }
    }

    @Test
    void getPartListLegandaryTier() {
        for (PcPart part:testContainer.getLegendaryTierContainer().getContainer()){
            Assertions.assertNotNull(part);
        }
    }
}