# State Pattern

---

## 1. What is State Pattern ?

- **State** is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.

> State là một mẫu thiết kế hành vi cho phép một đối tượng thay đổi hành vi của nó khi trạng thái bên trong của nó thay đổi. Có vẻ như đối tượng đã thay đổi lớp của nó.

## 2. How to implement ?

1. Create an interface.

State.java

```sh
public interface State {
   public void doAction(Context context);
}

```

2. Create concrete classes implementing the same interface.

StartState.java

```sh
public class StartState implements State {

   public void doAction(Context context) {
      System.out.println("Player is in start state");
      context.setState(this);
   }

   public String toString(){
      return "Start State";
   }
}
```

StopState.java

```sh
public class StopState implements State {

   public void doAction(Context context) {
      System.out.println("Player is in stop state");
      context.setState(this);
   }

   public String toString(){
      return "Stop State";
   }
}
```

3. Create Context Class.

Context.java

```sh
public class Context {
   private State state;

   public Context(){
      state = null;
   }

   public void setState(State state){
      this.state = state;
   }

   public State getState(){
      return state;
   }
}
```

4. Use the Context to see change in behaviour when State changes.

StatePatternDemo.java

```sh
public class StatePatternDemo {
   public static void main(String[] args) {
      Context context = new Context();

      StartState startState = new StartState();
      startState.doAction(context);

      System.out.println(context.getState().toString());

      StopState stopState = new StopState();
      stopState.doAction(context);

      System.out.println(context.getState().toString());
   }
}
```

5. Verify output

```sh
Player is in start state
Start State
Player is in stop state
Stop State
```

## 3. Pros

✔️ Single Responsibility Principle. Organize the code related to particular states into separate classes.
✔️ Open/Closed Principle. Introduce new states without changing existing state classes or the context.
✔️ Simplify the code of the context by eliminating bulky state machine conditionals.

## 4. Cons

❌ Applying the pattern can be overkill if a state machine has only a few states or rarely changes.
