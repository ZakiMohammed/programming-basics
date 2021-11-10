# Functions

- Set of code
- Make certain set of code reusable
- Define once and can be called (used) multiple
- Function are declared and can be called/invoked
- Syntax:
    ```
    return_type function_name(param1, param2, param3, ..., paramN) {
        return <return_type>;
    }
    ```
- Types:
    1. No Return - No Parameter
    2. No Return - Parameter
    3. Return - No Parameter
    4. Return - Parameter

1. No Return - No Parameter
```
void greet() {
	// line of code
	System.out.println("Hello World");
}

greet();	// invoke/call
```

2. No Return - Parameter
```
void greet(string firstName, string lastName) {
	// line of code
	System.out.println("Hello " + firstName + " " + lastName);
}

greet("John", "Doe");	// invoke/call
```

3. Return - No Parameter
```
string greet() {

	// line of code

	return "Hello World";
}

string message = greet();	// invoke/call
System.out.println(message);
```

3. Return - Parameter
```
string greet(string firstName, string lastName) {

	// line of code

	return "Hello " + firstName + " " + lastName;
}

string message = greet("John", "Doe");	// invoke/call
System.out.println(message);
```