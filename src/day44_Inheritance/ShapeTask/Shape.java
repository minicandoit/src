package day44_Inheritance.ShapeTask;

public class Shape {
    public String name;
    public final static boolean isShape,hasArea,hasPerimeter;//constant

    public Shape(String name){
        this.name=name;
    }
    static {//after fianl you can't initialize it again
        isShape=true;
        hasArea=true;
        hasPerimeter=true;
    }

    public double calcArea(){
        return 0;
    }

   public double calcPerimeter(){
        return 0;
   }


    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", Area= "+ calcArea()+'\''+
                ", Perimeter= "+ calcPerimeter()+'\''+
                '}';
    }
}
/*
Task: ShapesTask
        1. create a class called Shape
                        vairables: name, isShape(boolean), hasArea(boolean), hasPerimeter(boolean)
                        methods: setInfo, calcArea(), calcPerimeter(),
                                 toString(): returns the name, area and perimeter that are returned by calcArea(), calcPerimeter()

 */