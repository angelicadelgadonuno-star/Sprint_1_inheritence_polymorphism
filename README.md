# OOP Exercises – Inheritance, Polymorphism and `static`/`final` in Java

**Description**: This project contains three practical exercises from the OOP module. The goal is to practice **inheritance**, **polymorphism**, **abstract classes**, **interfaces**, and the use of the **`static`** and **`final`** modifiers in Java. It also explores how class loading works through static blocks.

## 📌 Enunciat del exercici

### Level 1 – Exercise 1: Musical Instruments

Design a program to manage the musical instruments of a band. There are three types of instruments:

- Wind instruments
- String instruments
- Percussion instruments

All of them share two attributes: a **name** and a **price**. All of them can be played, but each one in a different way.

**Steps:**

1. Create an abstract class `Instrument` with:
    - Two attributes: `name` and `price`
    - One abstract method `play()`
2. Create three subclasses that extend `Instrument`:
    - `WindInstrument`
    - `StringInstrument`
    - `PercussionInstrument`
3. In each subclass, implement `play()` to print a specific message:
    - `"A wind instrument is playing"` for `WindInstrument`
    - `"A string instrument is playing"` for `StringInstrument`
    - `"A percussion instrument is playing"` for `PercussionInstrument`
4. Add a `Main` class with a `main()` method that:
    - Creates one object of each instrument type
    - Calls `play()` on each one to see the polymorphic behavior

**Class loading and static blocks:**

- Show that class loading can be triggered in two ways:
    1. When the first instance of the class is created.
    2. When a static member of the class is accessed.
- Add a static block inside the class and observe when it runs.
- Investigate and document:
    - What is an initialization block (without `static`)?
    - When does it run?
    - What is the difference between it and a static block?

### Level 1 – Exercise 2: Car Class

Create a class that represents a car with the following attributes:

- `brand`: must be `static final`
- `model`: must be `static`
- `power`: must be `final`

**Reflect, test and document in this README:**

- Which of these attributes can be initialized from the constructor?
- Which one can never be modified?
- Which one affects all instances of the class?

**Add two methods:**

- A static method `brake()` that prints: `"The vehicle is braking"`
- A non-static method `accelerate()` that prints: `"The vehicle is accelerating"`

**From the `main()` method:**

- Call `brake()` without creating any object.
- Create a `Car` instance and call `accelerate()` from it.

### Level 2 – Exercise 1: Smartphone with Multiple Features

- Create a `Phone` class with basic info: **brand** and **model**. Include a method to make calls that prints the number passed as a parameter.
- Define two interfaces:
    - `Camera` with a method to take a photo.
    - `Clock` with a method to ring an alarm.
- Create a `Smartphone` class that extends `Phone` and implements `Camera` and `Clock`.
- From `main()`, create a `Smartphone` object and test making a call, taking a photo and ringing the alarm.

## ✨ Funcionalitats

- Create and play different types of musical instruments through polymorphism.
- Show the execution order of static blocks and initialization blocks.
- Demonstrate the difference between `static`, `final`, `static final` attributes and static vs non-static methods.
- Build a `Smartphone` object that combines inheritance (`Phone`) and multiple interfaces (`Camera`, `Clock`).
- Print clear messages on the console for every action.

## 🛠 Tecnologies

- **Language:** Java 17+
- **IDE:** IntelliJ IDEA
- **Build tool:** Maven / Gradle / plain Java (any of them)
- **Version control:** Git + GitHub (Conventional Commits)

## 🚀 Instal·lació i Execució

1. Clone the repository:
   ```bash
   git clone https://github.com/your-user/oop-exercises.git
   ```
2. Open the project in **IntelliJ IDEA**.
3. Make sure the JDK is set to **Java 17 or higher**.
4. Run the `Main` class of each exercise:
    - `level1/exercise1/Main.java`
    - `level1/exercise2/Main.java`
    - `level2/exercise1/Main.java`
5. No external dependencies or `.env` files are needed.

**Tests:**

There are no automated tests in this project. The behavior is verified by running each `main()` method and checking the console output.

## 📸 Demo

Example output for **Level 1 – Exercise 1**:

```
Loading class WindInstrument...
A wind instrument is playing
A string instrument is playing
A percussion instrument is playing
```

Example output for **Level 1 – Exercise 2**:

```
The vehicle is braking
The vehicle is accelerating
Yaris
```

Example output for **Level 2 – Exercise 1**:

```
Calling the number +34 600 000 000
Taking a photo
The alarm is ringing
```

## 🧩 Diagrames i justificació de decisions tècniques

### Class diagram – Level 1, Exercise 1

```
Instrument (abstract)
├── name : String
├── price : double
└── play() : abstract
     ▲
     ├── WindInstrument
     ├── StringInstrument
     └── PercussionInstrument
```

### Class diagram – Level 2, Exercise 1

```
        Phone
       ├── brand : String
       ├── model : String
       └── call(String number)
              ▲
              │  extends
        Smartphone
              │  implements
       ┌──────┴──────┐
     Camera        Clock
   takePhoto()    alarm()
```

### Technical decisions

**Why an abstract class for `Instrument`?**
All instruments share `name` and `price`, but each one plays in its own way. An abstract class lets us define the common part and force each subclass to implement `play()`.

**Why use polymorphism?**
By storing all instruments in a `List<Instrument>`, we can call `play()` on each one without knowing its exact type. Java decides at runtime which method to run.

**`static` vs `final` in the `Car` class:**

| Attribute | Modifier | In constructor? | Can change? | Affects all objects? |
|---|---|---|---|---|
| `brand` | `static final` | ❌ No | ❌ Never | ✅ Yes |
| `model` | `static` | ✅ Yes | ✅ Yes | ✅ Yes |
| `power` | `final` | ✅ Yes (required) | ❌ Never | ❌ No |

- **`static final`** → a class constant. It is set once and never changes.
- **`static`** → shared by all objects. If one object changes it, all objects see the change.
- **`final`** → each object has its own value, and it can only be assigned once.

**Static block vs initialization block:**

| Feature | `static` block | Initialization block |
|---|---|---|
| Keyword | `static { ... }` | `{ ... }` |
| When it runs | Once, when the class is loaded | Every time an object is created |
| Order | Before any instance | After `super()`, before the constructor body |

**Why interfaces in Level 2?**
Java does not allow multiple class inheritance. Interfaces let `Smartphone` be a `Phone`, a `Camera` and a `Clock` at the same time, without forcing a rigid hierarchy. Other classes (for example, a security camera) could implement `Camera` too, without being related to `Phone`.


