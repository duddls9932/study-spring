package com.example.dependency.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier("Laptop")
@Component
public class Laptop implements Computer {
    @Override

    public int getScreenWidth() {
        return 680;
    }
}
