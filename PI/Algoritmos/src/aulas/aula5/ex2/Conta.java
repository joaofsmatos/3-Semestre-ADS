package aulas.aula5.ex2;

import java.util.Random;

public class Conta {

    private int numero;
    private double saldo;
    private double limite;
    private String nome;

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        gerarLimite();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    private void setLimite(double limite) {
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean depositar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if(valor <= this.saldo + this.limite) {
            setLimite(getLimite() - (valor - saldo));
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(Conta conta1, Conta conta2, double valor) {
        return conta1.sacar(valor) && conta2.depositar(valor);
    }

    public void gerarLimite() {
        Random rdm = new Random();
        setLimite(rdm.nextInt(1001));
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", limite=" + limite +
                ", nome='" + nome + '\'' +
                '}';
    }

}
