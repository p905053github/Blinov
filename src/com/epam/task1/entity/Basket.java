package com.epam.task1.entity;

import java.util.List;
import java.util.StringJoiner;

public class Basket {
    private List<Ball> basket;

    public Basket(List<Ball> list) {
        this.basket = list;
    }

    public List<Ball> getList() {
        return basket;
    }

    public void setList(List<Ball> list) {
        this.basket = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Basket basket1 = (Basket) o;

        return basket != null ? basket.equals(basket1.basket) : basket1.basket == null;
    }

    @Override
    public int hashCode() {
        return basket != null ? basket.hashCode() : 0;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Basket.class.getSimpleName() + "[", "]")
                .add("basket=" + basket)
                .toString();
    }
}
