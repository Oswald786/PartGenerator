package com.ethan.controller;

import com.ethan.model.CustomerOrder;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/v1Customer")

public class CustomerController {

    @Post("storeOrder")
    public CustomerOrder storeOrder(@Body CustomerOrder order){
        //info to store to wherever i would want database etc
        return order;
    }
}
