public class contaBancaria
{
    private double saldo;

    public contaBancaria() {
        this.saldo = 0;
    }

    public contaBancaria(double valor) {
        this.saldo = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito (double valor)
    {
        this.saldo+=valor;
    }

    public double retirada (double valor)
    {
        this.saldo-=valor;
        return this.saldo;
    }

    @Override
    public String toString() {
        return this.saldo + " ";
    }
}