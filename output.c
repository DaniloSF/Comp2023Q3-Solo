#include <stdio.h>
int main() {
float a, b;
int c, f;
c=0;
printf("%s", "Hello World!\n");
printf("%s", "Digite o valor C\n");
scanf("%d", &c);
a=2.0;
b=3.2+2.0-1.0+5.0-3.0+a;
b=b/2.0;
b=b*2.0;
printf("%f\n", a);
printf("%f\n", b);
if (a>=b) {
 printf("%f\n", a);
}
else {
if (a<b) {
 printf("%f\n", a);
printf("%s", "goodbye world\n");
}
else {
printf("%s", "nao sei\n");
}
}
printf("%s", "Hmm\n");
if (a<b) {
 printf("%s", "WOW\n");
}
for(f=0; f<=10; f++) {
printf("%d\n", f);
}
while (c>0) {
 printf("%d\n", c);
c=c-1;
}
printf("%s", "Oi\n");
return 0;
}

