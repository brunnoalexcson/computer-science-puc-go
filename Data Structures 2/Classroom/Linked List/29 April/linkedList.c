/*
This code implements the basics of a linked list. 
*/

#include <stdio.h>
#include <stdlib.h>

typedef struct No{
    int dado;
    struct No* proximo;
    // No* proximo is the same as No *proximo
} No;

int main(){
    // Node creation
    No *n1 = malloc(sizeof(No));
    No *n2 = malloc(sizeof(No));
    No *n3 = malloc(sizeof(No));

    // Allocation check
    if (n1 == NULL || n2 == NULL || n3 == NULL){
        printf("Erro de alocação.\n");
        return 1;
    }

    // Assigning values
    n1->dado = 10;
    n2->dado = 20;
    n3->dado = 30;
    
    n1->proximo = n2;
    n2->proximo = n3;
    n3->proximo = NULL;

    No* atual = n1;

    // Tranversal
    while (atual != NULL){
        printf("%d -> ", atual->dado);
        atual = atual->proximo;
    }

    printf("Null \n");

    // Memory deallocation
    atual = n1;
    while (atual != NULL){
        No* temp = atual;
        atual = atual->proximo;
        free(temp);
    }

    return 0;
}