The Single Responsibility Principle (SRP) is one of the five SOLID principles of object-oriented design. It states that a class should have only one responsibility, which means it should have only one reason to change. This principle helps in reducing the coupling between classes and makes the code more maintainable and scalable.

In C++, SRP can be implemented by dividing the responsibilities of a class into smaller, more focused classes. Each class should be responsible for only one task and should have no other reason to change. This makes the code easier to understand, modify and test.

Let’s consider an example of a class named Customer which is responsible for calculating the final bill of a customer. In its current form, the Customer class has several responsibilities, such as maintaining the customer details, calculating the final bill, and generating an invoice.

```
class Customer {
private:
  string name;
  int id;
  vector<Item> items;
  float totalAmount;
public:
  void setName(string name);
  string getName();
  void setId(int id);
  int getId();
  void addItem(Item item);
  void removeItem(Item item);
  float calculateTotalAmount();
  string generateInvoice();
};
```

As we can see, the Customer class is responsible for multiple tasks, such as maintaining customer details, calculating the final bill, and generating an invoice. This violates the Single Responsibility Principle, as the class has multiple reasons to change. For instance, if the calculation of the final bill is changed, then the Customer class needs to be modified, even though it is not related to the customer details or the generation of invoices.

To implement SRP, we can create separate classes for each of these responsibilities. For example, we can create a CustomerDetails class to handle the customer details, a BillingCalculator class to calculate the final bill, and an InvoiceGenerator class to generate the invoice.

```
class CustomerDetails {
private:
  string name;
  int id;
public:
  void setName(string name);
  string getName();
  void setId(int id);
  int getId();
};

class BillingCalculator {
private:
  vector<Item> items;
public:
  void addItem(Item item);
  void removeItem(Item item);
  float calculateTotalAmount();
};

class InvoiceGenerator {
public:
  string generateInvoice(CustomerDetails customerDetails, BillingCalculator billingCalculator);
};
```


By dividing the responsibilities of the Customer class into smaller, more focused classes, each class has only one responsibility, which makes the code more maintainable and scalable. If any changes are required in any of these classes, only that class needs to be modified, rather than the entire Customer class. This leads to cleaner and more maintainable code, which is easier to understand, modify and test.  
