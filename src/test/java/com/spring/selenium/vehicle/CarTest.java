package com.spring.selenium.vehicle;

import com.spring.selenium.BaseTest;
import com.spring.selenium.condition.vehicle.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CarTest extends BaseTest {

    @Autowired
    @Qualifier("Ford")
    Car car;
    @Test
    public void findCarSpeed(){
        car.speed();
    }
}
