// Trabalho 1 – Ordenação e Busca, feito por Brunno Alexcson de Carvalho
// Algoritmos de Ordenação trabalhados: Bubble Sort, Selection Sort e Merge Sort
// Algoritmos de Busca trabalhados: Busca Sequencial e Busca Binária

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <time.h>

// Protótipo das funções que o programa terá
// 1° bloco - algoritmos de ordenação
void bubbleSort(int V[], int tamanho, int *comp, int *trocas);
void selectionSort(int V[], int tamanho, int *comp, int *trocas);
void mergeSort(int V[], int inicio, int fim, int *comp);
void merge(int V[], int inicio, int meio, int fim, int *comp);
void imprimir(int V[], int tamanho);
void vetorCrescente(int V[], int tamanho);
void vetorDecrescente(int V[], int tamanho);
void vetorAleatorio(int V[], int tamanho);
void menuOrdenacao();
void configurarExecucao(int algoritmo);
void executarAlgoritmo(int algoritmo, int n, int tipo);

// 2° bloco - algoritmos de busca
int buscaSequencial(int V[], int tamanho, int valor, int *comp);
int buscaBinaria(int V[], int tamanho, int valor, int *comp);
void menuBusca();
void configurarBusca(int tipoBusca);
void executarBusca(int tipoBusca, int n, int tipo, int valor);

int main(){
    srand(42); // Sempre gera a mesma sequência e faz a execução ser 100% reprodutível, comparando justamente os algoritmos

    int opcao;

    do{
        printf("========================================\n");
        printf("     SISTEMA DE ANALISE DE ALGORITMOS\n");
        printf("========================================\n");
        printf("\n1. Algoritmos de Ordenacao\n2. Algoritmos de Busca\n0. Sair\n\nEscolha uma opcao: ");
        scanf("%d", &opcao);

        switch(opcao){
            case 1:
                menuOrdenacao();
                break;
            case 2:
                menuBusca();
                break;
            default:
                printf("Opcao invalida\n");
                break;
        }


    } while (opcao != 0);

}

// Aplicação do algoritmo de ordenação Bubble Sort
void bubbleSort(int V[], int tamanho, int *comp, int *trocas){
    int aux;
    bool troca = true;
    for (int i = 0; i < tamanho && troca; i++){
        troca = false;
        for (int j = 0; j < tamanho-i-1; j++){
            (*comp)++;

            if (V[j] > V[j+1]){
                (*trocas)++;

                troca = true;
                aux = V[j];
                V[j] = V[j+1];
                V[j+1] = aux;
            }
        }
    }
}

// Aplicação do algoritmo de ordenação Selection Sort
void selectionSort(int V[], int tamanho, int *comp, int *trocas){
    int indiceMenor, aux;
    for (int i = 0; i < tamanho-1; i++){
        indiceMenor = i;
        for (int j = i+1; j < tamanho; j++){
            (*comp)++;

            if (V[j] < V[indiceMenor]){
                indiceMenor = j;
            }
        }
        if (indiceMenor != i){
            (*trocas)++;

            aux = V[i];
            V[i] = V[indiceMenor];
            V[indiceMenor] = aux;
        }
    }
}

// Aplicação do algoritmo de Merge Sort
// Função que irá dividir recursivamente o vetor até ter um subvetor de tamanho 1
void mergeSort(int V[], int inicio, int fim, int *comp){
    if (inicio < fim){
        int meio = (inicio+fim)/2;
        mergeSort(V, inicio, meio, comp);
        mergeSort(V, meio+1, fim, comp);

        merge(V, inicio, meio, fim, comp);
    }
}

// Função que irá executar o merge e combinar os subvetores ordenados
void merge(int V[], int inicio, int meio, int fim, int *comp){
    int i = inicio;
    int j = meio+1;
    int k = 0;

    int aux[fim-inicio+1];

    while (i <= meio && j <= fim){
        (*comp)++;
        if (V[i] <= V[j]){
            aux[k] = V[i];
            k++;
            i++;
        } else{
            aux[k] = V[j];
            k++;
            j++;
        }
    }

    while (i <= meio){
        aux[k] = V[i];
        k++;
        i++;
    }

    while (j <= fim){
        aux[k] = V[j];
        k++;
        j++;
    }

    for (int x = 0; x < k; x++){
        V[inicio+x] = aux[x];
    }
}

