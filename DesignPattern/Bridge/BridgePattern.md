# Bridge Pattern

---

## 1.What is Bridge Pattern ?

- **Bridge** is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.

> **Bridge** là design pattern thuộc nhóm structural giúp bạn tách một lớp lớn hoặc một tập hợp lớp có quan hệ gần gũi với nhau thành hai hệ thống phân cấp lớp riêng biệt là - abstraction(trừu tượng) và implementation(triển khai) - có thể phát triển độc lập với nhau.

## 2. How to use ?

1. Define the interface for the abstraction

```sh
public interface Shape {
    void draw();
}
```

2. Define the implementation interface

```sh
public interface DrawAPI {
    void drawCircle(int x, int y, int radius);
    void drawRectangle(int x1, int y1, int x2, int y2);
}
```

3. Create concrete implementations of the implementation interface

```sh
public class DrawingAPI1 implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.printf("Drawing circle with API1 at (%d,%d) with radius %d\n", x, y, radius);
    }

    @Override
    public void drawRectangle(int x1, int y1, int x2, int y2) {
        System.out.printf("Drawing rectangle with API1 from (%d,%d) to (%d,%d)\n", x1, y1, x2, y2);
    }
}

public class DrawingAPI2 implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.printf("Drawing circle with API2 at (%d,%d) with radius %d\n", x, y, radius);
    }

    @Override
    public void drawRectangle(int x1, int y1, int x2, int y2) {
        System.out.printf("Drawing rectangle with API2 from (%d,%d) to (%d,%d)\n", x1, y1, x2, y2);
    }
}

```

4. Create the abstraction and use the implementation

```sh
public abstract class AbstractShape implements Shape {
    protected DrawAPI drawAPI;

    protected AbstractShape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
}

public class CircleShape extends AbstractShape {
    private int x, y, radius;

    public CircleShape(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(x, y, radius);
    }
}

public class RectangleShape extends AbstractShape {
    private int x1, y1, x2, y2;

    public RectangleShape(int x1, int y1, int x2, int y2, DrawAPI drawAPI) {
        super(drawAPI);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        drawAPI.drawRectangle(x1, y1, x2,y2);
    }
}

```

5. Verify output

```sh
public static void main(String[] args) {
    Shape circleShape = new CircleShape(10, 10, 5, new DrawingAPI1());
    circleShape.draw();

    Shape rectangleShape = new RectangleShape(0, 0, 100, 50, new DrawingAPI2());
    rectangleShape.draw();
}
```

## 3. Pros

✔️ You can create platform-independent classes and apps.

✔️ The client code works with high-level abstractions. It isn’t exposed to the platform details.

✔️ Open/Closed Principle. You can introduce new abstractions and implementations independently from each other.

✔️ Single Responsibility Principle. You can focus on high-level logic in the abstraction and on platform details in the implementation.

## 4. Cons

❌ You might make the code more complicated by applying the pattern to a highly cohesive class.
