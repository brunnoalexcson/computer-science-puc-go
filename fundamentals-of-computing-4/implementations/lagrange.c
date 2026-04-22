/*
This code implements the Lagrange polynomial interpolation.
Made by Brunno Alexcson de Carvalho
Date: 2026-04-22
*/

#include <stdio.h>

int main(){
    int m;
    double z, r;
    // m : number of points
    // x : x[i] values (independent variable)
    // y : y[i] values (function values f(x))
    // z : point where you want to calculate the value (example: 1.8)
    // r : final result of the interpolation

    // input
    r = 0.0;
    printf("Enter the number of points: ");
    scanf("%d", &m);

    double x[m], y[m];
    for (int i = 0; i < m; i++){
        printf("\nEnter x : x[%d]: ", i);
        scanf("%lf", &x[i]);

        printf("Enter y : f(x): ");
        scanf("%lf", &y[i]);
    }

    printf("Enter the point where you want to calculate the r: ");
    scanf("%lf", &z);

    printf("\n===== TABLE =====\n");
    for (int i = 0; i < m; i++){
        printf("x[%d] = %.6lf | f(x) = %.6lf\n", i, x[i], y[i]);
    }

    // check repeated x
    for (int i = 0; i < m; i++){
        for (int j = i + 1; j < m; j++){
            if (x[i] == x[j]){
                printf("Error: repeated x values!\n");
                return 1;
            }
        }
    }

    // check if z == x[i]
    for (int i = 0; i < m; i++){
        if (z == x[i]){
            printf("This point already exists!\n");
            printf("Result: %.6lf\n", y[i]);
            return 0;
        }
    }

    // application of the Lagrange method
    for (int i = 0; i < m; i++){
        double c = 1.0, d = 1.0;
        for (int j = 0; j < m; j++){
            if (i != j){
                c = c * (z-x[j]);
                d = d * (x[i] - x[j]);
            }
        }
        r = r + y[i] * c/d;
    }

    // output
    printf("result of the interpolation: %.6lf", r);


    return 0;
}