import decimal

num_decimal = 0.1
bits_64 = decimal.Decimal(num_decimal)

print(f"Número original (float 64-bit): {num_decimal}")
print(f"Valor exato armazenado na memória: {bits_64}")

def float_to_bin(f):
    return f.hex()

print(f"Representação Hexadecimal (IEEE 754): {float_to_bin(num_decimal)}")

soma_sucessiva = 0.0
for _ in range(10):
    soma_sucessiva += 0.1

erro = abs(1.0 - soma_sucessiva)

print("-" * 30)
print(f"Soma de 0.1 dez vezes: {soma_sucessiva}")
print(f"Erro acumulado: {erro}")

def decimal_para_binario_frac(n, iteracoes=20):
    binario = "0."
    for _ in range(iteracoes):
        n *= 2
        bit = int(n)
        binario += str(bit)
        n -= bit
    return binario + "..."

print(f"Conversão manual (primeiros 20 bits): {decimal_para_binario_frac(0.1)}")