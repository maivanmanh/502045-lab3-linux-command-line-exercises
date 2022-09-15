#include <stdio.h>

long factorial(int n)
{
    if (n == 0) return 1;
    return n * factorial(n - 1);
}

int main()
{
    int x;
    printf("Enter x: ");
    scanf("%d", &x);

    printf("\nYou have entered: %d\n", x);
    printf("%d! = %ld\n\n", x, factorial(x));

    return 0;
}