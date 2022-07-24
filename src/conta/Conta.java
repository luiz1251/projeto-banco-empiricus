package conta;

public abstract class Conta {

    private int numero;
    private String cpf;
    private float saldo;
    private boolean ativo;


    public Conta (int numero, String cpf) {
        super();
        this.numero = numero;
        this.cpf = cpf;
        this.ativo = false;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    private static void debito(double valor) {
        System.out.println("Débito: " + valor);

    }
}
