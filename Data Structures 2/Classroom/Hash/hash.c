#include <stdio.h>

#define TAM 10

int tabela[TAM];

int hash(int chave){
    return chave % TAM;
}

void inicializar(){
    for (int i = 0; i < TAM; i++){
        tabela[i] = 0;
    }
}

void inserir(int valor){
    int indice = hash(valor);
    tabela[indice] = valor;
}

void mostrar(){
    for (int i = 0; i < TAM; i++){
        printf("%d\n", tabela[i]);
    }
}

int main(){
    inicializar();
    inserir(10);
    inserir(15);
    inserir(39);
    inserir(7);
    mostrar();


    return 0;
}