import numpy as np
import matplotlib.pyplot as plt

# =========================
# MÉTODO NEWTON-RAPHSON
# =========================
def newton(f, df, x0, TOL=1e-3, itermax=100):
    i = 1
    xk = x0
    ERRO = abs(f(xk))

    print("\nMétodo de Newton-Raphson")
    print("*" * 80)
    print(f"{'i':>3} {'xk':>12} {'f(xk)':>12} {'f’(xk)':>12} {'ERRO':>12}")
    print("*" * 80)
    print(f"{i:3d} {xk:12.6f} {f(xk):12.6f} {df(xk):12.6f} {ERRO:12.6f}")

    while ERRO >= TOL and i < itermax:
        if df(xk) == 0:
            print("Derivada nula. Método falhou.")
            return None

        xk_old = xk
        xk = xk - f(xk) / df(xk)
        i += 1
        ERRO = abs(xk - xk_old)

        print(f"{i:3d} {xk:12.6f} {f(xk):12.6f} {df(xk):12.6f} {ERRO:12.6f}")

    return xk, ERRO, i


# =========================
# FUNÇÕES + DERIVADAS
# =========================
def fA(x): return 2*np.log(3 - np.cos(x)) - 3*(x**x) + 5*np.sin(x)
def dfA(x): return (2*np.sin(x)/(3 - np.cos(x))) - 3*(x**x)*(np.log(x)+1) + 5*np.cos(x)

def fB(x): return x**2 - 10*np.log(x) - 5
def dfB(x): return 2*x - 10/x

def fC(x): return x**3 - np.exp(2*x) + 3
def dfC(x): return 3*x**2 - 2*np.exp(2*x)

def fD(x): return x + np.log(x)
def dfD(x): return 1 + 1/x

def fE(x): return 2*x**3 + x**2 - 2
def dfE(x): return 6*x**2 + 2*x

def fF(x): return np.sin(x) - np.log(x)
def dfF(x): return np.cos(x) - 1/x

def fG(x): return np.exp(np.cos(x)) + x**3 - 3
def dfG(x): return -np.exp(np.cos(x))*np.sin(x) + 3*x**2


# =========================
# PROBLEMAS (x0 bom)
# =========================
problemas = [
    (fA, dfA, 0.2, "A"),
    (fB, dfB, 4.5, "B"),
    (fC, dfC, 0.5, "C"),
    (fD, dfD, 0.5, "D"),
    (fE, dfE, 0.8, "E"),
    (fF, dfF, 2.0, "F"),
    (fG, dfG, 1.1, "G"),
]


# =========================
# EXECUÇÃO AUTOMÁTICA
# =========================
for f, df, x0, nome in problemas:
    print(f"\n\n===== Alternativa {nome} =====")

    res = newton(f, df, x0)

    if res is not None:
        raiz, erro, it = res

        print("*" * 80)
        print("Resultados:")
        print(f"{'Valor da Raiz:':<25} {raiz:<12.6f}")
        print(f"{'Erro Aproximado:':<25} {erro:<12.6f}")
        print(f"{'Número de Iterações:':<25} {it:<12d}")
        print(f"{'f(xk):':<25} {f(raiz):<12.6f}")

        # ===== GRÁFICO =====
        x_vals = np.linspace(x0-1, x0+1, 400)

        plt.figure()
        plt.plot(x_vals, f(x_vals))
        plt.axhline(0)
        plt.title(f"Alternativa {nome}")
        plt.grid()

        filename = (f"Alternativa{nome}.png")
        plt.savefig(filename)
        plt.close()
