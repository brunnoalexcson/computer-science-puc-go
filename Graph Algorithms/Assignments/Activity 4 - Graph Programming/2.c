// Brunno Alexcson de Carvalho
// Daniel Junio Barbosa Souza Filho

#include <stdio.h>
#include <stdbool.h>

bool validarGrafo(int n, int m, int incidencia[n][m]);
bool verificarConexo(int n, int adjacencia[n][n]);
void dfs(int n, int adjacencia[n][n], int visitado[], int v);
int calcularGrauSaida(int n, int m, int incidencia[n][m], int vertice);
int calcularGrauEntrada(int n, int m, int incidencia[n][m], int vertice);
void converterAdjacencia(int n, int m, int incidencia[n][m], int adjacencia[n][n]);

int main(){
    int n, m;
    printf("Digite o numero de vertices: ");
    scanf("%d", &n);

    printf("Digite o numero de arestas: ");
    scanf("%d", &m);

    if (n <= 0 || m < 0){
        printf("Dados inválidos. Encerrando programa...\n");
        return 0;
    }

    int incidencia[n][m];
    printf("Digite a matriz de incidencia, de um grafo direcionado qualquer, com %d vertices e %d arestas\n", n, m);
    // Padrão adotado:
    // 1 -> vértice de origem (saída)
    // -1 -> vértice de destino (entrada)
    // 0 -> não participa da aresta
    // 2 -> laço (origem e destino no mesmo vértice)

    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++){
            scanf("%d", &incidencia[i][j]);
        }
    }

    if (validarGrafo(n, m, incidencia)){
        printf("Eh um grafo valido.\n");
        int grauSaida, grauEntrada;
        for (int i = 0; i < n; i++){
            grauSaida = calcularGrauSaida(n, m, incidencia, i);
            grauEntrada = calcularGrauEntrada(n, m, incidencia, i);
            printf("Vertice %d: Grau de Saida: %d Grau de Entrada: %d\n",i+1, grauSaida, grauEntrada);
        }

        int adjacencia[n][n];
        converterAdjacencia(n, m, incidencia, adjacencia);
        printf("\nMatriz de Adjacencia (Convertida da matriz de incidencia):\n");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                printf("%d", adjacencia[i][j]);
                if (j < n-1){
                    printf(" ");
                }
            }
            printf("\n");
        }



    } else{
        printf("Nao eh um grafo valido.\n");
    }

    return 0;
}

bool validarGrafo(int n, int m, int incidencia[n][m]){
    // Valida se cada coluna representa uma aresta válida: ou uma aresta direcionada (+1 e -1) ou um laço (2)
    
    for (int j = 0; j < m; j++){
        int qtdMaisUm = 0, qtdMenosUm = 0, qtdDois = 0;

        for (int i = 0; i < n; i++){
            if (incidencia[i][j] == 1){
                qtdMaisUm++;
            }
            else if (incidencia[i][j] == -1){
                qtdMenosUm++;
            } else if(incidencia[i][j] == 2){
                qtdDois++;
            } else if (incidencia[i][j] != 0 && incidencia[i][j] != 1 && incidencia[i][j] != -1 && incidencia[i][j] != 2){
                return false;
            }
        }

        bool arestaNormal = (qtdMenosUm == 1 && qtdMaisUm == 1 && qtdDois == 0);
        bool laco = (qtdDois == 1 && qtdMenosUm == 0 && qtdMaisUm == 0);

        if (!arestaNormal && !laco){
            return false;
        }
    }

    return true;
}

int calcularGrauSaida(int n, int m, int incidencia[n][m], int vertice){
    int grauSaida = 0;

    for (int j = 0; j < m; j++){
        if (incidencia[vertice][j] == 1 || incidencia[vertice][j] == 2){
            grauSaida++;
        }
    }

    return grauSaida;
}

int calcularGrauEntrada(int n, int m, int incidencia[n][m], int vertice){
    int grauEntrada = 0;

    for (int j = 0; j < m; j++){
        if (incidencia[vertice][j] == -1 || incidencia[vertice][j] == 2){
            grauEntrada++;
        }
    }

    return grauEntrada;
}

void converterAdjacencia(int n, int m, int incidencia[n][m], int adjacencia[n][n]){
    for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++){
            adjacencia[i][j] = 0;
        }
    }

    for (int j = 0; j < m; j++){
        int origem = -1;
        int destino = -1;
        int laco = -1;
        for (int i = 0; i < n; i++){
            if (incidencia[i][j] == 1){
                origem = i;
            } else if (incidencia[i][j] == -1){
                destino = i;
            } else if (incidencia[i][j] == 2){
                laco = i;
            }
        }
        if (laco != -1){
            adjacencia[laco][laco] = 1;
        } else{
            adjacencia[origem][destino] = 1;
        }
    }
}