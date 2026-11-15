
The Dependency Inversion Principle (DIP) is one of the SOLID principles of object-oriented design. It states that high-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.

In C++, DIP can be implemented by using interfaces or abstract classes to decouple high-level modules from low-level modules. This allows for more flexibility in the design, as different implementations of the same interface can be easily swapped out without affecting the overall structure of the program.

Let’s consider an example of a Database class that stores user information. We could define a concrete implementation of this class that depends on the MySQLConnector class.

```
class MySQLConnector {
  public:
    void connect();
    void query(const std::string& query);
};

class Database {
  public:
    void addUser(const std::string& name, const std::string& email) {
      MySQLConnector connector;
      connector.connect();
      std::string query = "INSERT INTO users (name, email) VALUES ('" + name + "', '" + email + "')";
      connector.query(query);
    }
};
```
This implementation violates the Dependency Inversion Principle, as the Database class depends on the low-level MySQLConnector class. If we were to switch to a different database system, we would need to modify the Database class to use a different connector.

To adhere to the DIP, we could define an abstract interface for the database connector, and have the Database class depend on this interface instead of a concrete implementation.
```
class IDatabaseConnector {
  public:
    virtual void connect() = 0;
    virtual void query(const std::string& query) = 0;
};

class MySQLConnector : public IDatabaseConnector {
  public:
    void connect() override;
    void query(const std::string& query) override;
};

class Database {
  public:
    Database(IDatabaseConnector& connector) : connector_(connector) {}
  
    void addUser(const std::string& name, const std::string& email) {
      connector_.connect();
      std::string query = "INSERT INTO users (name, email) VALUES ('" + name + "', '" + email + "')";
      connector_.query(query);
    }
  
  private:
    IDatabaseConnector& connector_;
};

```

Now, the Database class depends on the abstract IDatabaseConnector interface instead of a concrete implementation. We can create different implementations of the IDatabaseConnector interface for different database systems, and easily swap them out without modifying the Database class.

```
class PostgreSQLConnector : public IDatabaseConnector {
  public:
    void connect() override;
    void query(const std::string& query) override;
};

int main() {
  PostgreSQLConnector postgresConnector;
  Database db(postgresConnector);

  db.addUser("John Doe", "john.doe@example.com");
}
```

By adhering to the Dependency Inversion Principle, we can create more flexible and maintainable code that is easier to extend and modify. High-level modules depend on abstractions, not low-level details, which allows for easier substitution of implementations.
