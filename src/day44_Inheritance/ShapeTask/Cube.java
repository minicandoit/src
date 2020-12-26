package day44_Inheritance.ShapeTask;

public final class Cube extends Shape {

    public double side;

    public Cube(double side) {
        super("Cube");
        this.side = side;

    }

    @Override
    public double calcArea() {
        /*
        Square square=new Square(side);//one square of the cube
       double area=square.calcArea();//area one of one square
       return area*6;

         */
        return new Square(side).calcArea()*6;
    }

    @Override
    public double calcPerimeter() {
        return new Square(side).calcPerimeter()*6;
    }
}
