package com.nc.spring.core;

import javax.annotation.PostConstruct;

public class TerminatorQuoter implements Quoter {
    @InjectRandomInt(min = 2, max = 10)
    private int repeat;

    @PostConstruct
    void init() {
        System.out.println("My repeat = " + repeat);
    }

    @Override
    public void saySmth() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("I'm terminator!");
        }
    }
}
