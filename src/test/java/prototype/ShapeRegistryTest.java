package prototype;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ShapeRegistryTest {
    private ShapeRegistry shapeRegistry;
    private Circle circle;

    @BeforeEach
    void setup() {
        circle = createMockedCircle();
        Square square = createMockedSquare();
        shapeRegistry = new ShapeRegistry();
        shapeRegistry.loadShapes(Map.of(ShapeType.CIRCLE, circle, ShapeType.SQUARE, square));
    }

    @Test
    void createShape_Should_CallCopyMethod() {
        shapeRegistry.createShape(ShapeType.CIRCLE);

        verify(circle).clone();
    }

    @Test
    void createShape_Should_ReturnBasedOnShapeType() {
        var result = (Circle) shapeRegistry.createShape(ShapeType.CIRCLE);

        assertEquals(circle.getArea(), result.getArea());
        assertEquals(circle.getRadius(), result.getRadius());
    }

    @Test
    void createShape_ShouldNot_ReturnTheSameObject() {
        var result = (Circle) shapeRegistry.createShape(ShapeType.CIRCLE);

        assertNotSame(circle, result);
    }

    private Circle createMockedCircle() {
        var circle = spy(Circle.class);
        circle.setArea(12);
        circle.setRadius(12);
        return circle;
    }

    private Square createMockedSquare() {
        var square = spy(Square.class);
        square.setArea(14);
        square.setLength(24);
        return square;
    }
}