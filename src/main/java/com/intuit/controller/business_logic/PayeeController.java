package com.intuit.controller.business_logic;

import com.intuit.controller.util.HttpService;

import javax.inject.Inject;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PayeeController {

    @Inject
    private HttpService httpService;


    public List<String> getPayee() throws Exception {
        return httpService.getData("payee");
    }


    public String findByGuid(String guid) throws Exception {
        if(Objects.isNull(guid)){
            throw new Exception("Sending Null Value is forbidden to get Payee");
        }
        List<String> payee = getPayee();
        Optional<String> found = payee.stream().filter(p->p.equals(guid)).findFirst();
        if(!found.isPresent())
            throw new Exception("Payee not found for guid "+guid);
        return found.get();
    }
}
