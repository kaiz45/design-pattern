# Strategy Pattern

---

## 1. What is Strategy Pattern ?

- **Strategy** is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

> Strategy là một mẫu thiết kế hành vi cho phép bạn xác định một nhóm thuật toán, đặt từng thuật toán vào một lớp riêng biệt và làm cho các đối tượng của chúng có thể hoán đổi cho nhau.

## 2. How to implement ?

1. Create an interface.

Strategy.java

```sh
public interface Strategy {
   public int doOperation(int num1, int num2);
}

```

2. Create concrete classes implementing the same interface.

OperationAdd.java

```sh
public class OperationAdd implements Strategy{
   @Override
   public int doOperation(int num1, int num2) {
      return num1 + num2;
   }
}
```

OperationSubstract.java

```sh
public class OperationSubstract implements Strategy{
   @Override
   public int doOperation(int num1, int num2) {
      return num1 - num2;
   }
}
```

OperationMultiply.java

```sh
public class OperationMultiply implements Strategy{
   @Override
   public int doOperation(int num1, int num2) {
      return num1 * num2;
   }
}
```

3. Create Context Class.

Context.java

```sh
public class Context {
   private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(int num1, int num2){
      return strategy.doOperation(num1, num2);
   }
}
```

4. Use the Context to see change in behaviour when it changes its Strategy.

StrategyPatternDemo.java

```sh
public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context context = new Context(new OperationAdd());
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationSubstract());
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationMultiply());
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
   }
}
```

5. Verify output

```sh
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
```

## 3. Pros

✔️ You can swap algorithms used inside an object at runtime.
✔️ You can isolate the implementation details of an algorithm from the code that uses it.
✔️ You can replace inheritance with composition.
✔️ Open/Closed Principle. You can introduce new strategies without having to change the context.

## 4. Cons

❌ If you only have a couple of algorithms and they rarely change, there’s no real reason to overcomplicate the program with new classes and interfaces that come along with the pattern.
❌ Clients must be aware of the differences between strategies to be able to select a proper one.
❌ A lot of modern programming languages have functional type support that lets you implement different versions of an algorithm inside a set of anonymous functions. Then you could use these functions exactly as you’d have used the strategy objects, but without bloating your code with extra classes and interfaces.
