/*
This code implements a simple version of a linked list.
*/

#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
    int value;
    struct Node* next;
} Node;

int main(){
    // Node creation
    Node *n1 = malloc(sizeof(Node));
    Node *n2 = malloc(sizeof(Node));
    Node *n3 = malloc(sizeof(Node));
    Node *n4 = malloc(sizeof(Node));
    Node *n5 = malloc(sizeof(Node));

    // Allocation check
    if (n1 == NULL || n2 == NULL || n3 == NULL || n4 == NULL || n5 == NULL){
        printf("Allocation error.\n");
        return 1;
    }

    // Assigning values
    n1->value = 7;
    n1->next = n2;

    n2->value = 5;
    n2->next = n3;

    n3->value = 10;
    n3->next = n4;

    n4->value = 25;
    n4->next = n5;

    n5->value = 2;
    n5->next = NULL;

    // Traversal
    Node *current = n1;
    while (current != NULL){
        printf("%d -> ", current->value);
        current = current->next;
    }
    printf("NULL.");

    // Freeing memory
    current = n1;
    while (current != NULL){
        Node* temp = current;
        current = current->next;
        free(temp);
    }

    return 0;
}