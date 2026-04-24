# Crie um código em tecnologia Python para converter um número decimal qualquer em ponto flutuante
# float() em binário com precisão dada. Observação: O número pode ser por exemplo, 0, 54 ou 13, 54.

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

def calcularBinarioMult(n):
    if n > 0.0:
        count = 0
        binario = ""
        while count < 5 and n > 0:
            n *= 2
            parte_inteira = int(n)
            if parte_inteira == 1:
                binario += "1"
                n -= 1
            else:
                binario += "0"
            count += 1
        return binario
    else:
        return "0"

print("="*50)
print("Digite uma opção: ")
print("1. Converter um número DECIMAL para BINÁRIO.")
print("2. Sair do programa.")
print("="*50)

op = int(input())

while op != 2:
    print("Digite o número DECIMAL: ")
    n = float(input())

    # Pegar a parte INTEIRA
    n_int = int(n)

    # Pegar a parte DECIMAL
    n_dec = n - n_int

    print(f"Valor original: {n}\nValor inteiro: {n_int}\nValor decimal: {n_dec}")
    print("\n")

    # Primeira parte: Converter a parte INTEIRA
    binario_int = calcularBinarioDiv(n_int)

    # Segunda parte: Converter a parte DECIMAL
    binario_dec = calcularBinarioMult(n_dec)

    print(f"O número DECIMAL {n} em BINÁRIO é: {binario_int},{binario_dec}")

    print("=" * 50)
    print("Digite uma opção: ")
    print("1. Converter um número DECIMAL para BINÁRIO")
    print("2. Sair do programa")
    print("=" * 50)

    op = int(input())

print("Programa encerrado.")
