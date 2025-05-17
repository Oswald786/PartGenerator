package com.ethan.controller;

import com.ethan.model.CustomerOrder;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

import java.io.*;

@Controller("/v1Customer")

public class CustomerController {

    @Post("/PlaceOrder")
    public void placeOrder(@Body CustomerOrder order){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter( order.getSurname() + "Order.txt"));
            writer.write("customer name: " + order.getForename() + " " + order.getSurname());
            writer.write("\ncustomer Age: " + order.getAge());
            writer.write("\ncustomer delivery address: " + order.getFullAddress());
            writer.write("\ncustomer mobile: " + order.getMobileNumber());
            writer.write("\nPart ordered name: " + order.getPartOrdered().getPartName() + "\nPart msrp: " + order.getPartOrdered().getMsrp() + "\nPart Catagory: " + order.getPartOrdered().getPartCatagory() + "\nPart Tier: " + order.getPartOrdered().getPartTier());
            writer.close();
            // could improve by adding marker for where order file is now stored could be sent to database or something similar.
            System.out.println("order created use path ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
