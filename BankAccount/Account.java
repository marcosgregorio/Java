package BankAccount;

import java.util.Scanner;

public class Account {
    protected int numero;
    protected double saldo;
    protected String nome;

    public Account() {
        this.saldo = 0;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void depositar(double valor) {        
        this.saldo += valor;
    }

    public Boolean sacar(double valor) {
        if(valor > this.saldo || valor <= 0) return false;
        // this.saldo -= valor; 
        return true;
    }

    public void resumoExtrato() {
        System.out.println("Nome: " + this.nome +
                            "\nSaldo: " + this.saldo
        );
    }


    public void fazManutencao() {
        
    }
}
