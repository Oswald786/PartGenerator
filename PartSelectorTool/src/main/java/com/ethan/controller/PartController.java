package com.ethan.controller;

import com.ethan.model.CustomerOrder;
import com.ethan.model.FundsRequest;
import com.ethan.model.PcPart;
import com.ethan.services.BettingLogic;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import java.util.List;


@Controller("/v1Part")

public class PartController {

    private BettingLogic bettingLogic;

    public PartController(BettingLogic bettingLogic) {
        this.bettingLogic = bettingLogic;
    }

    //gets pc part based on input
    @Post("/PcPart")
    public PcPart returnPrize(@Body FundsRequest funds){
        return bettingLogic.findTierItem(funds.getFunds());

    }
    //retrieves all parts available
    @Get("/PartsAvailable")
    public List<PcPart> returnPrizes(){
        return this.bettingLogic.retriveParts();
    }
}
