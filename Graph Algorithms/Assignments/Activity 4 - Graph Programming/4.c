// Brunno Alexcson de Carvalho
// Daniel Junio Barbosa Souza Filho

#include <stdio.h>
#include <stdbool.h>

bool validarGrafo(int n, int adjacencia[n][n]);
bool verificarVertices(int nGrafo1, int nGrafo2);
bool verificarAresta(int nGrafo1, int adjacenciaG1[nGrafo1][nGrafo1], int nGrafo2, int adjacenciaG2[nGrafo2][nGrafo2]);
bool verificarGrau(int nGrafo1, int adjacenciaG1[nGrafo1][nGrafo1], int nGrafo2, int adjacenciaG2[nGrafo2][nGrafo2]);


int main(){
    int nGrafo1, nGrafo2;

    // GRAFO 1
    printf("Digite a quantidade de vertices do Grafo 1: ");
    scanf("%d", &nGrafo1);

    if (nGrafo1 <= 0){
        printf("Numero de vertices invalido.\n");
        return 0;
    }

    int adjacenciaGrafo1[nGrafo1][nGrafo1];
    printf("Digite a matriz de adjacencia, de um grafo simples, nao direcionado e conexo, com %d vertices para a representação do grafo 1\n", nGrafo1);

    for (int i = 0; i < nGrafo1; i++){
        for (int j = 0; j < nGrafo1; j++){
            scanf("%d", &adjacenciaGrafo1[i][j]);
        }
    }

    if (validarGrafo(nGrafo1, adjacenciaGrafo1)){
        printf("O grafo 1 eh valido.\n");
    } else{
        printf("O grafo 1 nao eh valido.\n");
        return 0;
    }

    // GRAFO 2
    printf("Digite a quantidade de vertices do Grafo 2: ");
    scanf("%d", &nGrafo2);

    if (nGrafo2 <= 0){
        printf("Numero de vertices invalido.\n");
        return 0;
    }

    int adjacenciaGrafo2[nGrafo2][nGrafo2];
    printf("Digite a matriz de adjacencia, de um grafo simples, nao direcionado e conexo, com %d vertices para a representação do grafo 2\n", nGrafo2);

    for (int i = 0; i < nGrafo2; i++){
        for (int j = 0; j < nGrafo2; j++){
            scanf("%d", &adjacenciaGrafo2[i][j]);
        }
    }

    if (validarGrafo(nGrafo2, adjacenciaGrafo2)){
        printf("O grafo 2 eh valido.\n\n");
    } else{
        printf("O grafo 2 nao eh valido.\n\n");
        return 0;
    }

    if (!verificarVertices(nGrafo1, nGrafo2)){
        printf("Nao sao isomorfos.\n");
    } else if(!verificarAresta(nGrafo1, adjacenciaGrafo1, nGrafo2, adjacenciaGrafo2)){
        printf("Nao sao isomorfos.\n");
    } else if (!verificarGrau(nGrafo1, adjacenciaGrafo1, nGrafo2, adjacenciaGrafo2)){
        printf("Nao sao isomorfos.\n");
    } else{
        printf("Podem ser isomorfos.\n");
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

bool verificarVertices(int nGrafo1, int nGrafo2){
    return nGrafo1 == nGrafo2; 
}

bool verificarAresta(int nGrafo1, int adjacenciaG1[nGrafo1][nGrafo1], int nGrafo2, int adjacenciaG2[nGrafo2][nGrafo2]){
    int arestaG1;
    int arestaG2;
     
    arestaG1 = arestaG2 = 0;
    for (int i = 0; i < nGrafo1; i++){
        for (int j = i+1; j < nGrafo1; j++){
            if (adjacenciaG1[i][j] == 1){
                arestaG1++;
            }
        }
    }

    for (int i = 0; i < nGrafo2; i++){
        for (int j = i+1; j < nGrafo2; j++){
            if (adjacenciaG2[i][j] == 1){
                arestaG2++;
            }
        }
    }

    return arestaG1 == arestaG2;
}

bool verificarGrau(int nGrafo1, int adjacenciaG1[nGrafo1][nGrafo1], int nGrafo2, int adjacenciaG2[nGrafo2][nGrafo2]){
    int grauG1[nGrafo1];
    int grauG2[nGrafo2];

    for (int i = 0; i < nGrafo1; i++){
        grauG1[i] = 0;
    }

    for (int i = 0; i < nGrafo2; i++){
        grauG2[i] = 0;
    }

    for (int i = 0; i < nGrafo1; i++){
        for (int j = 0; j < nGrafo1; j++){
            if (adjacenciaG1[i][j] == 1){
                grauG1[i]++;
            }
        }
    }

    for (int i = 0; i < nGrafo2; i++){
        for (int j = 0; j < nGrafo2; j++){
            if (adjacenciaG2[i][j] == 1){
                grauG2[i]++;
            }
        }
    }

    // Ordenar os dois vetores por bubble sort
    // Ordenar grauG1
    for (int i = 0; i < nGrafo1 - 1; i++){
        for (int j = 0; j < nGrafo1 - i - 1; j++){
            if (grauG1[j] > grauG1[j+1]){
                int aux = grauG1[j];
                grauG1[j] = grauG1[j+1];
                grauG1[j+1] = aux;
            }
        }
    }

    // Ordenar grauG2
    for (int i = 0; i < nGrafo2 - 1; i++){
        for (int j = 0; j < nGrafo2 - i - 1; j++){
            if (grauG2[j] > grauG2[j+1]){
                int aux = grauG2[j];
                grauG2[j] = grauG2[j+1];
                grauG2[j+1] = aux;
            }
        }
    }

    // Comparar as duas sequências de graus
    for (int i = 0; i < nGrafo1; i++){
        if (grauG1[i] != grauG2[i]){
            return false;
        }
    } 

    return true;
}
