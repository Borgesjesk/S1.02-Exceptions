# Nivel 2 - Safe Keyboard Input Validation 🎹

## 📌 Description
A console utility that reads different data types from the keyboard
safely and keeps asking until the user provides valid input.

This exercise taught me that real applications need to handle
human error — users will always type something unexpected. Instead
of crashing, a good program catches the mistake, explains it clearly,
and gives the user another chance.

## 📁 Classes

### `InvalidInputException`
A flexible custom exception for input validation errors.
- Extends `RuntimeException` (unchecked)
- Unlike `EmptySaleException`, this one accepts a **custom message as parameter**
- Reused across multiple methods with different error messages

### `ConsoleReader`
A utility class with static methods for safe keyboard reading.
- Single shared `Scanner` instance — created once, used everywhere
- Every method uses `while(true)` — loops until valid input is received
- Mixes standard Java exceptions with our custom `InvalidInputException`

## 🛠 Methods

| Method | Returns | Validates | Exception |
|--------|---------|-----------|-----------|
| `readInt(String message)` | `int` | Must be a whole number | `InputMismatchException` |
| `readDouble(String message)` | `double` | Must be a decimal number | `InputMismatchException` |
| `readChar(String message)` | `char` | Must be exactly 1 character | `InvalidInputException` |
| `readYesNo(String message)` | `boolean` | Only `y` or `n` (lowercase) | `InvalidInputException` |

## 💡 What I learned

- `InputMismatchException` is thrown automatically by `Scanner` on type mismatch
- After a failed `nextInt()`, the bad input stays in the buffer — `scanner.nextLine()`
  clears it so the next read works correctly
- `while(true)` with a `return` inside is a clean pattern for retry logic
- `Y` ≠ `y` — Java is case sensitive and that's intentional here
- Static utility classes don't need to be instantiated — just call the method directly
- A parameterized exception message makes the same class reusable in many contexts

## 🧪 Example Session
```
Enter your age:
hello                          ← wrong type
Format error. Please try again.
Enter your age:
34                             ← valid ✅
Age: 34
Enter a price:
29.99                          ← valid ✅
Price: 29.99
Enter a single character:
abc                            ← too many characters
Error: Please enter exactly one character.
Enter a single character:
A                              ← valid ✅
Character: A
Do you want to continue? (y/n):
Y                              ← uppercase not accepted
Error: Please enter 'y' or 'n'.
Do you want to continue? (y/n):
y                              ← valid ✅
Answer: true
```

## 🔑 Key concept: Fixed vs Parameterized exceptions

`EmptySaleException` always says the same thing.
`InvalidInputException` says whatever you tell it to.

That's the difference between a specific exception and a reusable one —
and knowing when to use each is what makes exception design clean.
```
