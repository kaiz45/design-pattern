# Builder Pattern

---

## 1. What is Builder Pattern ?

- Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

> Builder pattern được tạo ra để xây dựng một đôi tượng phức tạp bằng cách sử dụng các đối tượng đơn giản và sử dụng tiếp cận từng bước, việc xây dựng các đối tượng đôc lập với các đối tượng khác.

## 2. How to implement ?

1.  Define the object to be created and its attributes

```sh
public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private String engineType;

    private Car(String make, String model, int year, String color, String engineType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineType = engineType;
    }

    // Getters for all attributes
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getEngineType() {
        return engineType;
    }
}

```

2. Define the builder class with methods to set the object's attributes

```sh

public class CarBuilder {
    private String make;
    private String model;
    private int year;
    private String color;
    private String engineType;

    public CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public Car build() {
        return new Car(make, model, year, color, engineType);
    }
}

```

3.  Use the builder to create objects with different configurations

```sh
Car car1 = new CarBuilder()
                .setMake("Toyota")
                .setModel("Camry")
                .setYear(2020)
                .setColor("Blue")
                .setEngineType("Hybrid")
                .build();

Car car2 = new CarBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2018)
                .setColor("Red")
                .setEngineType("Gasoline")
                .build();

```

## 3. Pros

✔️ You can construct objects step-by-step, defer construction steps or run steps recursively.

✔️ You can reuse the same construction code when building various representations of products.

✔️ Single Responsibility Principle. You can isolate complex construction code from the business logic of the product.

## 4. Cons

❌ The overall complexity of the code increases since the pattern requires creating multiple new classes.
