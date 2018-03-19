package com.intuit.controller.util;

import org.apache.commons.lang3.RandomUtils;

public class RiskEngine {

    public Byte evaluate(){
        int results = RandomUtils.nextInt(0,100);
        return (results < 70) ?  Byte.valueOf("1") : Byte.valueOf("0");
    }
}
