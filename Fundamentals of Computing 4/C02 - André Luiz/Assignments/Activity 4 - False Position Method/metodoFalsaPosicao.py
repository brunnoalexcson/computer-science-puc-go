import numpy as np
import matplotlib.pyplot as plt

def f(x):
    return 2 * np.log(3 - np.cos(x)) - 3 * (x ** x) + 5 * np.sin(x)

def falsa_posicao(x1, x2, TOL, itermax):
    if f(x1) * f(x2) > 0:
        print("Nenhuma raiz encontrada no intervalo fornecido.")
        return None

    i = 1
    xk = x2 - f(x2) * (x1 - x2) / (f(x1) - f(x2))
    ERRO = np.abs(f(xk))

    print("\n" * 2)
    print("Método da Falsa Posição")
    print("*" * 80)
    print(f"{'No.':>3} {'AN':>12} {'BN':>12} {'RAIZ':>12} {'|F(X)|':>12} {'ERRO':>12}")
    print("*" * 80)
    print(f"{i:3d} {x1:12.6f} {x2:12.6f} {xk:12.6f} {abs(f(xk)):12.6f} {ERRO:12.6f}")

    while ERRO >= TOL and i < itermax:
        if f(x1) * f(xk) < 0:
            x2 = xk
        else:
            x1 = xk

        xk_old = xk
        xk = x2 - f(x2) * (x1 - x2) / (f(x1) - f(x2))
        i += 1

        ERRO = abs(xk - xk_old)

        print(f"{i:3d} {x1:12.6f} {x2:12.6f} {xk:12.6f} {abs(f(xk)):12.6f} {ERRO:12.6f}")

    return [xk, ERRO, i]


# Parâmetros iniciais
x1 = 1.0
x2 = 2.0
TOL = 0.00001
itermax = 10

# Gráfico
x_vals = np.linspace(x1, x2, 400)
plt.plot(x_vals, f(x_vals), label='f(x)')
plt.axhline(0, linewidth=0.8)
plt.xlabel('x')
plt.ylabel('f(x)')
plt.title('Função f(x) = x^2 - 3')
plt.grid(True)
plt.legend()
plt.show()

# Execução
res = falsa_posicao(x1, x2, TOL, itermax)

if res is not None:
    print("*" * 80)
    print("Resultados:")
    print(f"{'Valor da Raiz:':<25} {res[0]:<12.6f}")
    print(f"{'Erro Aproximado:':<25} {res[1]:<12.6f}")
    print(f"{'Número de Iterações:':<25} {res[2]:<12d}")
    print(f"{'f(xk) =':<25} {f(res[0]):<12.6f}")