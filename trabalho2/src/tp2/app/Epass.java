package tp2.app;

public class Epass {

    private long codigo;
    private double saldo;
    private double precoViagem;
    private LocalDate dataCarrega;
    private LocalDate dataValida;

    public Epass(double saldo, double precoViagem) {
        this.saldo = saldo;
        this.precoViagem = precoViagem;
    }

    public Epass(double precoViagem) {
        this.precoViagem = precoViagem;
    }

    public Epass(double saldo, double precoViagem, LocalDate dataCarrega, LocalDate dataValida) {
        this.saldo = saldo;
        this.precoViagem = precoViagem;
        this.dataCarrega = dataCarrega;
        this.dataValida = dataValida;
    }

    public Epass(double saldo, LocalDate dataCarrega) {
        this.saldo = saldo;
        this.dataCarrega = dataCarrega;
    }

    public long getCodigo() {
        return this.codigo;
    }

    public LocalDate getDataCarrega() {
        return this.dataCarrega;
    }

    public double getPrecoViagem() {
        return this.precoViagem;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public LocalDate getDataValida() {

        return this.dataValida;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setPrecoViagem(double precoViagem) {
        this.precoViagem = precoViagem;
    }

    public void setDataValida(LocalDate dataValida) {
        this.dataValida = dataValida;
    }

    public void setDataCarrega(LocalDate dataCarrega) {
        this.dataCarrega = dataCarrega;
    }

    public String toString() {
        return "Epass{" +
                "codigo=" + codigo +
                ", saldo=" + saldo +
                ", precoViagem=" + precoViagem +
                ", dataCarrega=" + dataCarrega +
                ", dataValida=" + dataValida +
                '}';
    }

    public boolean equals(Object o) {
        return this == o;
    }

}
