# Command Pattern

---

## 1. What is Command Pattern ?

- **Command** is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.

> Command là một mẫu thiết kế hành vi biến một yêu cầu thành một đối tượng độc lập chứa tất cả thông tin về yêu cầu. Quá trình chuyển đổi này cho phép bạn chuyển yêu cầu dưới dạng đối số phương thức, trì hoãn hoặc xếp hàng thực thi yêu cầu và hỗ trợ các thao tác không thể hoàn tác.

## 2. How to implement ?

1. Create a command interface.
   Order.java

```sh
public interface Order {
   void execute();
}
```

2. Create a request class.

Stock.java

```sh
public class Stock {

   private String name = "ABC";
   private int quantity = 10;

   public void buy(){
      System.out.println("Stock [ Name: "+name+",
         Quantity: " + quantity +" ] bought");
   }
   public void sell(){
      System.out.println("Stock [ Name: "+name+",
         Quantity: " + quantity +" ] sold");
   }
}
```

3. Create concrete classes implementing the Order interface.

BuyStock.java

```sh
public class BuyStock implements Order {
   private Stock abcStock;

   public BuyStock(Stock abcStock){
      this.abcStock = abcStock;
   }

   public void execute() {
      abcStock.buy();
   }
}
```

SellStock.java

```sh
public class SellStock implements Order {
   private Stock abcStock;

   public SellStock(Stock abcStock){
      this.abcStock = abcStock;
   }

   public void execute() {
      abcStock.sell();
   }
}
```

4. Create command invoker class.
   Broker.java

```sh
import java.util.ArrayList;
import java.util.List;

   public class Broker {
   private List<Order> orderList = new ArrayList<Order>();

   public void takeOrder(Order order){
      orderList.add(order);
   }

   public void placeOrders(){

      for (Order order : orderList) {
         order.execute();
      }
      orderList.clear();
   }
}
```

5. Use the Broker class to take and execute commands.

CommandPatternDemo.java

```sh
public class CommandPatternDemo {
   public static void main(String[] args) {
      Stock abcStock = new Stock();

      BuyStock buyStockOrder = new BuyStock(abcStock);
      SellStock sellStockOrder = new SellStock(abcStock);

      Broker broker = new Broker();
      broker.takeOrder(buyStockOrder);
      broker.takeOrder(sellStockOrder);

      broker.placeOrders();
   }
}

```

6. Verify the output.

> Stock [ Name: ABC, Quantity: 10 ] bought
> Stock [ Name: ABC, Quantity: 10 ] sold

## 3. Pros

✔️ Single Responsibility Principle. You can decouple classes that invoke operations from classes that perform these operations.
✔️ Open/Closed Principle. You can introduce new commands into the app without breaking existing client code.
✔️ You can implement undo/redo.
✔️ You can implement deferred execution of operations.
✔️ You can assemble a set of simple commands into a complex one.

## 4. Cons

❌ The code may become more complicated since you’re introducing a whole new layer between senders and receivers.
