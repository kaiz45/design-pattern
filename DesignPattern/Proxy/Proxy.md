# Proxy Pattern

---

## 1. What is Proxy Pattern ?

- **Proxy** is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

> Proxy là một mẫu thiết kế cấu trúc cho phép bạn cung cấp một vật thay thế hoặc giữ chỗ cho một đối tượng khác. Một proxy kiểm soát quyền truy cập vào đối tượng ban đầu, cho phép bạn thực hiện điều gì đó trước hoặc sau khi yêu cầu được chuyển đến đối tượng ban đầu.

## 2. How to implement ?

1. Create an interface.

Image.java

```sh
public interface Image {
   void display();
}
```

2. Create concrete classes implementing the same interface.

RealImage.java

```sh
public class RealImage implements Image {

   private String fileName;

   public RealImage(String fileName){
      this.fileName = fileName;
      loadFromDisk(fileName);
   }

   @Override
   public void display() {
      System.out.println("Displaying " + fileName);
   }

   private void loadFromDisk(String fileName){
      System.out.println("Loading " + fileName);
   }
}
```

ProxyImage.java

```sh
public class ProxyImage implements Image{

   private RealImage realImage;
   private String fileName;

   public ProxyImage(String fileName){
      this.fileName = fileName;
   }

   @Override
   public void display() {
      if(realImage == null){
         realImage = new RealImage(fileName);
      }
      realImage.display();
   }
}
```

3. Use the ProxyImage to get object of RealImage class when required.

ProxyPatternDemo.java

```sh
public class ProxyPatternDemo {

   public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg");

      //image will be loaded from disk
      image.display();
      System.out.println("");

      //image will not be loaded from disk
      image.display();
   }
}
```

4. Verify the output.

```sh
Loading test_10mb.jpg
Displaying test_10mb.jpg

Displaying test_10mb.jpg

```

## 3. Pros

✔️ You can control the service object without clients knowing about it.
✔️ You can manage the lifecycle of the service object when clients don’t care about it.
✔️ The proxy works even if the service object isn’t ready or is not available.
✔️ Open/Closed Principle. You can introduce new proxies without changing the service or clients.

## 4. Cons

❌ The code may become more complicated since you need to introduce a lot of new classes.
❌ The response from the service might get delayed.