// Função para imprimir o vetor
void imprimir(int V[], int tamanho){
    for (int i = 0; i < tamanho; i++){
        printf("%d", V[i]);
        if (i < tamanho-1){
            printf(" ");
        } else{
            printf("\n");
        }
    }
}

// Inicialização do vetor de forma crescente
void vetorCrescente(int V[], int tamanho){
    for (int i = 0; i < tamanho; i++){
        V[i] = i+1;
    }
}

// Inicialização do vetor de forma decrescente
void vetorDecrescente(int V[], int tamanho){
    for (int i = 0; i < tamanho; i++){
        V[i] = tamanho-i;
    }
}

// Inicialização do vetor de forma aleatória
void vetorAleatorio(int V[], int tamanho){
    for (int i = 0; i < tamanho; i++){
        V[i] = rand() % tamanho;
    }
}

// Função de menu: só escolhe o algoritmo
void menuOrdenacao(){
    int alg;
    do{
        printf("========================================\n");
        printf("     ALGORITMOS DE ORDENACAO\n");
        printf("========================================\n");
        printf("\n1. Bubble Sort\n2. Selection Sort\n3. Merge Sort\n0. Voltar\n");
        printf("\nEscolha uma opcao: ");
        scanf("%d", &alg);

        switch(alg){
            case 1:
                configurarExecucao(1);
                break;
            case 2:
                configurarExecucao(2);
                break;
            case 3:
                configurarExecucao(3);
                break;
            case 0:
                printf("Voltando...\n");
                break;
            default:
                printf("Opcao invalida\n");
                break;
        } 
    } while (alg != 0);
}

// Função de menu: define tamanho e tipo do vetor
void configurarExecucao(int algoritmo){
    int tamanho;

    do{
        printf("\n1. 100\n2. 1000\n3. 10000\n4. Manual\n0. Voltar\n");
        scanf("%d", &tamanho);

        if (tamanho == 0) return;

        int n;

        switch(tamanho){
            case 1:
                n = 100;
                break;
            case 2:
                n = 1000;
                break;
            case 3: 
                n = 10000;
                break;
            case 4:
                printf("Digite: ");
                if (scanf("%d", &n) != 1){
                    printf("Entrada invalida\n");
                    return;
                }
                break;
            default:
                printf("Opcao invalida\n");
                continue;
        }

        int tipo;

        do{
            printf("\n1. Crescente\n2. Decrescente\n3. Aleatorio\n0. Voltar\n");
            scanf("%d", &tipo);

            if (tipo == 0){
                break;
            }
            if (tipo != 1 && tipo != 2 && tipo != 3){
                printf("Opcao invalida\n");
                continue;
            }

            executarAlgoritmo(algoritmo, n, tipo);
        } while (1);
    } while (1);
}

// Função que cria e preenche o vetor, roda o algoritmo e mostra resultados
void executarAlgoritmo(int algoritmo, int n, int tipo){
    // Criação do vetor
    int *V = malloc(n*sizeof(int));

    if (V == NULL){
        printf("Erro de memoria\n");
        return;
    }

    // Preenchendo o vetor
    if (tipo == 1){
        // Então é vetor crescente
        vetorCrescente(V, n);
    } else if (tipo == 2){
        // Então é vetor decrescente
        vetorDecrescente(V, n);
    } else{
        // Então é vetor aleatório
        vetorAleatorio(V, n);
    }

    int comparacoes = 0;
    int trocas = 0;

    clock_t inicio, fim;
    inicio = clock();

    // Rodando o algoritmo de ordenação escolhido
    if (algoritmo == 1){
        // imprimir(V, n);
        printf("Executando algoritmo do Bubble Sort...\n");
        bubbleSort(V, n, &comparacoes, &trocas);
        // imprimir(V, n);
    } else if(algoritmo == 2){
        // imprimir(V, n);
        printf("Executando algoritmo do Selection Sort...\n");
        selectionSort(V, n, &comparacoes, &trocas);
        // imprimir(V, n);
    } else if (algoritmo == 3){
        // imprimir(V, n);
        printf("Executando algoritmo do Merge Sort...\n");
        mergeSort(V, 0, n-1, &comparacoes);
        // imprimir(V, n);
    }
    
    fim = clock();
    double tempo = (double)(fim-inicio) / CLOCKS_PER_SEC;

    // Tela final de resultados
    printf("\n================ RESULTADO ================\n");
    printf("Tamanho: %d\n", n);
    printf("Tempo: %.6f segundos\n", tempo);
    printf("Comparacoes: %d\n", comparacoes);
    printf("Trocas: %d\n", trocas);
    printf("==========================================\n");    

    free(V);
}

