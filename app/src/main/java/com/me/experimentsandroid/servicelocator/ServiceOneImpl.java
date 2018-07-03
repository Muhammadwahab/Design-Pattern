package com.me.experimentsandroid.servicelocator;

import com.me.experimentsandroid.servicelocator.contracts.Service;

public class ServiceOneImpl  implements Service {
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "ServiceOneImpl";
    }
}
