# Fibonacci 

`Fn = Fn-1 + Fn-2`

`F0 = 0 and F1 = 1`

- Recursion
- Iteration

```java
int fib(int n) {
 if(n<=1) return n;
 return fib(n-1) + fib(n-2);
}
```

```java
int fib(int n) {
	index i;
	int f, p = 1, pp = 0;  //pp - preprevious, p - previous, f - next
	if(n<=1) return n;
	for(i=2; i<=n; i++) {
		f = p + pp;
		pp = p;
		p = f;
	}
	return p;
}
```
