package tp2.app;

public class EpassJovem extends PasseStandard implements TituloTransporte {
    public void carregar(double n){
        super.setSaldo(n);
    }

    public void pagarViagem(double n){
        if(super.getSaldo()<0){
            System.out.println("saldo indisponivel!");
        }

        else {
            super.pagarSaldo();
        }
    }

    public boolean checkValidade(){
        boolean n;
        if(super.getDataValida().compareTo(LocalDate.now()<0)){
            return n=true;
        }

        else{
            return n=false;
        }
    }
}
