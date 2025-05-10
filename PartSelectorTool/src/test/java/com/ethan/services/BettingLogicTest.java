package com.ethan.services;

import com.ethan.model.PcPart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BettingLogicTest {
    private BettingLogic testlogic = new BettingLogic();

    @Test
    void findTierItem() {
        PcPart retirvedPart = testlogic.findTierItem(500);
        for (PcPart part : testlogic.retriveParts()){
            if (part == retirvedPart){
                Assertions.assertSame(retirvedPart,part);
            }
        }

    }
}