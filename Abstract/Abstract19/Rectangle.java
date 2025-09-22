package com.Abstract.Abstract19;

class Rectangle extends Shape2 {
    double length = 10, width = 5;
    double area() { return length * width; }
    double perimeter() { return 2 * (length + width); }
}
