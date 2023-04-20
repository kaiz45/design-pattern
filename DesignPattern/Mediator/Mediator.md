# Mediator Pattern

---

## 1. What is Mediator Pattern ?

- **Mediator** is a behavioral design pattern that lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.

> Mediator là một mẫu thiết kế hành vi cho phép bạn giảm bớt sự phụ thuộc hỗn loạn giữa các đối tượng. Mẫu hạn chế giao tiếp trực tiếp giữa các đối tượng và buộc chúng chỉ cộng tác thông qua một đối tượng hòa giải.

## 2. How to implement ?

1. Create mediator class.

ChatRoom.java

```sh
import java.util.Date;

public class ChatRoom {
   public static void showMessage(User user, String message){
      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
   }
}

```

2. Create user class

User.java

```sh
public class User {
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public User(String name){
      this.name  = name;
   }

   public void sendMessage(String message){
      ChatRoom.showMessage(this,message);
   }
}
```

3. Use the User object to show communications between them.

MediatorPatternDemo.java

```sh
public class MediatorPatternDemo {
   public static void main(String[] args) {
      User robert = new User("Robert");
      User john = new User("John");

      robert.sendMessage("Hi! John!");
      john.sendMessage("Hello! Robert!");
   }
}
```

4. Verify output

```sh
Thu Jan 31 16:05:46 IST 2013 [Robert] : Hi! John!
Thu Jan 31 16:05:46 IST 2013 [John] : Hello! Robert!

```

## 3. Pros

✔️ Single Responsibility Principle. You can extract the communications between various components into a single place, making it easier to comprehend and maintain.
✔️ Open/Closed Principle. You can introduce new mediators without having to change the actual components.
✔️ You can reduce coupling between various components of a program.
✔️ You can reuse individual components more easily.
Over time a mediator can evolve into a

## 4. Cons

❌ Over time a mediator can evolve into a God Object.
