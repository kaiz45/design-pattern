# Iterator Pattern

---

## 1. What is Iterator Pattern ?

- **Iterator** is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).

> Iterator là một mẫu thiết kế hành vi cho phép bạn duyệt qua các thành phần của bộ sưu tập mà không làm lộ biểu diễn cơ bản của nó (list, stack, tree, etc.).

## 2. How to implement ?

1. Create interfaces

Iterator.java

```sh
public interface Iterator {
   public boolean hasNext();
   public Object next();
}

```

Container.java

```sh
public interface Container {
   public Iterator getIterator();
}
```

2. Create concrete class implementing the Container interface. This class has inner class NameIterator implementing the Iterator interface.

NameRepository.java

```sh
public class NameRepository implements Container {
   public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

   @Override
   public Iterator getIterator() {
      return new NameIterator();
   }

   private class NameIterator implements Iterator {

      int index;

      @Override
      public boolean hasNext() {

         if(index < names.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {

         if(this.hasNext()){
            return names[index++];
         }
         return null;
      }
   }
}
```

3. Use the NameRepository to get iterator and print names.

IteratorPatternDemo.java

```sh
public class IteratorPatternDemo {

   public static void main(String[] args) {
      NameRepository namesRepository = new NameRepository();

      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         String name = (String)iter.next();
         System.out.println("Name : " + name);
      }
   }
}
```

4. Verify output

```sh
Name : Robert
Name : John
Name : Julie
Name : Lora

```

## 3. Pros

✔️ Single Responsibility Principle. You can clean up the client code and the collections by extracting bulky traversal algorithms into separate classes.
✔️ Open/Closed Principle. You can implement new types of collections and iterators and pass them to existing code without breaking anything.
✔️ You can iterate over the same collection in parallel because each iterator object contains its own iteration state.
✔️ For the same reason, you can delay an iteration and continue it when needed.

## 4. Cons

❌ Applying the pattern can be an overkill if your app only works with simple collections.
❌ Using an iterator may be less efficient than going through elements of some specialized collections directly.
