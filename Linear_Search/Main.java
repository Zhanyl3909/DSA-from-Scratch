void seqSearch(int n, const keytype S[], keytpye x, indx & location) 
{
location = 1;
while(location <= n && S[location] != x) {
 location++;
if(location > n) location = 0;
}
