package com.nc.spring.core;

public class MyQuoter implements Quoter {
    @Override
    public void saySmth() {
        System.out.println("It's my quoter!");
    }
}
