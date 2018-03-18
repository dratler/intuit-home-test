package com.intuit.datasource;

import com.google.inject.Inject;
import com.intuit.datasource.jooq.paymentdb.tables.pojos.User;
import org.jooq.DSLContext;

import java.util.Objects;

import static com.intuit.datasource.jooq.paymentdb.tables.User.USER;

public class UserDao {

    @Inject
    private DSLContext dsl;

    public User findByValue(String userId) throws Exception {
        User user = dsl.selectFrom(USER).where(USER.VALUE.eq(userId)).fetchOneInto(User.class);
        if(Objects.isNull(user)){
            throw new Exception("Requested ("+userId+") User is not found ");
        }
        return user;
    }
}
