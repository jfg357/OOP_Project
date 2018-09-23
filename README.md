# Alpha
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
## Contributing
1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
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