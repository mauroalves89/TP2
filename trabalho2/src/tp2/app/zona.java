package tp2.app;

public class zona {
    private int id;
    private String nome;

    public zona(String nome){
        this.nome=nome;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getNome(){
        return nome;
    }
}
