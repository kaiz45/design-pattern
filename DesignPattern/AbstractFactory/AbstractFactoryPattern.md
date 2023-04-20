# Abstract Factory Pattern

---

## 1. What is Abstract Factory ?

- **Abstract Factory** is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

> **Abstract Factory** là một design pattern thuộc nhóm creational, dùng để tạo ra các đối tượng có quan hệ gần gũi với nhau mà không cần chỉ định đến lớp cụ thể của chúng.

## 2. How to implement ?

1. Define the abstract factory interface

```sh
public interface GUIFactory {
    Button createButton();
    TextField createTextField();
}

```

2. Define the concrete factory classes

```sh

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
}

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public TextField createTextField() {
        return new MacOSTextField();
    }
}

```

3. Define the abstract product classes

```sh
public abstract class Button {
    public abstract void click();
}

public abstract class TextField {
    public abstract void setText(String text);
}

```

4. Define the concrete product classes

```sh
public class WindowsButton extends Button {
    @Override
    public void click() {
        System.out.println("Windows button clicked");
    }
}

public class WindowsTextField extends TextField {
    @Override
    public void setText(String text) {
        System.out.println("Windows text field set to: " + text);
    }
}

public class MacOSButton extends Button {
    @Override
    public void click() {
        System.out.println("macOS button clicked");
    }
}

public class MacOSTextField extends TextField {
    @Override
    public void setText(String text) {
        System.out.println("macOS text field set to: " + text);
    }
}

```

5. Use the abstract factory to create objects

```sh
public static void main(String[] args) {
    GUIFactory factory = new WindowsFactory();
    Button button = factory.createButton();
    TextField textField = factory.createTextField();

    button.click();
    textField.setText("Hello, world!");
}


```

Output

> Windows button clicked
> Windows text field set to: Hello, world!

## 3. Pros

✔️ You can be sure that the products you’re getting from a factory are compatible with each other.

✔️ You avoid tight coupling between concrete products and client code.

✔️ Single Responsibility Principle. You can extract the product creation code into one place, making the code easier to support.

✔️ Open/Closed Principle. You can introduce new variants of products without breaking existing client code.

## 4. Cons

❌ The code may become more complicated than it should be, since a lot of new interfaces and classes are introduced along with the pattern.
