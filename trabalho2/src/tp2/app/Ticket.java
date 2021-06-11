package tp2.app;

public class Ticket {
    String nome;
    private String n;
    private LocalDate data;

    public Ticket(String nome,String n,LocalDate data){
        setData(data);
        setNumero(n);
    }

    public String getNumero(){
        return n;
    }

    public void setNumero(String n){
        this.n=n;
    }

    public  LocalDate getDate(){
        return data;
    }

    public void setData(LocalDate data){
        this.data=data;
    }
}
