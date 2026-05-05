/*
This code implements a simple version of a doubly linked list
*/

#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
    int value;
    struct Node* next; 
    struct Node* prev; 
} Node;

int main(){
    // Node creation
    Node *n1 = malloc(sizeof(Node));
    Node *n2 = malloc(sizeof(Node));
    Node *n3 = malloc(sizeof(Node));
    Node *n4 = malloc(sizeof(Node));

    // Allocation check
    if (n1 == NULL || n2 == NULL || n3 == NULL || n4 == NULL){
        printf("Allocation error.\n");
        return 1;
    }

    // Assigning values
    n1->prev = NULL;
    n1->value = 7;
    n1->next = n2;

    n2->prev = n1;
    n2->value = 10; 
    n2->next = n3;

    n3->prev = n2;
    n3->value = 2;
    n3->next = n4;

    n4->prev = n3;
    n4->value = 9;
    n4->next = NULL;

    // Traversal in forward direction
    Node *current = n1;
    printf("NULL <- ");
    while (current != NULL){
        printf("%d <--> ", current->value);
        current = current->next;
    }
    printf("NULL.\n");

    // Traversal in backward direction
    current = n4;
    printf("<- NULL ");
    while (current != NULL){
        printf("%d <--> ", current->value);
        current = current->prev;
    }
    printf("NULL.\n");


    // Freeing memory
    current = n1;
    while (current != NULL){
        Node *temp = current;
        current = current->next;
        free(temp);
    }

    return 0;
}