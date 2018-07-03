package com.me.experimentsandroid.servicelocator;

import com.me.experimentsandroid.servicelocator.contracts.StringService;

public class StringServiceImpl implements StringService{


    @Override
    public int getLength(String s) {
        return s.length();
    }

}
