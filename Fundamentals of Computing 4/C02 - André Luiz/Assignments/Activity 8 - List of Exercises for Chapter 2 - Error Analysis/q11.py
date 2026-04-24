# Crie um código em tecnologia Python para converter um número inteiro qualquer int() em binário com
# precisão dada.

def calcularBinarioDiv(n):
    if (n > 1):
        binario = ""  # Será o vetor de caracteres para representar o binário

        copy = n  # Cópia de n para manipularmos sem afetar o valor original
        while copy > 0:
            if copy % 2 == 0:
                binario += "0"
            else:
                binario += "1"

            copy //= 2
        binario = binario[::-1]  # inverter
        return binario
    else:
        return "0"

print("="*50)
print("Digite uma opção: ")
print("1. Converter um número INTEIRO para BINÁRIO.")
print("2. Sair do programa.")
print("="*50)

op = int(input())


while op != 2:
    print("Digite o número INTEIRO: ")
    n = int(input())

    print(f"O número INTEIRO {n} em BINÁRIO é: {calcularBinarioDiv(n)}")

    print("=" * 50)
    print("Digite uma opção: ")
    print("1. Converter um número INTEIRO para BINÁRIO")
    print("2. Sair do programa")
    print("=" * 50)

    op = int(input())

print("Programa encerrado.")
