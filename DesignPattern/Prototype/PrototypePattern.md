# Prototype Pattern

---

## 1. What is Prototype Pattern ?

- **Prototype** is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.
  > Prototype là một design pattern thuộc nhóm creational, giúp bạn sao chép một đối tượng mà code của bạn sẽ không phụ thuộc vào lớp của đối tượng đó.

## 2. How to implement ?

1.  Create the prototype class

```sh
public class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

```

2.  Clone the prototype object

```sh
Person john = new Person("John", 30);
Person clone = john.clone();

```

3. Modify the cloned object

```sh
clone.setName("Jane");
clone.setAge(25);

System.out.println(john.getName() + " " + john.getAge());   // Output: John 30
System.out.println(clone.getName() + " " + clone.getAge()); // Output: Jane 25
```

## 3. Pros

✔️ You can clone objects without coupling to their concrete classes.

✔️ You can get rid of repeated initialization code in favor of cloning pre-built prototypes.

✔️ You can produce complex objects more conveniently.

✔️ You get an alternative to inheritance when dealing with configuration presets for complex objects.

## 4. Cons

❌ Cloning complex objects that have circular references might be very tricky.
