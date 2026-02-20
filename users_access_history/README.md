# Recent Access History

This project is a simple Java exercise that demonstrates how to use the `LinkedList` data structure to maintain a historical log of user accesses, limited to a specific number of entries.

## Description

The `RecentAccessHistory` class provides a mechanism to register usernames and keep track of the most recent ones. It uses a `LinkedList` to efficiently add items to the front and remove the oldest items from the back when the limit (5 entries) is exceeded.

## Features

- **Limited History**: Automatically maintains only the most recent 5 accesses.
- **Ordered Log**: Displays entries from the most recent to the oldest.
- **Efficient Operations**: Uses `LinkedList` for $O(1)$ additions to the front and removals from the back.

## How to Run

To compile and run this program, follow these steps:

1. Open your terminal or command prompt.
2. Navigate to the project directory:
   ```bash
   cd users_access_history
   ```
3. Compile the Java file:
   ```bash
   javac RecentAccessHistory.java
   ```
4. Run the program:
   ```bash
   java RecentAccessHistory
   ```

## Example Output

```text
Recent accesses:
Frank
Eve
David
Charlie
Bob
```
