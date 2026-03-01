# Nivel 1 - Custom Exceptions & Sale Calculation 🛒

## 📌 Description
My first exercise with custom exceptions in Java. I built a small
sales system that manages products and calculates totals — but only
if products have actually been added. If the sale is empty, the
system throws a meaningful custom exception instead of crashing.

This felt very familiar to my work at Alpega — when a shipment has
no products, you don't process it. Now I can express that rule in code!

## 📁 Classes

### `Product`
Represents a single product in the sale.
- Attributes: `name` (String), `price` (double)
- Constructor sets both attributes on creation
- Getters: `getName()` and `getPrice()`

### `EmptySaleException`
My first custom exception — thrown when `calculateTotal()` is called
on a sale with no products.
- Extends `RuntimeException` (unchecked)
- Fixed message: *"To make a sale you must add products first"*
- No `throws` declaration needed — compiler doesn't force it

### `Sale`
Manages the list of products and calculates the total price.
- Uses `ArrayList<Product>` to store products
- `addProduct()` adds a product to the list
- `calculateTotal()` sums all prices — throws `EmptySaleException` if empty
- `getTotalPrice()` returns the calculated total

## 💡 What I learned

- How to create a custom exception with a meaningful message
- The difference between `throw` (the action) and `throws` (the declaration)
- Why `RuntimeException` doesn't require `throws` in the method signature
- How `IndexOutOfBoundsException` is triggered by invalid list positions
- That exceptions are just objects — they carry information about what went wrong

## 🧪 Example Output
```
Caught: To make a sale you must add products first
Total: 1100.49
Caught IndexOutOfBoundsException: Index 5 out of bounds for length 1
```

## 🔑 Key concept: Checked vs Unchecked

At first `EmptySaleException` extended `Exception` (checked).
Then I changed it to `RuntimeException` (unchecked) and noticed
that `throws EmptySaleException` disappeared from `calculateTotal()`.

That was the moment it clicked for me — the compiler only tracks
checked exceptions. Unchecked ones are your responsibility as a developer.