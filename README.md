# Elizabeth Brighton BaylorIRES2020 Evaluation
Both programs have similar functionality. Each takes a directory path as an argument from the command line and searches through it. 
The Java portion finds .java files and the Python portion finds .py files. Each creates an Abstract Syntax Tree for the respective 
file found and saves it to the folder the file was found in under the .ast extension.
## Java Portion 

The Java portion consists of 3 packages within the main folder, and 2 packages within the test folder.
* In order to run the tests use the command: ```mvn install``` within the JavaAST folder.
* In order to run the program, navigate to the target folder and run the JavaEval.jar using the command:```java -jar JavaEval.jar directoryName```

## Python Portion

The Python portion consists of 2 packages with source code, a main.py and a test.py.
* Before the program is run, the requirements.txt must be executed using the command: ```pip install -r requirements.txt```.
* In order to run the main.py simply run ```python main.py``` within the src folder.
* In order to run the tests simply run ```python tests.py``` within the src folder

