package com.me.experimentsandroid.servicelocator;

import com.me.experimentsandroid.servicelocator.contracts.Service;

public class ServiceTwoImpl implements Service {
    public void execute(){
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "ServiceTwoImpl";
    }
}
