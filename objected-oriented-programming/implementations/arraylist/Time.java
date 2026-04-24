public class Time {
    private String nome;
    private String jogadorPrincipal;

    public Time(){
        nome = "";
        jogadorPrincipal = "";
    }

    public Time(String nome, String jogadorPrincipal){
        this.nome = nome;
        this.jogadorPrincipal = jogadorPrincipal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJogadorPrincipal() {
        return jogadorPrincipal;
    }

    public void setJogadorPrincipal(String jogadorPrincipal) {
        this.jogadorPrincipal = jogadorPrincipal;
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", jogadorPrincipal='" + jogadorPrincipal + '\'' +
                "}\n";
    }
}
