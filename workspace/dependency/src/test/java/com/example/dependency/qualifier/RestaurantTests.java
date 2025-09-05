package com.example.dependency.qualifier;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class RestaurantTests {
    @Autowired

    private Restaurant restaurant;

    @Test
    public void testRestaurant() {
        log.info("restaurant: {}", restaurant);
        Assertions.assertThat(restaurant).isNotNull();
    }
    @Test
    public void testfindvips() {
        log.info("restaurant:vips {}", restaurant);
        Assertions.assertThat(restaurant).isNotNull();
    }
}
