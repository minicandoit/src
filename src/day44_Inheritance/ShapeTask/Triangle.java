package day44_Inheritance.ShapeTask;

public  final class Triangle extends Shape{
    //if super class have constructor you have to call the constructor in sub class
    public double height,base,side;

    public Triangle(double height, double base,double side) {
        super("Triangle");
        this.height = height;
        this.base = base;
        this.side=side;
    }

    @Override
    public double calcArea() {
        return base*height*0.5;
    }

    @Override
    public double calcPerimeter() {
        return base+side*2;//?????? different side?
    }
}
