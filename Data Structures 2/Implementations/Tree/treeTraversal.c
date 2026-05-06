/*
This code implements common tree traversal algorithms: in-order, pre-order and post-order. 
Each traversal has its own characteristics.
*/

#include <stdio.h>
#include <stdlib.h>

// Node structure definition 
typedef struct Node{
    int value;
    struct Node* left;
    struct Node* right;
} Node;

// Node creation
Node* createNode(int value){
    Node* n = malloc(sizeof(Node));

    if (n == NULL){
        printf("Allocation error.\n");
        exit(1);
    }

    n->value = value;
    n->left = NULL;
    n->right = NULL;

    return n;
}

// Node insertion (BST - Binary Search Tree)
Node* insertionBST(Node* root, int value){
    if (root == NULL){
        return createNode(value);
    }

    if (value < root->value){
        root->left = insertionBST(root->left, value);
    } else if (value > root->value){
        root->right = insertionBST(root->right, value);
    } else{
        printf("Value %d already exists.\n", value);
    }

    return root;
}

// In-order traversal
void inOrder(Node* root){
    if (root != NULL){
        inOrder(root->left);
        printf("%d ", root->value);
        inOrder(root->right);
    }
}

// Pre-order traversal
void preOrder(Node* root){
    if (root != NULL){
        printf("%d ", root->value);
        preOrder(root->left);
        preOrder(root->right);
    }
}

// Post-order traversal
void postOrder(Node* root){
    if (root != NULL){
        postOrder(root->left);
        postOrder(root->right);
        printf("%d ", root->value);
    }
}

// Freeing memory
void freeTree(Node* root){
    if (root != NULL){
        freeTree(root->left);
        freeTree(root->right);
        free(root);
    }
}

int main(){
    Node *root = createNode(10);
    root = insertionBST(root, 15);
    root = insertionBST(root, 5);
    root = insertionBST(root, 5);
    root = insertionBST(root, 1);

    printf("In-order traversal:\n");
    inOrder(root);

    printf("\nPre-order traversal:\n");
    preOrder(root);

    printf("\nPost-order traversal:\n");
    postOrder(root);

    return 0;
}