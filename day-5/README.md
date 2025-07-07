# 🔁 Normal Recursion vs Tail Recursion in Java

This guide explains the difference between **normal recursion** and **tail recursion** using simple examples and clear comparisons.

---

## 📘 What is Recursion?

**Recursion** is a programming technique where a function calls itself to solve a smaller instance of the same problem.

A recursive function must have:
-  A **base case** to stop recursion.
-  A **recursive case** that calls itself.

---

## 🔍 Types of Recursion

There are two major types:

| Type             | Description                                                                 |
|------------------|-----------------------------------------------------------------------------|
|  Normal Recursion | Function does **some work after** the recursive call.                       |
|  Tail Recursion   | The **last thing** the function does is the recursive call — no work after.|

---

## ⚖️ Key Differences

| Feature              | Normal Recursion                                  | Tail Recursion                                          |
|----------------------|---------------------------------------------------|----------------------------------------------------------|
| Last Operation       | Work (e.g., `+`, `*`) is done **after** the call. | Recursive call is the **last statement**.               |
| Stack Usage          | Builds up call stack.                             | Can reuse the same stack frame (in some languages).     |
| Optimization in Java | ❌ Not optimized.                                 | ❌ Still not optimized in Java (no Tail Call Optimization). |
| Memory Efficiency    | ❌ Lower (risk of `StackOverflowError`).           | ✅ More efficient in optimized languages (e.g., Scala). |

---

## ❌ Normal Recursion Example (Factorial)

```java
public static int factorial(int n) {
    if (n == 0) return 1;
    return n * factorial(n - 1); // Work (n *) happens after recursion
}
