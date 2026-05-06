#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define SIZE 5

int stack[SIZE];
int top = -1;

bool isEmpty();
void push(int value);
void pop();
int peek();

int main(){
    if (isEmpty()){
        printf("Stack is empty.\n");
    } else{
        printf("Stack is not empty.\n");
    }

    push(10);
    push(20);
    push(30);
    pop();

    printf("Stack has %d elements.\n", top+1);
    printf("Stack top: %d\n", peek());

    return 0;
}

bool isEmpty(){
    return top < 0;
}

void push(int value){
    if (top < SIZE - 1){
        top++;
        stack[top] = value;
    } else{
        printf("Stack is full.\n");
    }
}

void pop(){
    if (!isEmpty()){
        top--;
    } else{
        printf("Stack is empty.\n");
    }
}

int peek(){
    if (!isEmpty()){
        return stack[top];
    } else{
        printf("Stack is empty.\n");
        return -1;
    }
}