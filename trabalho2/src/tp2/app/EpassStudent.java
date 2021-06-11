package tp2.app;
import java.time.LocalDate;
import java.util.ArrayList;

public class EpassStudent {
    private int ano;
    private String escola;
    private ArrayList<zona> zonas;

    public EpassStudent(int ano,String escola){
        this.ano=ano;
        this.escola=escola;
    }

    public EpassStudent(EpassStudent outro){
        this.ano= outro.getAno();
        this.escola=outro.escola;
        this.zonas=outro.getZonas();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public ArrayList<zona> getZonas() {
        return zonas;
    }

    public void addZona(String nome){

    };

    public void addZona(zona zonaViagem){

    };

    public void carregar(double n){

    }

    public void pagarViagem(double n){

    }

    public boolean checkValidade(){
        boolean b= true;
        return b;
    }

    public boolean passarSaldo(double PassStandard){
        boolean b= true;
        return b;
    }

}
