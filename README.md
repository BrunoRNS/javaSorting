# Java Algorithms Collection

This repository contains Java implementations of three fundamental algorithms:

1. **Max Heap Merge**: A method to merge two Max Heaps efficiently.
2. **Counting Sort**: A linear-time sorting algorithm for integers.
3. **Sieve of Eratosthenes**: A prime number search algorithm using the classical sieve method.

## 🧠 Algorithms Included

### 1. Max Heap Merge (`MaxHeapMerge.java`)

Efficiently merges two max-heaps into a single valid max-heap.

- **Input**: Two arrays representing valid max-heaps.
- **Output**: A merged array representing a max-heap.
- **Time Complexity**: O(n log n), where `n` is the combined size of both heaps.

### 2. Counting Sort (`CountingSort.java`)

An integer sorting algorithm that counts the frequency of elements to sort in linear time.

- **Input**: An array of non-negative integers.
- **Output**: A sorted array.
- **Time Complexity**: O(n + k), where `n` is the number of elements and `k` is the range of input.
- **Space Complexity**: O(k)

### 3. Sieve of Eratosthenes (`EratosthenesPrimeSearch.java`)

Finds all prime numbers up to a given limit using the classic sieve technique.

- **Input**: An integer `n`
- **Output**: A list of prime numbers less than or equal to `n`
- **Time Complexity**: O(n log log n)

## 🔧 How to Run

Make sure you have JDK installed. To compile and run:

```sh
javac src/MergeMaxHeap.java
java src/MergeMaxHeap

javac src/CountingSort.java
java src/CountingSort

javac src/EratosthenesSieve.java
java src/EratosthenesSieve
```
