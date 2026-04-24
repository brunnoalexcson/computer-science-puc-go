// Brunno Alexcson de Carvalho
// Daniel Junio Barbosa Souza Filho

#include <stdio.h>
#include <stdbool.h>

bool validarGrafo(int n, int adjacencia[n][n]);
bool verificarConexo(int n, int adjacencia[n][n]);
void dfs(int n, int adjacencia[n][n], int visitado[], int v);
int calcularGrau(int n, int adjacencia[n][n], int vertice);

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

    if (validarGrafo(n, adjacencia) && verificarConexo(n, adjacencia)){
        printf("Eh um grafo valido.\n");
        int grau;
        for (int i = 0; i < n; i++){
            grau = calcularGrau(n, adjacencia, i);
            printf("Vertice %d: grau %d\n",i+1, grau);
        }
    } else{
        printf("Nao eh um grafo valido.\n");
    }

    return 0;
}

bool validarGrafo(int n, int adjacencia[n][n]){
    // 1° validação: Conferir se na matriz[i][j], existe algum número diferente de 0 ou 1 (Que corresponde ao grafo simples)
    // 2° validação: Conferir se a matriz[n][n] é simétrica. Por ser não direcionado, a matriz precisa ser simétrica
    // 3° validação: Conferir se todos os elementos da diagonal é zero
    // 4° validação: Conferir o somatório dos graus
    
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

bool verificarConexo(int n, int adjacencia[n][n]){
    int visitado[n];
    for (int i = 0; i < n; i++){
        visitado[i] = 0;
    }

    dfs(n, adjacencia, visitado, 0);

    for(int i = 0; i < n; i++){
        if (!visitado[i]){
            return false;
        }
    }

    return true;
}

void dfs(int n, int adjacencia[n][n], int visitado[], int v){
    visitado[v] = 1;
    for (int i = 0; i < n; i++){
        if (adjacencia[v][i] == 1 && !visitado[i]){
            dfs(n, adjacencia, visitado, i);
        }
    }
}

int calcularGrau(int n, int adjacencia[n][n], int vertice){
    int grau = 0;
    
    for (int j = 0; j < n; j++){
        if (adjacencia[vertice][j] == 1){
            grau++;
        }
    }

    return grau;
}
