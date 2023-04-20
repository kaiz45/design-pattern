# Facade Pattern

---

## 1. What is Facade Pattern ?

- **Facade** is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.

> Facade là một mẫu thiết kế cấu trúc cung cấp giao diện đơn giản hóa cho thư viện, khung hoặc bất kỳ nhóm lớp phức tạp nào khác .

## 2. How to implement ?

1. Create interface

Shape.java

```sh
public interface Shape {
   void draw();
}
```

2. Create concrete classes implementing the same interface.

Rectangle.java

```sh
public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Rectangle::draw()");
   }
}
```

Square.java

```sh
public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Square::draw()");
   }
}
```

Circle.java

```
public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Circle::draw()");
   }
}
```

3. Create a facade class.

ShapeMaker.java

```sh
public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;

   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
   }

   public void drawCircle(){
      circle.draw();
   }
   public void drawRectangle(){
      rectangle.draw();
   }
   public void drawSquare(){
      square.draw();
   }
}
```

4. Use the facade to draw various types of shapes.

FacadePatternDemo.java

```sh
public class FacadePatternDemo {
   public static void main(String[] args) {
      ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();
   }
}
```

5. Verify Output

```sh
Circle::draw()
Rectangle::draw()
Square::draw()
```

## 3. Pros

✔️ You can isolate your code from the complexity of a subsystem.

## 4. Cons

❌ A facade can become a god object coupled to all classes of an app.
