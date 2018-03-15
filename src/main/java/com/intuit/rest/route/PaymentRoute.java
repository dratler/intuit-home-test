package com.intuit.rest.route;

import com.intuit.moduls.RabbitMq;
import com.intuit.mq.service.MqPaymentController;
import com.intuit.rest.controller.PayeeController;
import com.intuit.rest.controller.PaymentMethodController;
import org.jooby.Result;
import org.jooby.Results;
import org.jooby.mvc.GET;
import org.jooby.mvc.Path;

import javax.inject.Inject;

@Path("/payment")
public class PaymentRoute {

    @Inject
    private PayeeController payeeController;

    @Inject
    private PaymentMethodController paymentMethodController;

    @Inject
    private MqPaymentController rabbitMq;


    //TODO - build services + controller for the API's
    @Path("/method")
    @GET
    public Result getPaymentMethods() {
        rabbitMq.sendMessage("Hi");
        return Results.json(paymentMethodController.getMethods());


    }

    @Path("/payee")
    @GET
    public Result getPayee() {
        rabbitMq.sendMessage("Hi");
        return Results.json(payeeController.getPayee());
    }
}