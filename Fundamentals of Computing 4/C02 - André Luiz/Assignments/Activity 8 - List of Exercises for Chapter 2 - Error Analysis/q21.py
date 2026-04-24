import math

# função para calcular seno usando série de Maclaurin
def seno(x, termos=10):
    soma = 0
    for k in range(termos):
        termo = ((-1)**k) * (x**(2*k+1)) / math.factorial(2*k+1)
        soma += termo
    return soma


# função para calcular cosseno usando série de Maclaurin
def cosseno(x, termos=10):
    soma = 0
    for k in range(termos):
        termo = ((-1)**k) * (x**(2*k)) / math.factorial(2*k)
        soma += termo
    return soma


# entrada em graus
graus = float(input("Digite o ângulo em graus: "))

# conversão para radianos
x = math.radians(graus)

# cálculo
sen = seno(x)
cos = cosseno(x)

print("sen(", graus, ") ≈", sen)
print("cos(", graus, ") ≈", cos)

# comparação com a biblioteca math
print("\nValor real (math.sin):", math.sin(x))
print("Valor real (math.cos):", math.cos(x))