package entities;

import conta.Conta;

import java.time.LocalDateTime;

public class ContaPoupanca extends Conta {

    LocalDateTime diaAniversarioPoupanca;

    public ContaPoupanca(int numero, String cpf, LocalDateTime diaAniversarioPoupanca) {
        super(numero, cpf);
        this.diaAniversarioPoupanca = diaAniversarioPoupanca;
    }
    public float correcaoAniversario() {
        if (diaAniversarioPoupanca.equals(LocalDateTime.now())) {
            this.setSaldo((this.getSaldo() * 0.05f) + this.getSaldo());
        } else {
            this.setSaldo((this.getSaldo() * 0.04f) + this.getSaldo());
        }
        return getSaldo();
    }
}