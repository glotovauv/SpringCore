package com.nc.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Library {
    @Autowired
    @Qualifier("terminatorQuoter")
    private Quoter quoter;

    public void doSmth() {
        quoter.saySmth();
    }
}
