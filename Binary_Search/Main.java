void binarySearch(int n, const keytype S[], keytype x, index & location)
{
index low = 1, high = n, mid;
locaiton = 0;

while(low<=high && location==0) {
mid = (low+high)/2;
if(x == S[mid]) location = mid;
else if(x < S[mid]) high = mid -1;  //if the mid is more than x
else low = mid + 1; //if the x is more than mid 
}

  
  //recursive 
  index binarySearch(keytpype S[], keytype x, index low, index high) 
{
	index mid = (low+high)/2;
	if(low > high) return 0;
	else 
	 if(x == S[mid]) return mid;
	 else if(x < S[mid]) return binarySearch(S,x,low,mid-1);
	 else return binarySearch(S,x,mid+1,high);
}
