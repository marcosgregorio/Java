package BankAccount;

public class SpecialAccount extends Account 
{
    protected double limite;
    protected double taxaManutencao;

    // construtor
    public SpecialAccount(int numero, String nome, double limite, double taxaManutencao) {
        this.numero = numero;
        this.limite = limite;
        this.nome = nome;
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public Boolean sacar(double value) {
        if(value > this.saldo ) return false;
        return true;
    }

    public void resumoExtrato() {
        System.out.println("Nome: " + this.nome +
                            "\nSaldo: " + this.saldo +
                            "\nLimite: " + this.limite +
                            "\nTaxa Manutenção: " + this.taxaManutencao
        );
    }

    public void fazManutencao() {
        this.saldo -= this.taxaManutencao;
    }

}
