#include <stdio.h>
#include <math.h>

#define TOL 1e-5
#define MAX 1000

int main() {
    double x1 = 1, x2 = 1;
    double dx1, dx2;
    double erro;
    int iter = 0;

    do {
        double f1 = x1*x1 + x2*x2 - 1;
        double f2 = x1*x1 - x2*x2 - 1;

        double J11 = 2*x1;
        double J12 = 2*x2;
        double J21 = 2*x1;
        double J22 = -2*x2;

        double det = J11*J22 - J12*J21;

        if (det == 0) {
            printf("Jacobiana singular!\n");
            return 0;
        }

        dx1 = (-f1*J22 + J12*f2) / det;
        dx2 = (-J11*f2 + f1*J21) / det;

        x1 += dx1;
        x2 += dx2;

        erro = fmax(fabs(dx1), fabs(dx2));
        iter++;

    } while (erro > TOL && iter < MAX);

    printf("Solucao:\n");
    printf("x1 = %.6lf\n", x1);
    printf("x2 = %.6lf\n", x2);
    printf("Iteracoes: %d\n", iter);

    return 0;
}