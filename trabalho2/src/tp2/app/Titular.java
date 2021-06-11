package tp2.app;

public class Titular {
    private DocumentoID docID;
    private String nome;
    private LocalDate ddn;
    private String morada;
    private  String email;
    private int telemovel;

    public Titular(String codigoDoc,TipoDocumento tipo,DocumentoID docID,String nome,LocalDate ddn,String email){
        this.docID=docID;
        this.nome=nome;
        this.ddn=ddn;
        this.email=email;
        this.docID.setCodigoID((codigoDoc));
        this.docID.setTipo(tipo);
    }

    public Titular(DocumentoID docID,String nome,LocalDate ddn,String morada,String email,int telemovel){
        this.docID=docID;
        this.nome=nome;
        this.ddn=ddn;
        this.email=email;
        this.telemovel=telemovel;
    }

    public Titular(DocumentoID docID,String nome,LocalDate ddn,String email){
        super();
        this.docID=docID;
        this.nome=nome;
        this.ddn=ddn;
        this.email=email;
    }
}
