The Open-Closed Principle (OCP) is one of the five SOLID principles of object-oriented design. It states that a class should be open for extension but closed for modification. This principle helps in making the code more maintainable and flexible.

In C++, OCP can be implemented by creating classes that can be extended by adding new functionality without modifying the existing code. This is achieved by using inheritance, polymorphism, and interfaces. By following this principle, we can make the code more modular and less prone to bugs.

Let’s consider an example of a Shape class hierarchy that includes different types of shapes, such as Rectangle, Circle, and Triangle. Each shape has a different area calculation method.

```
class Shape {
public:
  virtual double area() = 0;
};

class Rectangle : public Shape {
private:
  double width;
  double height;
public:
  Rectangle(double width, double height);
  double area() override;
};

class Circle : public Shape {
private:
  double radius;
public:
  Circle(double radius);
  double area() override;
};

class Triangle : public Shape {
private:
  double base;
  double height;
public:
  Triangle(double base, double height);
  double area() override;
};
```


Now, let’s suppose that we want to add a new shape, such as a Square, to our hierarchy. One way to do this would be to modify the Shape class hierarchy by adding a new Square class. However, this would violate the OCP, as we would be modifying the existing code.

Instead, we can extend the Shape class hierarchy by creating a new class that inherits from the Shape class and implements the area() method. In this way, we are adding new functionality without modifying the existing code.

```
class Square : public Shape {
private:
  double side;
public:
  Square(double side);
  double area() override;
};
```

Now, we can create objects of the Square class and calculate their areas using the area() method without modifying the existing code.

Square square(5.0);
double squareArea = square.area(); // returns 25.0
By following the Open-Closed Principle, we can create code that is more maintainable, flexible, and easier to extend. This allows us to add new functionality to our code without modifying the existing code, which reduces the risk of introducing bugs and makes the code more modular.



Applied LSP

```
#include <iostream>
using namespace std;

class Shape {
public:
    virtual int getArea() const = 0;
    virtual ~Shape() = default;
};

class Rectangle : public Shape {
private:
    int width;
    int height;

public:
    Rectangle(int w, int h)
        : width(w), height(h) {}

    int getArea() const override {
        return width * height;
    }
};

class Square : public Shape {
private:
    int side;

public:
    Square(int s) : side(s) {}

    int getArea() const override {
        return side * side;
    }
};
```


Usage
```
void printArea(const Shape& shape) {
    cout << shape.getArea() << endl;
}

int main() {
    Rectangle rectangle(5, 10);
    Square square(10);

    printArea(rectangle); // 50
    printArea(square);    // 100

    return 0;
}
```
