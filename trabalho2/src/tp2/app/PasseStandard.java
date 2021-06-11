package tp2.app;

public abstract class PasseStandard extends Epass {
    private Titular titular;
    private int pontos;
    private int numeroViagens;
    private String chaveValida;

    public PasseStandard(String codigoDoc, TipoDocumento tipoDoc, LocalDate ddn, String nome, String email) {
        super();
        this.titular = new Titular(codigoDoc, tipoDoc, nome, ddn, email);
    }

    public PasseStandard(DocumentoID docID, LocalDate ddn, String nome, String email) {
        super();
        this.titular = new Titular(docID, nome, ddn, email);
    }

    public PasseStandard(DocumentoID docID, String nome, LocalDate ddn, String morada, String email, int telefone) {
        super();
        this.titular = new Titular(docID, nome, ddn, morada, email, telefone);

    }

    public PasseStandard(PasseStandard pass) {
        if (pass != null) {
            this.titular = pass.titular;
            this.pontos = pass.pontos;
            this.numeroViagens = pass.numeroViagens;
            this.chaveValida = pass.chaveValida;
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public int getPontos() {
        return pontos;
    }

    public String getChaveValida() {
        return chaveValida;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void setChaveValida(String chaveValida) {
        this.chaveValida = chaveValida;
    }

    public void pagarVigemComPontos(int pontosViagem) {
    }

}
