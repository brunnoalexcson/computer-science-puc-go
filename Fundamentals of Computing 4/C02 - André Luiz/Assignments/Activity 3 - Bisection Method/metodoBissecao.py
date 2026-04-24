import numpy as np
import matplotlib.pyplot as plt

def f(x):
    return x**2 - 3


def bissecao(x1, x2, TOL, itermax):
    if f(x1) * f(x2) > 0:
        print("Nenhuma raiz encontrada no intervalo fornecido.")
        return None

    c = 1
    hp = (x1 + x2) / 2.0
    ERRO = abs(x2 - x1)

    print("\n" * 2)
    print("*" * 80)
    print("Método da Bissecção")
    print("*" * 80)
    print(f"{'No.':>3} {'AN':>12} {'BN':>12} {'RAIZ':>12} {'|F(X)|':>12} {'ERRO':>12}")
    print("*" * 80)

    print(f"{c:3d} {x1:12.6f} {x2:12.6f} {hp:12.6f} {abs(f(hp)):12.6f} {ERRO:12.6f}")

    while ERRO >= TOL and c < itermax:
        hp = (x1 + x2) / 2.0
        c += 1

        if f(hp) == 0:
            ERRO = 0
            return [hp, ERRO, c]

        elif f(x1) * f(hp) < 0:
            x2 = hp
        else:
            x1 = hp

        ERRO = abs(x2 - x1)

        print(f"{c:3d} {x1:12.6f} {x2:12.6f} {hp:12.6f} {abs(f(hp)):12.6f} {ERRO:12.6f}")

    return [hp, ERRO, c]


# ==========================
# ENTRADA DE DADOS
# ==========================
x1 = float(input("Entre com o limite inferior: "))
x2 = float(input("Entre com o limite superior: "))
TOL = float(input("Entre com a tolerância: "))
itermax = 20

# Estimativa de iterações
n_est = int(np.log((x2 - x1) / TOL) / np.log(2))

# ==========================
# GRÁFICO
# ==========================
x_vals = np.linspace(x1, x2, 400)
plt.plot(x_vals, f(x_vals), label='f(x)')
plt.axhline(0, linewidth=0.8)

plt.xlabel('x')
plt.ylabel('f(x)')
plt.title('Função f(x) = x^2 - 3')
plt.grid(True)
plt.legend()

plt.show()

# ==========================
# EXECUÇÃO
# ==========================
res = bissecao(x1, x2, TOL, itermax)

if res is not None:
    print("*" * 80)
    print("Resultados:")
    print(f"Valor da Raiz: {res[0]:.7f}")
    print(f"Erro Relativo: {res[1]:.7f}")
    print(f"Número de Iterações: {res[2]}")
    print(f"Número de iterações estimadas >= {n_est}")
    print(f"f(x) = {f(res[0]):.7f}")