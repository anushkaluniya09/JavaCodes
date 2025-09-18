package Polymorphism.Poly6;

class AreaCalculator{
    public double area(double radius){
        return 3.14 * radius * radius;
    }
    public double area(double length, double breadth){
        return length * breadth;
    }
}