// Aplicação do algoritmo de busca sequencial
int buscaSequencial(int V[], int tamanho, int valor, int *comp){
    for (int i = 0; i < tamanho; i++){
        (*comp)++;

        if (V[i] == valor){
            return i;
        }
    }
    return -1;
}

// Aplicação do algoritmo de busca binária
int buscaBinaria(int V[], int tamanho, int valor, int *comp){
    int inicio = 0;
    int fim = tamanho-1;
    while (inicio <= fim){
        int meio = (inicio+fim)/2;

        (*comp)++;

        if (V[meio] == valor){
            return meio;
        } 
        
        (*comp)++;

        if (valor < V[meio]){
            fim = meio-1;
        } else{
            inicio = meio+1;
        }
    }
    return -1;
}

// Função de menu: só escolhe o algoritmo
void menuBusca(){
    int opcao;

    do{
        printf("========================================\n");
        printf("        ALGORITMOS DE BUSCA\n");
        printf("========================================\n");
        printf("\n1. Busca Sequencial\n2. Busca Binaria\n0. Voltar\n");
        printf("\nEscolha uma opcao: ");
        scanf("%d", &opcao);

        switch(opcao){
            case 1:
                configurarBusca(1);
                break;

            case 2:
                configurarBusca(2);
                break;

            case 0:
                printf("Voltando...\n");
                break;

            default:
                printf("Opcao invalida\n");
                break;
        }

    } while(opcao != 0);
}

// Função de menu: define tamanho e tipo do vetor
void configurarBusca(int tipoBusca){
    int tamanho;

    do{
        printf("\n1. 100\n2. 1000\n3. 10000\n4. Manual\n0. Voltar\n");
        printf("Escolha o tamanho: ");
        scanf("%d", &tamanho);

        if (tamanho == 0) return;

        int n;

        switch(tamanho){
            case 1:
                n = 100; 
                break;
            case 2: 
                n = 1000; 
                break;
            case 3: 
                n = 10000; 
                break;
            case 4:
                printf("Digite o tamanho: ");
                scanf("%d", &n);
                break;
            default:
                printf("Opcao invalida\n");
                continue;
        }

        int tipo;

        do{
            printf("\n1. Crescente\n2. Decrescente\n3. Aleatorio\n0. Voltar\n");
            printf("Escolha o tipo do vetor: ");
            scanf("%d", &tipo);

            if (tipo == 0) break;

            if (tipo != 1 && tipo != 2 && tipo != 3){
                printf("Opcao invalida\n");
                continue;
            }

            int valor;
            printf("Digite o valor a ser buscado: ");
            scanf("%d", &valor);

            executarBusca(tipoBusca, n, tipo, valor);

        } while(1);

    } while(1);
}

// Função que cria e preenche o vetor, roda o algoritmo e mostra resultados
void executarBusca(int tipoBusca, int n, int tipo, int valor){
    int *V = malloc(n * sizeof(int));
    int comparacoes = 0;

    if (V == NULL){
        printf("Erro de memoria\n");
        return;
    }

    // Preenche o vetor
    if (tipo == 1){
        vetorCrescente(V, n);
    } else if (tipo == 2){
        vetorDecrescente(V, n);
    } else{
        vetorAleatorio(V, n);
    }

    // Garante ordenação, já que busca binária precisa de vetor ordenado
    if (tipoBusca == 2){
        mergeSort(V, 0, n-1, &(int){0}); 
    }

    clock_t inicio = clock();

    int pos = -1;

    if (tipoBusca == 1){
        pos = buscaSequencial(V, n, valor, &comparacoes);
    } else{
        pos = buscaBinaria(V, n, valor, &comparacoes);
    }

    clock_t fim = clock();

    double tempo = (double)(fim - inicio) / CLOCKS_PER_SEC;

    printf("\n=========== RESULTADO BUSCA ===========\n");
    printf("Tamanho: %d\n", n);
    printf("Valor buscado: %d\n", valor);
    printf("Tempo: %.6f segundos\n", tempo);
    printf("Comparacoes: %d\n", comparacoes);

    if (pos != -1){
        printf("Encontrado na posicao: %d\n", pos);
    } else{
        printf("Nao encontrado\n");
    }

    printf("======================================\n");

    free(V);
}
