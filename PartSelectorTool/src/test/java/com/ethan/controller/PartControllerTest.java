package com.ethan.controller;

import com.ethan.model.FundsRequest;
import com.ethan.model.PcPart;
import com.ethan.services.BettingLogic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartControllerTest {

    @Test
    void returnPrize() {
        FundsRequest funds = new FundsRequest();
        funds.setFunds(50.00);
        BettingLogic logic = new BettingLogic();
        PcPart part = logic.findTierItem(funds.getFunds());
        Assertions.assertNotNull(part);
    }
}