// falta fazer o gráfico!!

#include <stdio.h>
#include <math.h>

double f(double x) {
    return pow(x,4) - 12*pow(x,3) + 47*pow(x,2) - 60*x;
}

double df(double x) {
    return 4*pow(x,3) - 36*pow(x,2) + 94*x - 60;
}

int main() {
    double x0, x1, erro;
    int iter = 0;
    double tol = 1e-5;

    printf("Digite o valor inicial x0: ");
    scanf("%lf", &x0);

    do {
        if (df(x0) == 0) {
            printf("Derivada zero! Parou.\n");
            return 0;
        }

        x1 = x0 - f(x0)/df(x0);
        erro = fabs(x1 - x0);

        x0 = x1;
        iter++;

    } while (erro > tol);

    printf("Raiz encontrada: %.6lf\n", x1);
    printf("Numero de iteracoes: %d\n", iter);

    return 0;
}