#include <stdio.h>
#include <math.h>

#define N 3
#define TOL 1e-5
#define MAX 1000

int main() {
    double A[N][N] = {
        {10, 3, -2},
        {2, 8, -1},
        {1, 1, 5}
    };

    double b[N] = {57, 20, -4};
    double x[N] = {0, 0, 0};
    double x_new[N];
    double erro;
    int iter = 0;

    do {
        erro = 0;

        for (int i = 0; i < N; i++) {
            double soma = 0;

            for (int j = 0; j < N; j++) {
                if (j != i)
                    soma += A[i][j] * x[j];
            }

            x_new[i] = (b[i] - soma) / A[i][i];
        }

        for (int i = 0; i < N; i++) {
            if (fabs(x_new[i] - x[i]) > erro)
                erro = fabs(x_new[i] - x[i]);

            x[i] = x_new[i];
        }

        iter++;

    } while (erro > TOL && iter < MAX);

    printf("Solucao:\n");
    for (int i = 0; i < N; i++)
        printf("x%d = %.6lf\n", i+1, x[i]);

    printf("Iteracoes: %d\n", iter);

    return 0;
}