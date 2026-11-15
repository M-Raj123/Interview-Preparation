The Liskov Substitution Principle (LSP) is one of the SOLID principles of object-oriented design. It states that objects of a superclass should be able to be replaced with objects of a subclass without affecting the correctness of the program. In other words, a subclass should be able to be substituted for its parent class without causing any errors or unexpected behavior.

In C++, LSP can be implemented by ensuring that subclasses adhere to the same interface and behavior as their parent class. This allows us to use a subclass object wherever we would normally use a parent class object.

Let’s consider an example of a Bird class hierarchy that includes different types of birds, such as Eagle, Penguin, and Ostrich. Each bird has a different ability to fly.

```
class Bird {
public:
  virtual void fly() = 0;
};

class Eagle : public Bird {
public:
  void fly() override;
};

class Penguin : public Bird {
public:
  void fly() override;
};

class Ostrich : public Bird {
public:
  void fly() override;
};
```

Now, let’s suppose that we have a function that takes a Bird object and makes it fly.
```
void makeBirdFly(Bird& bird) {
  bird.fly();
}
```


According to the LSP, we should be able to pass any Bird subclass object to this function without affecting the correctness of the program. For example, we should be able to pass an Eagle object, a Penguin object, or an Ostrich object to this function.

```
Eagle eagle;
Penguin penguin;
Ostrich ostrich;

makeBirdFly(eagle); // okay, eagle can fly
makeBirdFly(penguin); // error, penguin can't fly
makeBirdFly(ostrich); // error, ostrich can't fly
```

As we can see, passing a Penguin or an Ostrich object to this function would result in an error because they cannot fly. Therefore, these classes do not adhere to the same behavior as their parent class, Bird, and violate the LSP.

By following the Liskov Substitution Principle, we can create code that is more modular and flexible. This allows us to use subclasses interchangeably with their parent class, which reduces the complexity of our code and makes it easier to maintain.


Applied LSP

```
#include <iostream>
using namespace std;

class Bird {
public:
    virtual void eat() = 0;
    virtual ~Bird() = default;
};

class FlyingBird : public Bird {
public:
    virtual void fly() = 0;
};

class Eagle : public FlyingBird {
public:
    void eat() override {
        cout << "Eagle is eating\n";
    }

    void fly() override {
        cout << "Eagle is flying\n";
    }
};

class Penguin : public Bird {
public:
    void eat() override {
        cout << "Penguin is eating\n";
    }
};

class Ostrich : public Bird {
public:
    void eat() override {
        cout << "Ostrich is eating\n";
    }
};
```
