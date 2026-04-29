/*
Course: Data Structures II
Student: Brunno Alexcson de Carvalho
Exercise 02: Hospital Service System
*/

#include <stdio.h>
#include <stdlib.h>

typedef struct No{
    int senha;
    struct No* proximo;
} No;

int main(){
    // Node creation
    No *n1 = malloc(sizeof(No));
    No *n2 = malloc(sizeof(No));
    No *n3 = malloc(sizeof(No));
    No *n4 = malloc(sizeof(No));
    No *n5 = malloc(sizeof(No));

    // Allocation check
    if (n1 == NULL || n2 == NULL || n3 == NULL || n4 == NULL || n5 == NULL){
        printf("Allocation error.\n");
        return 1;
    }

    // Assigning values
    n1->senha = 12;
    n1->proximo = n2;

    n2->senha = 18;
    n2->proximo = n3;

    n3->senha = 25;
    n3->proximo = n4;

    n4->senha = 31;
    n4->proximo = n5;

    n5->senha = 40;
    n5->proximo = NULL;

    // Traversal
    No* atual = n1;
    int qtd = 0, soma = 0;
    while (atual != NULL){
        printf("%d -> ", atual->senha);
        soma += atual->senha;
        atual = atual->proximo;
        qtd++;
    }
    printf("Null.\n");

    printf("Sum of all stored ticket numbers: %d\n", soma);
    printf("Total number of patients in the list: %d\n", qtd);

    // Freeing memory
    atual = n1;
    while (atual != NULL){
        No *temp = atual;
        atual = atual->proximo;
        free(temp);
    }

    return 0;
}