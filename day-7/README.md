# 📅 Day 7 – Recursion Logical Basics

Welcome to **Day 7** of my DSA journey with Java — part of the `TheShadow_of_DSA` series.

---
# 🔢 Sorting Algorithms in Java

Welcome to the **Sorting Algorithms** repository! This project contains Java implementations of the most commonly used sorting techniques, written for learning, interview preparation, and performance comparison.

---

##  Sample Java Code (Selection Sort with Swap Count)

```java
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 1, 2};
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
                count++;
            }
        }

        System.out.println("Total Swaps: " + count);
    }
}
