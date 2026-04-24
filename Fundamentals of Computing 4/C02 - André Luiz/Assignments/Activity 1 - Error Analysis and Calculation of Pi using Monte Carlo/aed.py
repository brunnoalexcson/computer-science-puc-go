import random
import math
import matplotlib.pyplot as plt

def valor_pi(N):
    nacertos = 0

    # Listas para armazenar evolução (para utilizar na geração de gráficos)
    lista_i = []
    lista_pi = []
    lista_erro_abs = []
    lista_erro_rel = []
    lista_erro_rel_perc = []

    pi_anterior = 0

    for i in range(1, N+1):
        # Gera ponto aleatório no quadrado [x,y]
        x = random.random()
        y = random.random()

        # Verifica se está dentro do quarto de círculo
        if x*x + y*y <= 1:
            nacertos += 1

        # Estimativa atual de pi
        pi_atual = 4 * nacertos / i

        # Só calcula erro depois da segunda iteração
        if i > 1:
            erro_abs = abs(pi_atual - pi_anterior)
            erro_rel = erro_abs / abs(pi_atual)
            erro_rel_perc = erro_rel * 100
        else:
            erro_abs = 0
            erro_rel = 0
            erro_rel_perc = 0

        # Armazenar esses valores nas listas definidas
        lista_i.append(i)
        lista_pi.append(pi_atual)
        lista_erro_abs.append(erro_abs)
        lista_erro_rel.append(erro_rel)
        lista_erro_rel_perc.append(erro_rel_perc)

        pi_anterior = pi_atual

    return lista_i, lista_pi, lista_erro_abs, lista_erro_rel, lista_erro_rel_perc

# Programa Principal
N = 10000 # Esse N representa o número de pontos que serão gerados para o cálculo da aproximação de pi. Quanto maior, mais próximo será.

lista_i, lista_pi, lista_erro_abs, lista_erro_rel, lista_erro_rel_perc = valor_pi(N)

print("="*65)
print(f"{'Estudo de Caso 1: Cálculo de pi e Análise de Erro':^65}")
print("="*65)

print(f"{'Quantidade de pontos gerados':40} | {N:>15}")
print(f"{'Valor real de pi':40} | {math.pi:>15.10f}")
print(f"{'Valor aproximado de pi':40} | {lista_pi[-1]:>15.10f}")
print(f"{'Erro Absoluto':40} | {lista_erro_abs[-1]:>15.10f}")
print(f"{'Erro Relativo':40} | {lista_erro_rel[-1]:>15.10f}")
print(f"{'Erro Relativo Percentual':40} | {lista_erro_rel_perc[-1]:>15.10f}")

print("="*65)


# Gráfico para analisar o valor de pi_aprox em função do número de pontos
plt.figure()
plt.plot(lista_i, lista_pi)
plt.axhline(math.pi)
plt.title("Convergência do Método de Monte Carlo para π")
plt.xlabel("Número de pontos")
plt.ylabel("Estimativa de π")
plt.show()

# Gráfico do erro absoluto
plt.figure()
plt.plot(lista_i, lista_erro_abs)
plt.title("Erro Absoluto Iterativo")
plt.xlabel("Número de pontos")
plt.ylabel("Erro absoluto")
plt.show()

# ================================
# Visualização do quadrado e pontos
# ================================

# Gerar novamente os pontos para visualização
x_dentro = []
y_dentro = []
x_fora = []
y_fora = []

nacertos = 0

for i in range(N):
    x = random.random()
    y = random.random()

    if x*x + y*y <= 1:
        nacertos += 1
        x_dentro.append(x)
        y_dentro.append(y)
    else:
        x_fora.append(x)
        y_fora.append(y)

plt.figure()

# Pontos dentro do círculo
plt.scatter(x_dentro, y_dentro, s=10)

# Pontos fora do círculo
plt.scatter(x_fora, y_fora, s=10)

# Desenhar quarto de círculo
theta = [i * math.pi / 200 for i in range(201)]
x_circ = [math.cos(t) for t in theta]
y_circ = [math.sin(t) for t in theta]
plt.plot(x_circ, y_circ)

plt.xlim(0,1)
plt.ylim(0,1)
plt.gca().set_aspect('equal', adjustable='box')
plt.title("Visualização Geométrica do Método de Monte Carlo")
plt.xlabel("x")
plt.ylabel("y")

plt.show()

