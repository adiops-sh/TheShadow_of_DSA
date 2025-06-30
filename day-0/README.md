# 📅 Day 0 – Time & Space Complexity + Asymptotic Notation

Welcome to **Day 0** of my DSA journey with Java — part of the `TheShadow_of_DSA` series.

---

## 🔍 What is Asymptotic Notation?

**Asymptotic Notation** is a mathematical way to describe the performance of an algorithm as the input size **n** becomes very large.

Instead of measuring time in seconds, we measure **how the number of operations grows** as input increases. It ignores machine speed or language, and focuses only on **scalability**.

---

### 📘 Why do we need it?

- Different machines have different performance
- We need a **standard** way to compare algorithms
- It helps us write efficient code for large inputs

---

## 🧠 Types of Asymptotic Notations

| Notation | Description | Use Case |
|----------|-------------|----------|
| **Big O (O)** | Upper bound | *Worst case* performance |
| **Omega (Ω)** | Lower bound | *Best case* performance |
| **Theta (Θ)** | Tight bound | *Exact/Average case* |

### Example: Linear Search

- **Best Case (Ω)**: Element is at the beginning → `Ω(1)`
- **Worst Case (O)**: Element is at the end or not present → `O(n)`
- **Average Case (Θ)**: Element is somewhere in the middle → `Θ(n)`

---

## ⏱️ Time Complexity

**Time Complexity** defines the amount of **unit time** required to complete an algorithm as a function of the input size n.

| Time Complexity | Meaning | Example |
|-----------------|---------|---------|
| `O(1)`          | Constant Time | Accessing array by index |
| `O(n)`          | Linear Time   | Loop through array |
| `O(log n)`      | Logarithmic   | Binary search |
| `O(n^2)`        | Quadratic     | Nested loops (Bubble Sort) |

---

## 💾 Space Complexity

**Space Complexity** refers to the **total memory** used by an algorithm, including:

1. 📥 **Input Space**  
   - This is the space required to store the **input data**.
   - It is usually **not counted** in space complexity analysis, because input is given to us — we don’t control it.

2. 🧠 **Auxiliary Space**  
   - This is the **extra or temporary space** used by the algorithm to compute the result.
   - Examples include:
     - Temporary arrays
     - Recursion stack space
     - Extra variables

### Example:
```java
int sum(int[] arr) {
   int total = 0;   // O(1) space
   for (int i = 0; i < arr.length; i++) {
       total += arr[i];
   }
   return total;
}

---

## 📦 Abstract Data Types (ADT)

**Abstract Data Type (ADT)** is a **theoretical model** of a data structure that defines **what operations** can be performed and **what they do**, without specifying **how** they are implemented.

> In short: ADT tells us **what** the data structure does — not **how** it does it.

---

### 💡 Real-World Analogy:
Think of a **remote control** — you know what each button does (like power ON/OFF, volume up, etc.)  
You don’t care *how* it works inside — that’s implementation.

---

### 🧱 Common ADTs:

| ADT | Operations Defined | Example Usage |
|-----|--------------------|----------------|
| **List** | Insert, Delete, Traverse | Array, LinkedList |
| **Stack** | Push, Pop, Peek | Undo operations |
| **Queue** | Enqueue, Dequeue | CPU task scheduling |
| **Deque** | Insert/Delete from both ends | Palindrome check |
| **Map** / **Dictionary** | Put, Get, Remove | HashMap |
| **Set** | Add, Remove, Contains | HashSet |

---

### 📌 Why Learn ADTs First?

- Helps you understand **how data structures behave**
- Builds a strong **base** before diving into implementation
- ADTs define the **interface**, data structures provide the **code**

---

 ~Happy Learning!😊

 ---