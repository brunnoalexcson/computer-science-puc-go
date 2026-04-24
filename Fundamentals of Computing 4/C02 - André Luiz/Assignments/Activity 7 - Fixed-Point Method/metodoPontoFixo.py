import numpy as np
import matplotlib.pyplot as plt

# -----------------------------
# Funções f(x) e g(x) ajustadas
# -----------------------------

# Alternativa a
def f_a(x):
    return 2*np.log(3 - np.cos(x)) - 3*x + 5*np.sin(x)

def g_a(x):
    # x = (2*ln(3-cos(x)) + 5*sin(x))/3
    return (2*np.log(3 - np.cos(x)) + 5*np.sin(x))/3

# Alternativa b
def f_b(x):
    return x**2 - 10*np.log(x) - 5

def g_b(x):
    return np.sqrt(10*np.log(x) + 5)

# Alternativa c
def f_c(x):
    return x**3 - np.exp(2*x) + 3

def g_c(x):
    # Aproximação para ponto fixo: x = (exp(2x)+3)^(1/3)
    # Mas para evitar overflow usamos: x_{n+1} = (3 + exp(2*x_n))/3 ** 1/3
    return (3 + np.exp(2*x)/1000)**(1/3)  # escala para evitar overflow

# Alternativa d
def f_d(x):
    return x + np.log(x)

def g_d(x):
    # x = -ln(x) pode gerar NaN se x ≤ 0, então limitamos x > 0
    x_new = -np.log(x)
    return np.maximum(x_new, 1e-6)

# Alternativa e
def f_e(x):
    return 2*x**3 + x**2 - 2

def g_e(x):
    # x = ((2 - x^2)/2)^(1/3), limitação para x real
    return np.cbrt((2 - x**2)/2)

# Alternativa f
def f_f(x):
    return np.sin(x) - np.log(x)

def g_f(x):
    # x = exp(sin(x))
    return np.exp(np.sin(x))

# Alternativa g
def f_g(x):
    return np.exp(np.cos(x)) + x**3 - 3

def g_g(x):
    # x = (3 - exp(cos(x)))^(1/3)
    temp = 3 - np.exp(np.cos(x))
    # evitar raiz de negativo
    temp = np.where(temp < 0, 0, temp)
    return np.cbrt(temp)

# -----------------------------
# Método do Ponto Fixo
# -----------------------------
def ponto_fixo(f, g, x0, TOL=1e-3, itermax=50):
    i = 1
    xk = x0
    ERRO = np.abs(f(xk))

    print("\nMétodo do Ponto Fixo")
    print("*" * 80)
    print(f"{'i':>3} {'xk':>12} {'f(xk)':>12} {'g(xk)':>12} {'ERRO':>12}")
    print("*" * 80)
    print(f"{i:3d} {xk:12.6f} {f(xk):12.6f} {g(xk):12.6f} {ERRO:12.6f}")

    while ERRO >= TOL and i < itermax:
        xk_old = xk
        xk = g(xk)
        i += 1
        ERRO = abs(xk - xk_old)
        if np.isnan(xk) or np.isinf(xk):
            print("Erro: g(x) retornou NaN ou infinito. Interrompendo iteração.")
            break
        print(f"{i:3d} {xk:12.6f} {f(xk):12.6f} {g(xk):12.6f} {ERRO:12.6f}")

    return [xk, ERRO, i]

# -----------------------------
# Lista de alternativas com chutes iniciais e intervalos
# -----------------------------
alternativas = [
    ("AlternativaA", f_a, g_a, 1.0, (0,2)),
    ("AlternativaB", f_b, g_b, 2.0, (0.5,5)),
    ("AlternativaC", f_c, g_c, 0.5, (0,2)),
    ("AlternativaD", f_d, g_d, 0.5, (0.1,2)),
    ("AlternativaE", f_e, g_e, 1.0, (0,2)),
    ("AlternativaF", f_f, g_f, 2.0, (0.1, np.pi)),
    ("AlternativaG", f_g, g_g, 1.0, (0,2))
]

TOL = 1e-3
itermax = 50

# -----------------------------
# Execução para todas alternativas
# -----------------------------
for nome, f, g, x0, intervalo in alternativas:
    # Gráfico
    x_vals = np.linspace(intervalo[0], intervalo[1], 400)
    plt.figure()
    plt.plot(x_vals, f(x_vals), label='f(x)')
    plt.axhline(0, color='black', linewidth=0.8)
    plt.xlabel('x')
    plt.ylabel('f(x)')
    plt.title(f'Função {nome}')
    plt.grid(True)
    plt.legend()
    plt.savefig(f'{nome}.png')
    plt.close()

    # Método do Ponto Fixo
    print("\n" + "="*80)
    print(f"Processando {nome}")
    res = ponto_fixo(f, g, x0, TOL, itermax)
    print("*" * 80)
    print("Resultados:")
    print(f"{'Valor da Raiz:':<25} {res[0]:<12.6f}")
    print(f"{'Erro Aproximado:':<25} {res[1]:<12.6f}")
    print(f"{'Número de Iterações:':<25} {res[2]:<12d}")
    print(f"{'f(xk) =':<25} {f(res[0]):<12.6f}")