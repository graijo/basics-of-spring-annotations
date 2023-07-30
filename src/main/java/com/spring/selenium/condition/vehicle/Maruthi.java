package com.spring.selenium.condition.vehicle;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnExpression("${car.speed}<70")
@Qualifier("Maruthi")
public class Maruthi implements Car{

    @Override
    public void speed() {
        System.out.println("Maruthi Car running at 50/hr");
    }
}
