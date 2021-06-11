package tp2.app;

public class EpassTurista {
    Duracao duracao;

    EpassTurista(Duracao duracao){
        this.duracao=duracao;}

    EpassTurista(EpassTurista turista){
        this.duracao= turista.duracao;}

    public boolean pagar(double valor){
        boolean pv= true;
        return pv; }

    public void creditar(double valor){

    }

    public void carregar(double n){}
    public void pagarViagem(double n){}
    public boolean checkValidade(){
        boolean b= true;
        return b;

    }

    public boolean passarSaldo(double PassStandard){
        boolean b= true;
        return b;
    }

}
