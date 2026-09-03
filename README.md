# DSA-Array-Practice
Solutions and practice code for Data Structure and Algorithms, including optimized in-place merging of two sorted arrays in Java

## Problem Statement
Merge Two Sorted Arrays In-Place without using extra space.

## Key Logic
1. **Three Pointers**:
2.  'i=m-1' (end of valid elements in 'arr1')
3.  'j=n-1' (end 'arr2')
4.  'k=m+n-1' (end of total merged array)

5.  **Reverse Comparison**: Compares 'arr1[i]' and 'arr2[j]' from right to left, placing the larger element at 'arr1[k]'

6.  **Leftover Copy**: If element in 'arr2' after 'i' reaches '-1', they are copied directly into 'arr1'
