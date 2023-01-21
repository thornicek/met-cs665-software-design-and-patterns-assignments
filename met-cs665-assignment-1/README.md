# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```
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

