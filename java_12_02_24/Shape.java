package java_12_02_24;

// Нарушение SOLID:
public class Shape {
    public enum Type { CIRCLE, SQUARE }
    
    private Type type;
    
    public Shape(Type type) {
        this.type = type;
    }
    
    public double calculateArea() {
        if (type == Type.CIRCLE) {
            // Вычисление площади круга
        } else if (type == Type.SQUARE) {
            // Вычисление площади квадрата
        }
        return 0.0;
    }
}
