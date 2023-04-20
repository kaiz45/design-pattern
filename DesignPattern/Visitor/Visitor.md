# Template Method Pattern

---

## 1. What is Template Method Pattern ?

- **Template Method** is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.

> Template Method là một mẫu thiết kế hành vi cho phép bạn tách các thuật toán khỏi các đối tượng mà chúng hoạt động.

## 2. How to implement ?

1. Define an interface to represent element.

ComputerPart.java

```sh
public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}

```

2. Create concrete classes extending the above class.

Keyboard.java

```sh
public class Keyboard implements ComputerPart {

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}
```

Monitor.java

```sh
public class Monitor implements ComputerPart {

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}
```

Mouse.java

```sh
public class Mouse implements ComputerPart {

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}
```

Computer.java

```sh
public class Computer implements ComputerPart {

   ComputerPart[] parts;

   public Computer(){
      parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
   }


   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      for (int i = 0; i < parts.length; i++) {
         parts[i].accept(computerPartVisitor);
      }
      computerPartVisitor.visit(this);
   }
}
```

3. Define an interface to represent visitor.

ComputerPartVisitor.java

```sh
public interface ComputerPartVisitor {
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
```

4. Create concrete visitor implementing the above class.

ComputerPartDisplayVisitor.java

```sh
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

   @Override
   public void visit(Computer computer) {
      System.out.println("Displaying Computer.");
   }

   @Override
   public void visit(Mouse mouse) {
      System.out.println("Displaying Mouse.");
   }

   @Override
   public void visit(Keyboard keyboard) {
      System.out.println("Displaying Keyboard.");
   }

   @Override
   public void visit(Monitor monitor) {
      System.out.println("Displaying Monitor.");
   }
}
```

5. Use the ComputerPartDisplayVisitor to display parts of Computer.

VisitorPatternDemo.java

```sh
public class VisitorPatternDemo {
   public static void main(String[] args) {

      ComputerPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
   }
}
```

6. Verify the output.

```sh
Displaying Mouse.
Displaying Keyboard.
Displaying Monitor.
Displaying Computer.
```

## 3. Pros

✔️ Open/Closed Principle. You can introduce a new behavior that can work with objects of different classes without changing these classes.
✔️ Single Responsibility Principle. You can move multiple versions of the same behavior into the same class.
✔️ A visitor object can accumulate some useful information while working with various objects. This might be handy when you want to traverse some complex object structure, such as an object tree, and apply the visitor to each object of this structure.

## 4. Cons

❌ You need to update all visitors each time a class gets added to or removed from the element hierarchy.
❌ Visitors might lack the necessary access to the private fields and methods of the elements that they’re supposed to work with.
