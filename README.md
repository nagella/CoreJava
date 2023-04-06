# CoreJava
This repository has a few Core Java practice files which helps for Java Interviews, all these are collected from multiple websites.
## Core Java Interview Questions
1. **What is Singleton? How do you create Singleton Class?**
    - Singleton is a part of Gang of Four design pattern and it is categorized under creational design patterns.
    - In Java the Singleton pattern will ensure that there is only one instance of a class is created in the Java Virtual Machine.
    - Singleton patterns are used in logging, caches, thread pools, configuration settings, device driver objects.
    - Design pattern is often used in conjunction with Factory design pattern.
    
    **Advantages**
    - Saves memory because object is not created at each request. Only single instance is reused again and again.

2. **What Is a Default Method and When Do We Use It?**
   - A default method is a method with an implementation, which can be found in an interface.
   - We can use a default method to add a new functionality to an interface, while maintaining backward compatibility with classes that are already implementing the interface:
   - Usually when we add a new abstract method to an interface, all implementing classes will break until they implement the new abstract method. In Java 8, this problem was solved by using the default method.
   - For example, the Collection interface does not have a forEach method declaration. Thus adding such a method would simply break the whole collections API.
   - Java 8 introduced the default method so that the Collection interface can have a default implementation of the forEach method without requiring the classes implementing this interface to implement the same.
