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

# Delivery App

My project is a delivery app that notifies delivery drivers, when the shop get's delivery instructions. For my project I have decided to use the observer pattern, as I needed to notify more than one driver about the delivery. 

# How is the flexibility, of your implementation, e.g., how you add or remove in future new types?

My code is fairly flexible, by using the interfaces and the arrayList of delivery drivers, it easy to add/remove drivers from the arrayList.

# How is the simplicity and understandability of your implementation?

My project is fairly simple, it consists of 3 classes; Shop, Driver, DeliveryRequest and 3 interfaces; MessageBase,SubscriberBase, PublisherBase. The class Shop implements the PublisherBase interface, the class is responsible for creating a shop object, updating the subscribers and subscribing/unsubscribing users to and from the array list of subscribers. The class Driver implements the SubscriberBase interface and is responsible for creating a Driver object and notifying the subscribers with the right message. The final class, DeliveryRequest, implements the MessageBase interface and is responsible for creating the delivery request object, with specified product, shop and drivers(subscribers), that get notified.

#  How you avoided duplicated code? 

By using the observer pattern and the interfaces, I have avoided duplicate code, as I don't have to write a line of code, for each time one of the drivers gets notified. Once the drivers are in the arrayList, all of them get notified.