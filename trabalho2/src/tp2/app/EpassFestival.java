package tp2.app;

public class EpassFestival {
    private double saldoCartaopgmt;
    private String nomeEvento;

    EpassFestival(double saldo,String evento){
        setNomeEvento(evento);
        setSaldoCartaopgmt(saldo);
    }

    EpassFestival(String evento){
        SetNomeEvento(evento);
    }

    EpassFestival(EpassFestival outro){
        setsaldoCartaopgmt(outro.getSaldo());
        setNomeEvento(outro.getNomeEvento());
    }
}
