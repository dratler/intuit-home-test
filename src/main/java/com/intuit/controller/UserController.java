package com.intuit.controller;

import com.google.inject.Inject;
import com.intuit.datasource.UserDao;
import com.intuit.datasource.jooq.paymentdb.tables.pojos.User;

import java.util.Objects;

public class UserController {

    @Inject
    private UserDao dao;

    public User findUserByGuid(String guid) throws Exception {
        if(Objects.isNull(guid)){
            throw new Exception("Sending Null Value is forbidden to get user");
        }
        return dao.findByValue(guid);
    }

}
