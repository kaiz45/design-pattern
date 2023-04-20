# Memento Pattern

---

## 1. What is Memento Pattern ?

- **Memento** is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.

> Memento là một mẫu thiết kế hành vi cho phép bạn lưu và khôi phục trạng thái trước đó của một đối tượng mà không tiết lộ chi tiết về việc triển khai đối tượng đó.

## 2. How to implement ?

1. Create Memento class.

Memento.java

```sh
public class Memento {
   private String state;

   public Memento(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }
}


```

2. Create Originator class

Originator.java

```sh
public class Originator {
   private String state;

   public void setState(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }

   public Memento saveStateToMemento(){
      return new Memento(state);
   }

   public void getStateFromMemento(Memento memento){
      state = memento.getState();
   }
}
```

3. Create CareTaker class

CareTaker.java

```sh
import java.util.ArrayList;
import java.util.List;

public class CareTaker {
   private List<Memento> mementoList = new ArrayList<Memento>();

   public void add(Memento state){
      mementoList.add(state);
   }

   public Memento get(int index){
      return mementoList.get(index);
   }
}
```

4. Use CareTaker and Originator objects.

MementoPatternDemo.java

```sh
public class MementoPatternDemo {
   public static void main(String[] args) {

      Originator originator = new Originator();
      CareTaker careTaker = new CareTaker();

      originator.setState("State #1");
      originator.setState("State #2");
      careTaker.add(originator.saveStateToMemento());

      originator.setState("State #3");
      careTaker.add(originator.saveStateToMemento());

      originator.setState("State #4");
      System.out.println("Current State: " + originator.getState());

      originator.getStateFromMemento(careTaker.get(0));
      System.out.println("First saved State: " + originator.getState());
      originator.getStateFromMemento(careTaker.get(1));
      System.out.println("Second saved State: " + originator.getState());
   }
}

```

5. Verify output

```sh
Current State: State #4
First saved State: State #2
Second saved State: State #3


```

## 3. Pros

✔️ You can produce snapshots of the object’s state without violating its encapsulation.
✔️ You can simplify the originator’s code by letting the caretaker maintain the history of the originator’s state.

## 4. Cons

❌ The app might consume lots of RAM if clients create mementos too often.
❌ Caretakers should track the originator’s lifecycle to be able to destroy obsolete mementos.
❌ Most dynamic programming languages, such as PHP, Python and JavaScript, can’t guarantee that the state within the memento stays untouched.
