# Documentation for Java Algorithms Collection

## Overview

This document describes the implementation and usage details of three key algorithms implemented in Java:

* **Max Heap Merge**
* **Counting Sort**
* **Sieve of Eratosthenes (Prime Search)**

These algorithms demonstrate fundamental data structures and algorithmic techniques, useful for educational and practical purposes.

---

## 1. Max Heap Merge

### Description

The Max Heap Merge algorithm combines two max heaps into a single max heap. A max heap is a complete binary tree where the parent node is always greater than or equal to its child nodes.

### How It Works

* The two input heaps are merged into one array.
* The array is then heapified to maintain the max heap property.
* The resulting array represents the merged max heap.

### Inputs & Outputs

* **Input**: Two integer arrays representing valid max heaps.
* **Output**: A single integer array representing the merged max heap.

### Complexity

* **Time Complexity**: O(n log n), where n is the total number of elements.
* **Space Complexity**: O(n)

### Example

Input:

```text
Heap1 = [10, 5, 6]
Heap2 = [8, 3, 2]
```

Output:

```text
MergedHeap = [10, 8, 6, 5, 3, 2]
```

---

## 2. Counting Sort

### Description

Counting Sort is an efficient sorting algorithm for sorting integers when the range of input values is known and not significantly larger than the number of elements.

### How It Works

* Count the occurrences of each element in the input array.
* Calculate the positions of each element in the sorted output.
* Place the elements in the correct positions based on the counts.

### Inputs & Outputs

* **Input**: An integer array of non-negative integers.
* **Output**: A sorted integer array.

### Complexity

* **Time Complexity**: O(n + k), where n is the number of elements and k is the range of input.
* **Space Complexity**: O(k)

### Example

Input:

```text
[4, 2, 2, 8, 3, 3, 1]
```

Output:

```text
[1, 2, 2, 3, 3, 4, 8]
```

---

## 3. Sieve of Eratosthenes (Prime Search)

### Description

The Sieve of Eratosthenes is a classical algorithm to find all prime numbers up to a given limit.

### How It Works

* Create a boolean array to mark prime candidates.
* Iteratively mark multiples of each prime starting from 2 as non-prime.
* Remaining unmarked numbers are primes.

### Inputs & Outputs

* **Input**: An integer `n` specifying the upper limit.
* **Output**: A list/array of all prime numbers ≤ `n`.

### Complexity

* **Time Complexity**: O(n log log n)
* **Space Complexity**: O(n)

### Example

Input:

```text
30
```

Output:

```text
[2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
```

---

## How to Compile and Run

To compile and run each Java class:

```bash
javac MaxHeapMerge.java
java MaxHeapMerge

javac CountingSort.java
java CountingSort

javac EratosthenesPrimeSearch.java
java EratosthenesPrimeSearch
```

Make sure to run these commands in the directory containing the `.java` files.

---

## Notes

* Input validation is minimal; the user is expected to provide valid input.
* These implementations are intended for educational use and may be adapted for production use.
* Feel free to extend or optimize the code for specific needs.

---

## Author and License

* Author: BrunoRNS
* License: GPL v3 License (see LICENSE file)

---
