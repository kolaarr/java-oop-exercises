# Java Library Management System

## About the Project

This project is a simple library management system developed in Java as a practical exercise in Object-Oriented Programming.

The application demonstrates how several related classes can be used together to represent a simple library environment. The project includes classes for people, library members, books, genres and the library itself.

## Technologies

- Java
- IntelliJ IDEA

## Project Structure

The project consists of the following classes:

### `Osoba`

The `Osoba` class represents a person and contains the basic attributes that describe a person.

The class includes a constructor for initializing the object's data and a method for displaying the person's information.

### `Clan`

The `Clan` class represents a library member.

It contains a constructor used to initialize the member's data and methods for displaying the relevant information.

### `Zanr`

The `Zanr` class represents a book genre and contains the information needed to define a genre.

### `Knjiga`

The `Knjiga` class represents a book.

A book contains its own attributes, including a variable of type `Zanr`, which connects the book with its genre.

The class includes a constructor for initializing the book's data and methods for displaying its information.

### `Biblioteka`

The `Biblioteka` class represents the library and is responsible for managing the main library data.

It contains lists for storing:

- Members
- Genres
- Books

The class also contains a static variable used to keep track of the total number of library members.

Several methods are implemented in this class for adding and managing library data.

The methods use:

- `if` statements for checking conditions
- `for` loops
- `for-each` loops

### `Main`

The `Main` class is used to demonstrate how the application works.

The program starts by creating a new library object. Objects representing a member, a genre and a book are then created.

The methods from the `Biblioteka` class are called to add and manage the created objects. Finally, the program displays the relevant information and results.

## Java Concepts Demonstrated

This project demonstrates the following Java and Object-Oriented Programming concepts:

- Classes and objects
- Attributes
- Constructors
- Methods
- Static variables
- Lists and collections
- `if` statements
- `for` loops
- `for-each` loops
- Object relationships
- Using one class as the type of an attribute in another class

## What I Practiced

Through this project, I practiced creating multiple related Java classes and using objects from these classes together in a simple application.

The project helped me practice constructors, methods, collections, static variables, loops, conditional statements and relationships between classes.
