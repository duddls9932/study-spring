package com.example.dependency.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Outback implements Restaurant {
    int StackPrice = 35000;
    @Override
    public int getStackPrice() {
        return StackPrice;
    }

    @Override
    public boolean UseOfSauna() {
        return false;
    }
}
