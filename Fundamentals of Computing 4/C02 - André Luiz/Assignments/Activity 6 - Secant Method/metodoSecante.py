import numpy as np
import matplotlib.pyplot as plt


# =========================
# DEFINIÇÃO DAS FUNÇÕES
# =========================
def fA(x):
    return 2 * np.log(3 - np.cos(x)) - 3 ** x + 5 * np.sin(x)


def fB(x):
    return x ** 2 - 10 * np.log(x) - 5


def fC(x):
    return x ** 3 - np.exp(2 * x) + 3


def fD(x):
    return x + np.log10(x)


def fE(x):
    return 2 * x ** 3 + x ** 2 - 2


def fF(x):
    return np.sin(x) - np.log(x)


def fG(x):
    return np.exp(np.cos(x)) + x ** 3 - 3


# =========================
# MÉTODO DA SECANTE MODIFICADA
# =========================
def secante_modificada(f, x0, delta, TOL, itermax, nome):
    i = 1
    xk = x0
    ERRO = abs(f(xk))

    print("\n\n")
    print(f"Método da Secante Modificado - {nome}")
    print("*" * 90)
    print(f"{'i':>3} {'xk':>12} {'f(xk)':>12} {'f(xk+dx)':>12} {'ERRO':>12}")
    print("*" * 90)
    print(f"{i:3d} {xk:12.6f} {f(xk):12.6f} {f(xk + delta * xk):12.6f} {ERRO:12.6f}")

    while ERRO >= TOL and i < itermax:
        denom = f(xk + delta * xk) - f(xk)
        if denom == 0:
            print("Divisão por zero.")
            return None

        xk_old = xk
        xk = xk - f(xk) * (delta * xk) / denom
        i += 1
        ERRO = abs(xk - xk_old)

        print(f"{i:3d} {xk:12.6f} {f(xk):12.6f} {f(xk + delta * xk):12.6f} {ERRO:12.6f}")

    return [xk, ERRO, i]


# =========================
# FUNÇÃO PARA GERAR GRÁFICO
# =========================
def gerar_grafico(f, intervalo, nome_arquivo, titulo):
    x_vals = np.linspace(intervalo[0], intervalo[1], 400)
    y_vals = f(x_vals)

    plt.figure()
    plt.plot(x_vals, y_vals)
    plt.axhline(0)
    plt.title(titulo)
    plt.xlabel('x')
    plt.ylabel('f(x)')
    plt.grid()

    plt.savefig(nome_arquivo)
    plt.close()


# =========================
# EXECUÇÃO GERAL
# =========================

funcoes = [
    ("A", fA, (0.1, 2), 1.0),
    ("B", fB, (0.1, 5), 3.0),
    ("C", fC, (0, 2), 1.0),
    ("D", fD, (0.1, 2), 0.5),
    ("E", fE, (-2, 2), 0.5),
    ("F", fF, (0.1, np.pi), 2.0),
    ("G", fG, (-2, 2), 1.0),
]

delta = 0.001
TOL = 0.0001
itermax = 50

for nome, func, intervalo, x0 in funcoes:

    # Gera gráfico
    gerar_grafico(func, intervalo, f"Alternativa{nome}.png", f"Função {nome}")

    # Executa método
    res = secante_modificada(func, x0, delta, TOL, itermax, f"Alternativa {nome}")

    # Resultado final
    if res is not None:
        print("*" * 80)
        print(f"Resultados - Alternativa {nome}")
        print(f"{'Raiz:':<20} {res[0]:<12.6f}")
        print(f"{'Erro:':<20} {res[1]:<12.6f}")
        print(f"{'Iterações:':<20} {res[2]:<12d}")
        print(f"{'f(xk):':<20} {func(res[0]):<12.6f}")