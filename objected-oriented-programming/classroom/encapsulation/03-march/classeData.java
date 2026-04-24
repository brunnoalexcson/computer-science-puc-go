public class classeData {
    private int dia;
    private int mes;
    private int ano;

    // Primeiro Construtor
    public classeData(){
        dia = 1;
        mes = 1;
        ano = 1900;
    }

    // Segundo Construtor
    public classeData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean verificaData(){
        return checarAno() && checarMes() && checarDia();
    }

    private boolean checarDia(){
        if (dia > 0 && dia < 29)
            return true;
        else if (dia == 29 && anoBissexto())
            return true;
        else if (dia == 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
            return true;
        else if (dia == 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))
            return true;

        return false;
    }

    private boolean checarMes(){
        if (mes < 1 || mes > 12)
            return false;
        else
            return true;
    }

    private boolean checarAno(){
        if (ano < 0 || ano > 2026)
            return false;
        else
            return true;
    }

    private boolean anoBissexto(){
        if (ano % 4 == 0 && ano % 100 != 0)
            return true;
        else if (ano % 400 == 0)
            return true;
        else
            return false;
    }
}