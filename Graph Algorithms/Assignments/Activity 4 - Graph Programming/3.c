// Brunno Alexcson de Carvalho
// Daniel Junio Barbosa Souza Filho

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

void dfs(int n, int **adj, int visitado[], int v);
bool verificarConexo(int n, int **adj);

int main(){
    int **vertice;
    int *verticeTamanho;

    int n;
    printf("Digite a quantidade de vertices: ");
    scanf("%d", &n);

    if (n <= 0){
        printf("Quantidade de vertices invalida.\n");
        return 0;
    }

    vertice = malloc(n * sizeof(int *));
    verticeTamanho = malloc(n * sizeof(int));

    for (int i = 0; i < n; i++){
        printf("Digite os vizinhos do vertice %d (-1 para parar): ", i + 1);

        int *listaTemp = NULL;
        int tamanho = 0;
        int valor;

        while (true){
            scanf("%d", &valor);

            if (valor == -1) break;

            if (valor < 1 || valor > n){
                printf("Valor invalido!\n");
                continue;
            }

            if (valor - 1 == i){
                printf("Grafo nao simples (laco).\n");
                return 0;
            }

            bool repetido = false;
            for (int k = 0; k < tamanho; k++){
                if (listaTemp[k] == valor - 1){
                    repetido = true;
                    break;
                }
            }

            if (repetido){
                printf("Vizinho duplicado.\n");
                continue;
            }

            tamanho++;

            int *temp = realloc(listaTemp, tamanho * sizeof(int));
            if (temp == NULL){
                printf("Erro de memoria!\n");
                free(listaTemp);
                return 1;
            }

            listaTemp = temp;
            listaTemp[tamanho - 1] = valor - 1;
        }

        vertice[i] = listaTemp;
        verticeTamanho[i] = tamanho;
    }

    printf("\nLista de Adjacencia:\n");
    for (int i = 0; i < n; i++){
        printf("Vertice %d: ", i + 1);
        for (int j = 0; j < verticeTamanho[i]; j++){
            printf("%d ", vertice[i][j] + 1);
        }
        printf("\n");
    }

    int **adj = malloc(n * sizeof(int *));
    for (int i = 0; i < n; i++){
        adj[i] = malloc(n * sizeof(int));
    }

    for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++){
            adj[i][j] = 0;
        }
    }

    for (int i = 0; i < n; i++){
        for (int j = 0; j < verticeTamanho[i]; j++){
            int v = vertice[i][j];

            adj[i][v] = 1;
            adj[v][i] = 1;
        }
    }

    if (!verificarConexo(n, adj)){
        printf("Grafo nao eh conexo.\n");
        return 0;
    }

    printf("\nMatriz de Adjacencia:\n");
    for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++){
            printf("%d ", adj[i][j]);
        }
        printf("\n");
    }

    for (int i = 0; i < n; i++){
        free(vertice[i]);
        free(adj[i]);
    }

    free(vertice);
    free(verticeTamanho);
    free(adj);

    return 0;
}

void dfs(int n, int **adj, int visitado[], int v){
    visitado[v] = 1;

    for (int i = 0; i < n; i++){
        if (adj[v][i] == 1 && !visitado[i]){
            dfs(n, adj, visitado, i);
        }
    }
}

bool verificarConexo(int n, int **adj){
    int *visitado = calloc(n, sizeof(int));

    dfs(n, adj, visitado, 0);

    for (int i = 0; i < n; i++){
        if (!visitado[i]){
            free(visitado);
            return false;
        }
    }

    free(visitado);
    return true;
}