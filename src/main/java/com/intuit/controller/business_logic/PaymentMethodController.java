package com.intuit.controller.business_logic;

import com.intuit.controller.util.HttpService;

import javax.inject.Inject;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PaymentMethodController {
    @Inject
    private HttpService httpService;

    public List<String> getMethods() throws Exception {
        return httpService.getData("payment_method");
    }

    public String findByGuid(String guid) throws Exception {
        if(Objects.isNull(guid)){
            throw new Exception("Sending Null Value is forbidden to get Payment Method");
        }
        List<String> paymentMethods = getMethods();
        Optional<String> found = paymentMethods
                .stream()
                .filter(pm->pm.equals(guid))
                .findFirst();
        if(!found.isPresent())
            throw new Exception("Method not found by guid : "+guid);
        return found.get();
    }


}
