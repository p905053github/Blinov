package com.epam.task1.entity;

public class Ball {
    private int weight;
    private Color color;

    public Ball(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }
    public void setColor(Color color){
        this.color=color;
    }
    public Color getColor(){
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        if (weight != ball.weight) return false;
        return color == ball.color;
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
