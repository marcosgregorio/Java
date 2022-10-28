package BankAccountPT2;

/**
 * Investment
 */
public class Investiment extends Account{
    protected double taxaRendimento;
    
    public void fazManutencao() {
        this.saldo += (this.saldo * this.taxaRendimento);
    }

    public void resumoExtrato() {
        System.out.println("Nome: " + this.nome +
                            "\nSaldo: " + this.saldo +
                            "\nTaxa Rendimento: " + (this.taxaRendimento * 100)+"%"
        );
    }

    public Investiment(int numero, String nome, double taxaRendimento) {
        this.numero = numero;
        this.nome = nome;
        this.taxaRendimento = taxaRendimento;
    }
}