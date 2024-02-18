package java_12_02_24;


public class CircleQ {
    private double radius;
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}


class FixedCircleQ {
    public double radius;

    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}