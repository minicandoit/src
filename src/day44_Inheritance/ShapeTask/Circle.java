package day44_Inheritance.ShapeTask;

public final class Circle extends Shape {

   /*
   variable:4(1 instance,3 static)
   methods: 4(4 instance methods)
    */

  public double radius,diameter;
  public final static double PI;

  static {
      PI=3.14;
  }

    public Circle(double radius) {//constructor
      super("circle");
      this.radius = radius;

        diameter=radius*2;//no same local variable name so no this key word needed
    }

    @Override
public double calcArea(){//overriding if you use different name use more memory
     //to use less code,less memory in the heat use overriding
      return radius*radius*PI;
}
public double calcPerimeter(){
      return diameter*PI;
}


}
