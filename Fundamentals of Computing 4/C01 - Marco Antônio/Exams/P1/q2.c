#include <stdio.h>

int main() {
    double x = 1.0;

    while (1.0 + x > 1.0) {
        x /= 2.0;
    }

    x *= 2.0;  // Irá voltar um passo (pois passou do limite)

    printf("Unidade de maquina (double): %.20e\n\n", x); 

    x += 1;

    if (x >= 1.0){
        printf("O número %.20e é maior que 1.\n", x);
    } else{
        printf("O número %.20e não é maior que 1.\n", x);
    }
    

    return 0;
}