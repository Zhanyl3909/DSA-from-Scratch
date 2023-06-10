# Merge Sort
`top - down 방식을 DAC 설계`

1. 분할 - 배열을 n/2 개의 키들로 구성된 두 개의 부분배열로 나눈다.
2. 정복 - 배열의 크기가 충분히 작으면 직접 정렬한다.
3. 통합 - 부분배열에 저장된 두 개의 정렬된 리스트를 하나로 정렬하여 배열에 저장한다. 
4. 
![App Screenshot](/Merge_Sort/Merge.png)

```java
void mergeSort(keytype S[], index low, index high) {
index mid = (low + high)/2;
if(low >= high) return;
mergeSort(S,low,mid);
mergeSort(S,mid+1,high);
mergeSort(S,low,mid,high);
```

```java
void merge(keytype S[], index low, index mid, index high) {
	 index i = low;
	 index j = mid + 1;
	 index k = low;
	
	keytype tempArr[high];
	while(i<=mid && j<=high) {
	if(S[i] < S[j]) {
		tempArr[k] = S[j];
			j++;
	  }
	 k++;
	 }
	if(i > mid) 
	for(; h<=high; j++, k++) tempArr[k] = S[j];
	else for(;i<=mid; i++, k++) tempArr[k] = S[i];
	for(k = low, k<=high; k++) S[k] = tempArr[k];
	}
```
