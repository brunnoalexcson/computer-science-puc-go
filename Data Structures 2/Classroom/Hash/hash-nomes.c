#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define TAM 7

long long nomes[] = {
    7765827365,          // MARIA
    74798369,            // JOSE
    657865,              // ANA
    74796579,            // JOAO
    8069688279,          // PEDRO
    676582767983,        // CARLOS
    7685676583         // LUCAS
};

int main(){
    for (int i = 0; i < TAM; i++){
        long long numeroAtual = nomes[i];
        printf("O valor do numero atual eh: %lld\n", numeroAtual);

        char str[50];
        sprintf(str, "%lld", numeroAtual);
        // sprintf(destino, "formato", variaveis): Ao invés de mandar a saída para o console, o sprintf grava em um vetor de char

        printf("%s\n", str);

        int tamanho = strlen(str);

        for (int j = 0; j < tamanho-1; j += 2){
            char ascciStr[3];
            ascciStr[0] = str[j];
            ascciStr[1] = str[j+1];
            ascciStr[2] = '\0';

            int ascci = atoi(ascciStr);
            // atoi() é uma função da biblioteca <stdlib.h> que converte uma string para um inteiro
            printf("%c", ascci);
        }
        printf("\n");

    }

    return 0;
}