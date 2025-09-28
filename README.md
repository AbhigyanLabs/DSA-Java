DSA Repository 🚀

This repository contains my Data Structures and Algorithms (DSA) journey, including implementations of various algorithms and problem-solving techniques in Java. It serves as a personal learning resource and a 
reference for coding interviews and competitive programming.

📌 What's Inside?

✅ Common Data Structures (Arrays, Linked Lists, Stacks, Queues, Trees, Graphs)

✅ Sorting & Searching Algorithms

✅ Dynamic Programming & Recursion

✅ Greedy Algorithms

✅ Backtracking & Bit Manipulation

✅ Graph Algorithms (BFS, DFS, Dijkstra, etc.)

✅ Important Coding Interview Questions

# 🧭 Binary Search Toolkit (LeetCode Cheatsheet)

A complete reference for all **binary search patterns** — from simple target search to rotated arrays and tricky duplicates.  
Use this as your **one-stop guide** while solving LeetCode problems. 🚀

---

## 📌 1. Basic Binary Search
```java
int left = 0, right = n - 1;
while (left <= right) {
    int mid = left + (right - left) / 2;
    if (nums[mid] == target) return mid;
    else if (nums[mid] < target) left = mid + 1;
    else right = mid - 1;
}
return -1;
````

* ✅ Use `<=` to make sure all elements are checked
* ⏱️ Time Complexity: **O(log n)**

---

## 📌 2. `Arrays.binarySearch()` (Java)

* Only works on **sorted arrays**
* Returns:

  * `index >= 0` if found
  * `-(insertionPoint + 1)` if not found
* ❌ Don’t use on rotated arrays

---

## 📌 3. Rotated Sorted Array (No Duplicates)

* Identify sorted half:

```java
if (nums[left] <= nums[mid]) { 
   // left half sorted
} else {
   // right half sorted
}
```

* Narrow search range based on where `target` lies

---

## 📌 4. Rotated Sorted Array (With Duplicates) → LeetCode 81

* Handle duplicates:

```java
if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
    left++; right--;
}
```

* Continue normal rotated binary search

---

## 📌 5. Find Minimum in Rotated Array → LeetCode 153/154

```java
while (left < right) {
    int mid = left + (right - left) / 2;
    if (nums[mid] > nums[right]) {
        left = mid + 1;
    } else {
        right = mid;
    }
}
return nums[left];
```

* ✅ Use `<` (boundary search)
* Handles duplicates with slight modifications

---

## 📌 6. When to Use `<` vs `<=`

* **Target search** → `while (left <= right)`
* **Boundary search (min/first/last)** → `while (left < right)`

---

## 📌 7. Common Pitfalls 🚨

* ❌ Using `Arrays.binarySearch` on rotated/unsorted arrays
* ❌ Forgetting `+1 / -1` updates → infinite loop
* ❌ Accessing `nums[mid ± 1]` without bounds check
* ❌ Not handling duplicates → stuck loop

---

## 📌 8. Boundary Problems

### First Occurrence

```java
while (left < right) {
    int mid = (left + right) / 2;
    if (nums[mid] >= target) right = mid;
    else left = mid + 1;
}
```

### Last Occurrence

```java
while (left < right) {
    int mid = (left + right + 1) / 2; // bias right
    if (nums[mid] <= target) left = mid;
    else right = mid - 1;
}
```

---

## 📌 9. Complexity Recap

* Normal Binary Search → **O(log n)**
* Rotated Array (no duplicates) → **O(log n)**
* Rotated Array (with duplicates) → **O(n)** worst-case

---

## 📝 Quick Flow (Decision Map)

1. Is array **sorted normally**? → Use **basic binary search**
2. Is array **rotated**?

   * No duplicates → use **rotated search template**
   * With duplicates → shrink edges then use rotated search
3. Searching **min / boundary**? → Use `<` loop style
4. Searching **exact target**? → Use `<=` loop style

---

💡 Master these templates and you can solve LeetCode classics:

* 33. Search in Rotated Sorted Array
* 34. Find First and Last Position
* 35. Search Insert Position
* 74. Search a 2D Matrix
* 81. Search in Rotated Sorted Array II
* 153. Find Minimum in Rotated Sorted Array
* 154. Find Minimum in Rotated Sorted Array II
* 162. Find Peak Element
* 240. Search a 2D Matrix II

💡 Usage
Feel free to explore, contribute, and improve the solutions! Clone the repository and run the code in your preferred environment.

🔗 Connect with Me on-

LinkedIn | GitHub | LeetCode | CodeChef
