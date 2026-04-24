#include <stdio.h>
#include <math.h>

int main() {
    double a, b, c;
    double delta, x1, x2;

    printf("Digite a: ");
    scanf("%lf", &a);
    printf("Digite b: ");
    scanf("%lf", &b);
    printf("Digite c: ");
    scanf("%lf", &c);

    if (a == 0) {
        printf("Nao eh equacao do segundo grau.\n");
        return 0;
    }

    delta = b*b - 4*a*c;

    if (delta > 0) {
        double sqrt_delta = sqrt(delta);

        if (b > 0)
            x1 = (-b - sqrt_delta) / (2*a);
        else
            x1 = (-b + sqrt_delta) / (2*a);

        x2 = c / (a * x1);

        printf("Raizes reais:\n");
        printf("x1 = %.10e\n", x1);
        printf("x2 = %.10e\n", x2);
    }
    else if (delta == 0) {
        x1 = -b / (2*a);
        printf("Raiz dupla:\n");
        printf("x = %.10lf\n", x1);
    }
    else {
        double real = -b / (2*a);
        double imag = sqrt(-delta) / (2*a); 

        printf("Raizes complexas:\n");
        printf("x1 = %.10lf + %.10lfi\n", real, imag);
        printf("x2 = %.10lf - %.10lfi\n", real, imag);
    }

    return 0;
}

// Teste pedido na prova:
// a : 1e-8
// b : -0.8
// c : 1e-8