
void mergeSort(keytype S[], index low, index high) {
index mid = (low + high)/2;
if(low >= high) return;
mergeSort(S,low,mid);
mergeSort(S,mid+1,high);
mergeSort(S,low,mid,high);

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
