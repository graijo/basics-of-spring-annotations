package com.spring.selenium.condition.vehicle;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnExpression("${car.speed}>70")
@Qualifier("Ford")
public class Ford implements Car{
    @Override
    public void speed() {
        System.out.println("Ford Car running at 80km/hr");
    }
}
