[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=21166991)
# Instructions  

  ## Questions
1. Create 3 methods:

bubbleSort(double[] nums) - optimized version </br>
selectionSort(double[] nums)</br>
insertionSort(double[] nums)</br>

Each sort will sort the array as normal, but will also return an integer array with two values. At Index 0 will be the number of swaps done during the sort (for each swap, increase the count by 3. For each change of a single variable value such as in insertion sort, increase swaps by 1), and index 1 will be the number of Steps. Steps refers to comparisons done in your code.

2. Create a method called leastSwaps(double[] nums)

This method will return one of 3 strings. "Bubble", "Selection" or "Insertion".
It must return the sort which uses the least number of swaps between the 3 methods.

## **Make sure you copy the array before doing each sort so that you don't alter the original array. If two sorts tie for least, return the first one alphabetically.**

3. Create a method called leastIterations(double[] nums)

This method will return one of 3 strings. "Bubble", "Selection" or "Insertion".
It must return the sort which uses the least number of iterations between the 3 methods.

## **Make sure you copy the array before doing each sort so that you don't alter the original array. If two sorts tie for least, return the first one alphabetically.**
