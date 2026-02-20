# Library System - Java Study Exercise

This project is a practical exercise to learn and apply fundamental Java concepts related to sorting and iterating through collections.

## 🚀 Key Concepts

### 1. Comparable (Natural Sorting)
Implemented in the `Book` class to define a default sorting order. 
- **Criterion:** Book Title (A-Z).
- **Usage:** `Collections.sort(books)`.

### 2. Comparator (Custom Sorting)
We used `Comparator` to create multiple sorting rules without modifying the main class structure.
- **Implemented Strategies:**
    - `BY_TITLE`: By title.
    - `BY_AUTHOR`: By author.
    - `BY_YEAR`: By publication year.
    - `BY_PAGES`: By number of pages.
- **Features used:** Method References (`Book::getYear`) and reverse ordering (`.reversed()`).

### 3. Iterator
Used to traverse the book list safely and perform filtering.
- **Example:** Filtering available/unavailable books for borrowing.

## 📂 Project Structure

- `Book.java`: Entity representing a book and containing comparison definitions.
- `listBooks.java`: Main class that runs the simulation and demonstrates results in the console.

## 🛠️ How to Run

1. Compile the files:
   ```bash
   javac Book.java listBooks.java
   ```

2. Run the program:
   ```bash
   java listBooks
   ```

## 📝 Example Output
```text
--- Natural Order (Title A-Z) ---
Algoritmos   | Maria      | 2018 | 450p | Unavailable
Java         | Patrick    | 2020 | 300p | Available
...
```
