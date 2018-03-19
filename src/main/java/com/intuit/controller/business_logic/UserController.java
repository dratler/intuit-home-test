package com.intuit.controller.business_logic;


import com.intuit.controller.util.HttpService;

import javax.inject.Inject;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserController {

    @Inject private HttpService httpService;

    public String findUserByGuid(String guid) throws Exception {
        if(Objects.isNull(guid)){
            throw new Exception("Sending Null Value is forbidden to get user");
        }
        List<String> users = httpService.getData("users");
        Optional<String> found = users
                .stream()
                .filter(user->user.equals(guid))
                .findFirst();
        if(!found.isPresent()){
            throw new Exception("Requested User ("+guid+") not found");
        }
        return found.get();
    }

}
