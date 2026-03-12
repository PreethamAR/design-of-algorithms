// Greatest Common Divisor(GCD) is the largest positive integer that divides two or more numbers without leaving a remainder.

// 1.Algorithm – Using Loop Euclidean Method:-
#include <stdio.h>
int main() {
int a, b, temp;
printf("Enter two numbers: ");
scanf("%d %d", &a, &b);

while(b != 0) {
    temp = b;
    b = a % b;
    a = temp;
}
printf("GCD = %d", a);
return 0;
}

// Using Recursion

#include <stdio.h>
int gcd(int a, int b) {
if(b == 0)
return a;
else
return gcd(b, a % b);
}
int main() {
int a, b;

printf("Enter two numbers: ");
scanf("%d %d", &a, &b);

printf("GCD = %d", gcd(a,b));

return 0;
}

// Using Consecutive Integer Checking (Loop):-

#include <stdio.h>

int main() {
int a, b, t;

printf("Enter two numbers: ");
scanf("%d %d", &a, &b);

t = (a < b) ? a : b;

while(t > 0) {
    if(a % t == 0 && b % t == 0) {
        printf("GCD = %d", t);
        break;
    }
    t--;
}
return 0;
}

// Using Recursion

#include <stdio.h>

int gcd(int a, int b, int t) {

    if(t == 0)
        return 1;

    if(a % t == 0 && b % t == 0)
        return t;

    return gcd(a, b, t - 1);
}
int main() {

int a, b, t;
printf("Enter two numbers: ");
scanf("%d %d", &a, &b);
t = (a < b) ? a : b;
printf("GCD = %d", gcd(a, b, t));

return 0;
}

// Middle School Method (Loop Implementation):-

#include <stdio.h>
int main() {
int a, b, i = 2, gcd = 1;
printf("Enter two numbers: ");
scanf("%d %d", &a, &b);
while(a > 1 && b > 1) {
    if(a % i == 0 && b % i == 0) {
        gcd = gcd * i;
        a = a / i;
        b = b / i;
    }
    else if(a % i == 0) {
        a = a / i;
    }
    else if(b % i == 0) {
        b = b / i;
    }
    else {
        i++;
    }
}
printf("GCD = %d", gcd);
return 0;
}

// Middle School Method (Recursion Implementation):-

#include <stdio.h>
int gcd_middle(int a, int b, int i) {
    if(a == 1 || b == 1)
        return 1;
    if(a % i == 0 && b % i == 0)
        return i * gcd_middle(a/i, b/i, i);
    if(a % i == 0)
        return gcd_middle(a/i, b, i);
    if(b % i == 0)
        return gcd_middle(a, b/i, i);
    return gcd_middle(a, b, i+1);
}

int main() {
    int a, b;
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);
    printf("GCD = %d", gcd_middle(a, b, 2));
    return 0;
}