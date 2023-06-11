# Quick Sort

***QuickSort** is a sorting algorithm based on the **[Divide and Conquer algorithm]** 
that picks an element as a pivot and partitions the given array around the picked pivot by placing the pivot 
in its correct position in the sorted array.*


![App Screenshot](/Quick_Sort/quick.png)

### Analysis of Quick Sort

```java
int Partition(int A[], int low, int high) 
{
	int Pivot = A[low];
	int i = low;
	int j = high;
		
	do 
	{
		do{i++;} while (A[i] <= pivot);
		do(j--;} while (A[j] > pivot);
		if(i < j) 
		   swap(A[i],[j]);
		} while(i < j);
		swap(A[i],A[j]);
		return j;
}
```

`Time Complexity: O(n^2)` - wort case

`Time Complexity: O(nlogn)` - best case

`Time Complexity: O(nlogn)` - average case
