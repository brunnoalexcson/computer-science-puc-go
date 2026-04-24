// Brunno Alexcson de Carvalho
// Daniel Junio Barbosa Souza Filho

#include <stdio.h>
#include <stdbool.h>

bool validarGrafo(int n, int adjacencia[n][n]);
void calcularGrau(int n, int adjacencia[n][n], int grau[]);
bool verificarCiclo(int n, int grau[]);
bool verificarCompleto(int n, int grau[]);
bool verificarRoda(int n, int grau[]);


int main(){
    int n;

    printf("Digite a quantidade de vertices do grafo: ");
    scanf("%d", &n);

    if (n <= 0){
        printf("Numero de vertices invalido.\n");
        return 0;
    }

    int adjacencia[n][n];
    printf("Digite a matriz de adjacencia, de um grafo simples, nao direcionado e conexo, com %d vertices\n", n);

    for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++){
            scanf("%d", &adjacencia[i][j]);
        }
    }

    if (validarGrafo(n, adjacencia)){
        printf("Eh um grafo valido.\n");
    } else{
        printf("Nao eh um grafo valido.\n");
        return 0;
    }

    int grau[n];
    calcularGrau(n, adjacencia, grau);

    bool algum = false;

    if (verificarCompleto(n, grau)){
        printf("Grafo completo\n");
        algum = true;
    }

    if (verificarCiclo(n, grau) && n >= 3){
        printf("Grafo ciclo\n");
        algum = true;
    }

    if (verificarRoda(n, grau)){
        printf("Grafo roda\n");
        algum = true;
    }

    if (!algum){
        printf("Nenhum dos tres\n");
    }
        
    return 0;
}

bool validarGrafo(int n, int adjacencia[n][n]){
    int somaGraus = 0;

    for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++){
            if (adjacencia[i][j] != 0 && adjacencia[i][j] != 1){
                return false;
            }
            somaGraus += adjacencia[i][j];
        }
        if (adjacencia[i][i] != 0){
            return false;
        }
    }

    for (int i = 0; i < n; i++){
        for (int j = i+1; j < n; j++){
            if (adjacencia[i][j] != adjacencia[j][i]){
                return false;
            }
        }
    }

    if (somaGraus % 2 != 0){
        return false;
    }

    return true;
}

void calcularGrau(int n, int adjacencia[n][n], int grau[]){
    for (int i = 0; i < n; i++){
        grau[i] = 0;
        for (int j = 0; j < n; j++){
            if (adjacencia[i][j] == 1){
                grau[i]++;
            }
        }
    }
}

bool verificarCiclo(int n, int grau[]){
    for (int i = 0; i < n; i++){
        if (grau[i] != 2){
            return false;
        }
    }
    return true;
}

bool verificarCompleto(int n, int grau[]){
    for (int i = 0; i < n; i++){
        if (grau[i] != n-1){
            return false;
        }
    }
    return true;
}

bool verificarRoda(int n, int grau[]){
    int centro = 0;

    for (int i = 0; i < n; i++){
        if (grau[i] == n-1){
            centro++;
        } else if (grau[i] != 3){
            return false;
        }
    }
    return ( (centro == 1 || centro == n) && n >= 4 );
}