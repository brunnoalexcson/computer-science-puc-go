/*
Course: Data Structures II
Student: Brunno Alexcson de Carvalho
Exercise 03: Fundamental Operations on Linked List
*/

#include <stdio.h>
#include <stdlib.h>
#include <limits.h> // To use INT_MIN

typedef struct No{
    int matricula;
    struct No* proximo;
} No;

int main(){
    // Node creation
    No *n1 = malloc(sizeof(No));
    No *n2 = malloc(sizeof(No));
    No *n3 = malloc(sizeof(No));

    // Allocation check
    if (n1 == NULL || n2 == NULL || n3 == NULL){
        printf("Allocation error.\n");
        return 1;
    }

    // Assigning values
    n1->matricula = 15;
    n1->proximo = n2;

    n2->matricula = 30;
    n2->proximo = n3;

    n3->matricula = 45;
    n3->proximo = NULL;

    // a) Insert a new element with value 60 at the end of the list
    No *n4 = malloc(sizeof(No));
    if (n4 == NULL){
        printf("Allocation error.\n");
        return 1;
    }

    n3->proximo = n4;
    n4->matricula = 60;
    n4->proximo = NULL;

    // b) Insert a new element with value 5 at the beginning of the list
    No *n5 = malloc(sizeof(No));
    if (n5 == NULL){
        printf("Allocation error.\n");
        return 1;
    }

    n5->matricula = 5;
    n5->proximo = n1;

    // Traversal
    No* atual = n5;
    int qtd = 0;
    int maior = INT_MIN;

    while (atual != NULL){
        printf("%d -> ", atual->matricula);
        if (atual->matricula >= maior) maior = atual->matricula;
        atual = atual->proximo;
        qtd++;
    }
    printf("Null.\n");

    printf("Number of nodes after all insertions: %d\n", qtd);
    printf("Highest value stored in the list: %d\n", maior);

    // Freeing memory
    atual = n5;
    while (atual != NULL){
        No *temp = atual;
        atual = atual->proximo;
        free(temp);
    }

    return 0;
}