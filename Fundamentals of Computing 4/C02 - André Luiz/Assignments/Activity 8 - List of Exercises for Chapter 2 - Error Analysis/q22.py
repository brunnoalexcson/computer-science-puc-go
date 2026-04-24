import math

def raiz_babilonica(a, x0=1.0, tol=1e-10, max_iter=100):
    x = x0

    for i in range(max_iter):
        x_novo = (x + a/x) / 2

        # erro absoluto entre iterações
        erro = abs(x_novo - x)

        if erro < tol:
            break

        x = x_novo

    return x_novo, erro, i+1

a = float(input("Digite um número positivo: "))

aprox, erro, iteracoes = raiz_babilonica(a)

valor_real = math.sqrt(a)

erro_absoluto = abs(valor_real - aprox)

print("\nRaiz aproximada =", aprox)
print("Raiz real =", valor_real)
print("Erro absoluto =", erro_absoluto)
print("Iterações =", iteracoes)