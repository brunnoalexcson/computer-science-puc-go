import math

def exponencial(x, termos=20):
    soma = 0

    for k in range(termos):
        termo = (x ** k) / math.factorial(k)
        soma += termo

    return soma


x = float(input("Digite o valor de x: "))

aprox = exponencial(x)

valor_real = math.exp(x)

erro = abs(valor_real - aprox)

print("\nValor aproximado =", aprox)
print("Valor real =", valor_real)
print("Erro absoluto =", erro)