package com.farhan.others;

final public class Geometry {

    public double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double cirlePeri(double radius) {
        return 2 * Math.PI * radius;
    }

    public double squareArea(double side) {
        return side * side;
    }

    public double squarePeri(double side) {
        return 4 * side;
    }

    public double rectangleArea(double length, double width) {
        return length * width;
    }

    public double rectanglePeri(double length, double width) {
        return 2 * (length + width);
    }

}
