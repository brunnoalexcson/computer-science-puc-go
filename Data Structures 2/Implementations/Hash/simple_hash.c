/*
This code implements a simple hash table without collision handling.
If two values map to the same index, the previous value will be overwritten.
*/

#include <stdio.h>

#define TAM 10          // Size of the hash table
#define VAZIO -1        // Value used to represent an empty slot

int tabela[TAM];        // Hash table array

// Hash function: returns the index based on modulo operation
int hash(int chave){
    return chave % TAM;
}

// Initializes the hash table by setting all positions to VAZIO
void inicializar(){
    for (int i = 0; i < TAM; i++){
        tabela[i] = VAZIO;
    }
}

// Inserts a value into the hash table
// Note: No collision handling — overwrites existing value if collision occurs
void inserir(int valor){
    int indice = hash(valor);
    tabela[indice] = valor;
}

// Displays all elements in the hash table
void mostrar(){
    for (int i = 0; i < TAM; i++){
        printf("%d\n", tabela[i]);
    }
}

int main(){
    inicializar();   // Initialize the table

    // Insert some values
    inserir(10);
    inserir(15);
    inserir(39);
    inserir(7);

    // Print the table contents
    mostrar();

    return 0;
}