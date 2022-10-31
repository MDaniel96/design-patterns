package prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {
    private Map<ShapeType, Shape> shapes = new HashMap<>();

    public Shape createShape(ShapeType shapeType) {
        return (Shape) (shapes.get(shapeType)).clone();
    }

    public void loadShapes(Map<ShapeType, Shape> shapes) {
        this.shapes = shapes;
    }
}
