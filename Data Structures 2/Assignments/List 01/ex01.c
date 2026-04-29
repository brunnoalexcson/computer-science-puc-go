/*
Course: Data Structures II
Student: Brunno Alexcson de Carvalho
Exercise 01: Delivery System
*/

#include <stdio.h>
#include <stdlib.h>

typedef struct No{
    int codigoEntrega;
    struct No* proximo;
} No;

int main(){
    // Node creation
    No *n1 = malloc(sizeof(No));
    No *n2 = malloc(sizeof(No));
    No *n3 = malloc(sizeof(No));
    No *n4 = malloc(sizeof(No));

    // Allocation check
    if (n1 == NULL || n2 == NULL || n3 == NULL || n4 == NULL){
        printf("Allocation error.\n");
        return 1;
    }

    // Assigning values
    n1->codigoEntrega = 101;
    n1->proximo = n2;

    n2->codigoEntrega = 205;
    n2->proximo = n3;

    n3->codigoEntrega = 310;
    n3->proximo = n4;

    n4->codigoEntrega = 412;
    n4->proximo = NULL;

    // Traversal
    No* atual = n1;
    printf("Traversing the linked list with four elements:\n");
    while (atual != NULL){
        printf("%d -> ", atual->codigoEntrega);
        atual = atual->proximo;
    }
    printf("Null.\n");

    // Deallocating the first element from the list
    free(n1);
    printf("Traversing the linked list with three elements (the first one was removed):\n");

    atual = n2;
    while (atual != NULL){
        printf("%d -> ", atual->codigoEntrega);
        atual = atual->proximo;
    }
    printf("Null.\n");

    // Freeing memory
    atual = n2;
    while (atual != NULL){
        No *temp = atual;
        atual = atual->proximo;
        free(temp);
    }

    return 0;
}