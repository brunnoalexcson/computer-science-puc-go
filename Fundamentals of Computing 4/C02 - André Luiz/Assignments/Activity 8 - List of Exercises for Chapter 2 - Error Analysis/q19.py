def decimal_para_octal(n):
    if n == 0:
        return "0"

    octal = ""

    while n > 0:
        resto = n % 8
        octal += str(resto)
        n //= 8

    return octal[::-1]

def decimal_para_hexadecimal(n):
    if n == 0:
        return "0"

    hex_chars = "0123456789ABCDEF"
    hexa = ""

    while n > 0:
        resto = n % 16
        hexa += hex_chars[resto]
        n //= 16

    return hexa[::-1]

def binario_para_octal(b):
    while len(b) % 3 != 0:
        b = "0" + b

    octal = ""

    for i in range(0, len(b), 3):
        grupo = b[i:i+3]
        decimal = int(grupo[0])*4 + int(grupo[1])*2 + int(grupo[2])
        octal += str(decimal)

    return octal

def binario_para_hexadecimal(b):
    while len(b) % 4 != 0:
        b = "0" + b

    hex_chars = "0123456789ABCDEF"
    hexa = ""

    for i in range(0, len(b), 4):
        grupo = b[i:i+4]
        decimal = (int(grupo[0])*8 +
                   int(grupo[1])*4 +
                   int(grupo[2])*2 +
                   int(grupo[3]))
        hexa += hex_chars[decimal]

    return hexa

print("="*50)
print("Digite um número decimal:")
n = int(input())

print("Octal:", decimal_para_octal(n))
print("Hexadecimal:", decimal_para_hexadecimal(n))

print("="*50)
print("Digite um número binário:")
b = input()

print("Octal:", binario_para_octal(b))
print("Hexadecimal:", binario_para_hexadecimal(b))
