# Programming Basic

Understanding fundamental concepts of programming using Java

1. Java installation and tool setup
2. Hello World Program
3. Data Types
4. Conversions
5. User Input
6. Decision Making
7. Loops
8. Arrays
9. Functions
10. Console Application
11. Git and GitHub

## Initial Setup

1. Visual Studio Code
	- https://code.visualstudio.com/docs/?dv=win
2. Java Download 
	- Java Run Time Environment (JRE): https://www.java.com/en/download/manual.jsp
	- Java Development Kit (JDK):
		- https://www.oracle.com/java/technologies/downloads/#jdk17-windows
		- https://download.oracle.com/java/17/latest/jdk-17_windows-x64_bin.msi
3. Visual Studio Code - Java Extension
	- https://code.visualstudio.com/docs/languages/java#_install-visual-studio-code-for-java

## Getting Started

Very first Java program, checkout the below code:
```
public class First {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
```
This will print: Hello World

## Coding Guidelines

1. Understand the Functional and Non-Functional Requirements:
	a. Functional are must have
	b. Non-Functional are good to have
2. Data Type Selection: int, double, String etc.
3. Naming conventions (in Java):
	- Variables: camelCase
	- Method Names: camelCase
	- Class Names: PascalCase
4. Alway format your document using VSCode Format Document option
5. Be consistent with your output, example:
	```
	Enter your name:
	The total is: 
	```
6. Always write clean code by providing necessary spaces (but not overdo it)
	```
	public static void main(String args[])
	{
		float radius, area;
		
		System.out.print("Enter radius:");
		radius = Float.parseFloat(System.console().readLine());
		
		System.out.print("Enter radius:");
		radius = Float.parseFloat(System.console().readLine());
		
		System.out.print("Radius: " + radius);
	}

	```
7. For constants use capitalize names, or check if constant already exist in your language
	```
	double PIE = 22 / 7

	area = Math.PIE * radius * radius;
	```