# OOP Project
Template in Java for creating and recording all future multimedia device items for OraclProduction.
## Installation
Clone the repository and run in Java >= 8
## Usage
1. First you build your interface. In this project the Item interface has been provided.
  ```java
  interface SomeRandomInterface {
    void someRandomEmptyMethod(int newValue);
  }
  ```
2. Implement the Interface in the desired class.
```java
//This is a Java Class containing Classy things
class SomeRandomClass implements SomeRandomInterface {
  int integer = 0;
  void someRandomEmptyMethod(int newValue){
    integer = newValue;
  }
}
```
3. Extend the abstract class Product on your custom class.
```java
//This is a Java Class containing Classy things
public class SomeRandomClass extends Product { 
  // Code goes here 
}
```
## Contributing
1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some awesome feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :|
## History
Sometime in 2015 Oracle came up with a mock-up project, and Prof. Vanselow (@profvanselow) thought
it fit our curriculum. :+1:
## Credits
* Oracle
* IntelliJ
* @profvanselow
## License
Copyright 2018 Juan Gaviria

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
## Potential Interview Topics
### Abstract Class
* Cannot be instantiated.
* Can be a subclass.
  - If it does not provide implementations for all of the abstract methods, then the subclass must
  also be declared abstract.
* Can declare fields that are not static and final, and define public, protected, and private 
  concrete methods.
* Abstract classes are similar to interfaces.
  - Cannot be instantiated
  - May contain a mix of methods declared with or without an implementation.
### Abstract Method
* Member of Abstract Class.
* An abstract method is a method that is declared without an implementation.
* If a class includes abstract methods, then the class itself must be declared abstract.
* Methods in an interface that are not declared as default or static are implicitly abstract.
### Final Keyword
* Final references must always reference the same object.
* The object to which the variable is referencing cannot be changed.
* The contents of that object may be modified.
* Makes it a constant.
* ALL CAPS.
### Inner classes
* See nested class.
* Event handling mechanisms uses them.
### Static Inner Class
* Used if access to an enclosing instance's non-public fields and methods is not required.
### Local Class
* Local classes are classes that are defined in a block, which is a group of zero or more statements
 between balanced braces.
* Typically defined in the body of a method.
### Nested Class
* The Java programming language allows you to define a class within another class.
* Static and non-static. 
  - Static: Nested classes that are declared static. 
	- Inner class: Non-static nested classes.
* Inner classes have access to other members of the enclosing class, even if they are declared private. 
* Static nested classes do not have access to other members of the enclosing class. 
* As a member of the OuterClass, a nested class can be declared private, public, protected, or package private. 
  - Recall that outer classes can only be declared public or package private.
* Why use them:
  - It is a way of logically grouping classes that are only used in one place.
  - It increases encapsulation.
  - It can lead to more readable and maintainable code.
### Anonymous Inner Class
* It is an inner class without a name and for which only a single object is created. 
* An anonymous inner class can be useful when making an instance of an object with certain “extras” such as overloading methods of a class or interface, without having to actually subclass a class.
* Anonymous inner classes are useful in writing implementation classes for listener interfaces in graphics programming.
* Anonymous inner class are mainly created in two ways:
  - Class (may be abstract or concrete)
  - Interface