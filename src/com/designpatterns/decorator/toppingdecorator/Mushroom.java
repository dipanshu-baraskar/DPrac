package com.designpatterns.decorator.toppingdecorator;

import com.designpatterns.decorator.pizza.BasePizza;

public class Mushroom extends ToppingDecorator{
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+15;
    }
}
