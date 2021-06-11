package tp2.app;

public class EpassTeridade {
    private LocalDate HoraIni;

    public LocalDate getHoraIni() {
        return HoraIni;
    }

    public void setHoraIni(LocalDate HoraIni){
        this.HoraIni=HoraIni;
    }

    protected void clone(PasseStandard pass){

    }

    public void carregar(double n){

    }

    public void pagarViagem(double n){

    }

    public boolean checkValidade(){
        boolean b=true;
        return b;
    }

}
