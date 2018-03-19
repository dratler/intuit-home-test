package com.intuit.rest.route;

import com.intuit.controller.business_logic.PayeeController;
import com.intuit.controller.business_logic.PaymentController;
import com.intuit.controller.business_logic.PaymentMethodController;
import com.intuit.controller.util.ProducerController;
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

    @Inject private ProducerController producerController;

    @Path("/method")
    @GET
    public Result getPaymentMethods() throws Exception {
        return Results.json(paymentMethodController.getMethods());


    }

    @Path("/payee")
    @GET
    public Result getPayee() throws Exception {
        return Results.json(payeeController.getPayee());
    }

    @POST
    public Result createPayment(@Body Payment payment){
        try{
            paymentController.validEntry(payment);
        } catch (Exception e){
            return Results.json(e).status(400);
        }
        try {
            producerController.sendToQueue(payment);
            return Results.noContent();
        } catch (Exception e){
            return Results.json(e).status(500);
        }
    }

}