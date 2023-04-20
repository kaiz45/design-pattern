# Decorator Pattern

---

## 1. What is Decorator Pattern ?

- **Decorator** is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

> Decorator là một mẫu thiết kế cấu trúc cho phép bạn đính kèm các hành vi mới vào các đối tượng bằng cách đặt các đối tượng này bên trong các đối tượng trình bao bọc đặc biệt có chứa các hành vi đó.

## 2. How to implement ?

1. Create an interface.

Computer.java

```sh
public interface Computer {
    void assemble();
}
```

2. Create concrete classes implementing the same interface.

BasicComputer.java

```sh
public class BasicComputer implements Computer {
    @Override
    public void assemble() {
        System.out.print("Lắp ráp máy tính cơ bản.");
    }
}
```

3. Create abstract decorator class implementing the Computer interface.

ComputerDecorator.java

```sh
public abstract class ComputerDecorator implements Computer {
    protected Computer computer;

    public ComputerDecorator(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void assemble() {
        this.computer.assemble();
    }
}
```

4.Create concrete decorator class extending the ComputerDecorator class.

GamingComputer.java

```sh
public class GamingComputer extends ComputerDecorator {
    public GamingComputer(Computer computer) {
        super(computer);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Thêm đặc điểm của máy tính chơi game! ");
    }
}
```

WorkComputer.java

```sh
public class WorkComputer extends ComputerDecorator {
    public WorkComputer(Computer computer) {
        super(computer);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Thêm đặc điểm của một máy tính làm việc! ");
    }
}
```

5. Run

```sh
public class Main {
    public static void main(String[] args) {
        Computer gamingComputer = new GamingComputer(new BasicComputer());
        gamingComputer.assemble();
        System.out.println("\n");

        Computer workComputer = new WorkComputer(new GamingComputer(new
                BasicComputer()));
        workComputer.assemble();
        System.out.println("\n----------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}

```

## 3. Pros

✔️ You can extend an object’s behavior without making a new subclass.
✔️ You can add or remove responsibilities from an object at runtime.
✔️ You can combine several behaviors by wrapping an object into multiple decorators.
✔️ Single Responsibility Principle. You can divide a monolithic class that implements many possible variants of behavior into several smaller classes.

## 4. Cons

❌ It’s hard to remove a specific wrapper from the wrappers stack.
❌ It’s hard to implement a decorator in such a way that its behavior doesn’t depend on the order in the decorators stack.
❌ The initial configuration code of layers might look pretty ugly.
