# 📅 Day 4 – Recursion Logical Basics

Welcome to **Day 4** of my DSA journey with Java — part of the `TheShadow_of_DSA` series.

This file contains solutions of logical recursion problems in Java, aimed to strengthen your foundation in solving problems using recursive thinking.

---

##  What is Recursion?

**Recursion** is a programming technique where a **method calls itself** to solve smaller instances of the same problem, until it reaches a stopping condition — called the **base case**.

> **"Solve a big problem by breaking it into smaller versions of itself."**

---

## 🔄 How Recursion Works Internally?

Recursion uses the **function call stack**, which follows **LIFO (Last In First Out)**.

Each recursive call adds a new **activation record (stack frame)** to the stack.

###  What's in an Activation Record?
An **activation record** (also called a **stack frame**) is created for each function call and typically contains:

-  **Function arguments**  
-  **Local variables**  
-  **Return address** — where to resume once this call completes  
-  **Saved state** of previous call

Once the base case is reached, the stack **unwinds**, returning values back up through the call chain.

---

###  Example: `factorial(3)`

```java
factorial(3)
=> 3 * factorial(2)
       => 2 * factorial(1)
              => 1 * factorial(0)
                     => 1 (Base Case)
---
