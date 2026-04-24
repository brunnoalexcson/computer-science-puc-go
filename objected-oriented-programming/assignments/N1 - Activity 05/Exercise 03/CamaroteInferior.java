public class CamaroteInferior {
    private String locIngresso;
    private Normal ingressoNormal;

    public CamaroteInferior(String locIngresso, Normal ingressoNormal) {
        this.locIngresso = locIngresso;
        this.ingressoNormal = ingressoNormal;
    }

    public String getLocIngresso() {
        return locIngresso;
    }

    public void setLocIngresso(String locIngresso) {
        this.locIngresso = locIngresso;
    }

    @Override
    public String toString(){
        return "Tipo do Ingresso: Normal\nLocalização da Vaga no Camarote Inferior: "+locIngresso+
                "\nValor do Ingresso: "+ingressoNormal.getValor()+"\n";
    }

}
