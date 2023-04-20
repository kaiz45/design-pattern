# Template Method Pattern

---

## 1. What is Template Method Pattern ?

- **Template Method** is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

> Template Method là một mẫu thiết kế hành vi xác định bộ khung của thuật toán trong lớp cha nhưng cho phép các lớp con ghi đè các bước cụ thể của thuật toán mà không thay đổi cấu trúc của nó.

## 2. How to implement ?

1. Create an abstract class with a template method being final.

Game.java

```sh
public abstract class Game {
   abstract void initialize();
   abstract void startPlay();
   abstract void endPlay();

   //template method
   public final void play(){

      //initialize the game
      initialize();

      //start game
      startPlay();

      //end game
      endPlay();
   }
}
```

2. Create concrete classes extending the above class.

Cricket.java

```sh
public class Cricket extends Game {

   @Override
   void endPlay() {
      System.out.println("Cricket Game Finished!");
   }

   @Override
   void initialize() {
      System.out.println("Cricket Game Initialized! Start playing.");
   }

   @Override
   void startPlay() {
      System.out.println("Cricket Game Started. Enjoy the game!");
   }
}
```

Football.java

```sh
public class Football extends Game {

   @Override
   void endPlay() {
      System.out.println("Football Game Finished!");
   }

   @Override
   void initialize() {
      System.out.println("Football Game Initialized! Start playing.");
   }

   @Override
   void startPlay() {
      System.out.println("Football Game Started. Enjoy the game!");
   }
}
```

3. Use the Game's template method play() to demonstrate a defined way of playing game.

TemplatePatternDemo.java

```sh
public class TemplatePatternDemo {
   public static void main(String[] args) {

      Game game = new Cricket();
      game.play();
      System.out.println();
      game = new Football();
      game.play();
   }
}
```

4. Verify output

```sh
Cricket Game Initialized! Start playing.
Cricket Game Started. Enjoy the game!
Cricket Game Finished!

Football Game Initialized! Start playing.
Football Game Started. Enjoy the game!
Football Game Finished!
```

## 3. Pros

✔️ You can let clients override only certain parts of a large algorithm, making them less affected by changes that happen to other parts of the algorithm.
✔️ You can pull the duplicate code into a superclass.

## 4. Cons

❌ Some clients may be limited by the provided skeleton of an algorithm.
❌ You might violate the Liskov Substitution Principle by suppressing a default step implementation via a subclass.
❌ Template methods tend to be harder to maintain the more steps they have.
