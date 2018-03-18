package com.intuit.rest.route;

import com.intuit.controller.PayeeController;
import com.intuit.controller.PaymentController;
import com.intuit.controller.PaymentMethodController;
import com.intuit.model.Payment;
import org.jooby.Result;
import org.jooby.Results;
import org.jooby.mvc.Body;
import org.jooby.mvc.GET;
import org.jooby.mvc.POST;
import org.jooby.mvc.Path;

import javax.inject.Inject;

@Path("/payment")
public class PaymentRoute {

    @Inject
    private PayeeController payeeController;

    @Inject
    private PaymentMethodController paymentMethodController;

    @Inject
    private PaymentController   paymentController;

    @Path("/method")
    @GET
    public Result getPaymentMethods() {
        return Results.json(paymentMethodController.getMethods());


    }

    @Path("/payee")
    @GET
    public Result getPayee() {
        return Results.json(payeeController.getPayee());
    }

    @POST
    public Result createPayment(@Body Payment payment){
        try{
            paymentController.validEntry(payment);
        } catch (Exception e){
            return Results.json(e).status(400);
        }
        paymentController.sendToQueue(payment);
        return Results.noContent();
    }

}