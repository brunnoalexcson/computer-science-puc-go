public class CamaroteSuperior {
    private String locIngresso;
    private VIP ingressoVip;
    /* Na questão está assim: "d. Ou seja, normal é um atributo da classe (Associação)."
     Mas creio que isso está errado. O senhor abordou que camarote superior é apenas para ingressos VIP. Logo, VIP deve ser um atributo
     da classe CamaroteSuperior
    */

    public CamaroteSuperior(String locIngresso, VIP ingressoVip) {
        this.locIngresso = locIngresso;
        this.ingressoVip = ingressoVip;
    }

    public String getLocIngresso() {
        return locIngresso;
    }

    public void setLocIngresso(String locIngresso) {
        this.locIngresso = locIngresso;
    }

    @Override
    public String toString(){
        return "Tipo do Ingresso: VIP\nLocalização da Vaga no Camarote Superior: "+locIngresso+
                "\nValor do Ingresso: "+ingressoVip.getValor()+"\nValor do Adicional: "+ingressoVip.getValorAdicional()+
                "\nValor Total: "+ingressoVip.getvalorVip();
    }
}
