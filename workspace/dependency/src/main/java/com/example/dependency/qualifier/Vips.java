package com.example.dependency.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Stack;

@Component
@Qualifier("vips")
public class Vips implements Restaurant {
    int StackPrice = 28000;
    @Override
    public int getStackPrice() {
        return StackPrice;
    }

    @Override
    public boolean UseOfSauna() {
        return true;
    }
}
