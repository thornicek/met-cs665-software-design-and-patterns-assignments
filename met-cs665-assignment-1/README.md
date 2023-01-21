# Beverage Machine Project 

This is a simple project simulating a beverage vending machine

# Composition of Project

My project is made up of three classes. The Beverage class is a parent class to the Tea and Coffee class. The TestBeverageClass is used to test and run the code.

# How to compile and run the project

For this project I have used Java. In order to open and run the project, one must open the project in a Java IDE, such as Eclipse or IntelliJ. All the "runnable" code is located in the TestBeverageMachine class. This class is used for testing the output of the program.

# How flexible is your implementation, e.g., how you add or remove in future new drink types?

My code has very flexible implementation. I have used the “enum” java built in-class (this class represents a group of constants -> types of beverages), to contain the different types of coffee/tea, that the machine offers. Whenever a beverage needs to be added/removed, it can easily be done in the “enum TeaType/CoffeeType” part of code.

# How is the simplicity and understandability of your implementation?

My assignment has a very simple implementation. I have chose to have one parent class, “Beverage”, and two children classes, “Tea” and “Coffee”, that inherit from the “Beverage” class. Finally, I have a testing class, “TestBeverageMachine”, which is used for testing of my code, with the help of JUnit library.

# How you avoided duplicated code?

To avoid duplicating code, I have used inheritance. The “Tea” and “Coffee” class both inherit methods( addSugar() and addMilk() ) from their parent class, “Beverage”.

