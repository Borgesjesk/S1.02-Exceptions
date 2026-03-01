# S1.02 - Exceptions

## 📌 Description
Hi! I'm Jessica Borges, a beginner Java developer studying at
IT Academy - Barcelona Activa (Glòries).

This is my second repository and my first time working with
Java's exception handling system. Coming from logistics and
fraud detection at Alpega Group, the concept of catching and
handling errors felt very natural to me — just in code form!

This project taught me that a good program doesn't just work
when everything goes right — it handles failure gracefully too.

## 📁 Structure
- `n1/ex1` - Custom Exceptions & Sale Calculation
- `n2/ex1` - Safe Keyboard Input Validation

## 🛠 Technologies
- Java 21
- Maven
- IntelliJ IDEA

## 🧩 Nivel 1 - Custom Exceptions & Sale Calculation

Built a small sales application that manages products, calculates
totals, and prevents invalid operations with custom exceptions.

What I built:
- `Product` class with `name` and `price` attributes
- `EmptySaleException` — my first custom exception!
- `Sale` class with an `ArrayList<Product>` and `calculateTotal()`
- Tests for `EmptySaleException` and `IndexOutOfBoundsException`

What I learned:
- How to create a custom exception by extending `Exception` or `RuntimeException`
- The difference between **checked** and **unchecked** exceptions
- `throws` is only required for checked exceptions — unchecked ones are free
- `IndexOutOfBoundsException` happens when you access a position that doesn't exist
- A program that throws an exception doesn't have to crash — you can catch and recover!

| | Checked (`Exception`) | Unchecked (`RuntimeException`) |
|---|---|---|
| Compiler forces handling? | ✅ Yes | ❌ No |
| Requires `throws`? | ✅ Yes | ❌ No |
| Requires try-catch? | ✅ Yes | ❌ No |
| Best used for? | External failures | Domain/logic errors |

## 🧩 Nivel 2 - Safe Keyboard Input Validation 🎹

Built a console utility that reads different data types from the
keyboard safely — it never crashes on bad input, just keeps asking
until the user types something valid.

What I built:
- `InvalidInputException` — a flexible custom exception with a message parameter
- `ConsoleReader` — utility class with 4 static safe reading methods:
    - `readInt()` — validates integer input
    - `readDouble()` — validates decimal input
    - `readChar()` — accepts exactly one character
    - `readYesNo()` — accepts only lowercase `y` or `n`

What I learned:
- `InputMismatchException` is thrown by `Scanner` when the type doesn't match
- `scanner.nextLine()` must be called after a failed `nextInt()` to clear the buffer
- `while(true)` loops are perfect for retry logic — keep asking until valid
- `Y` and `y` are different characters — case sensitivity matters!
- Static methods don't need an object instance — perfect for utility classes
