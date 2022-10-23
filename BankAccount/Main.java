package BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        SpecialAccount specialAccount;
        Investiment investiment;
        Scanner scanner = new Scanner(System.in);
        String nome;
        int numero;
        double deposito, saque, limite, taxaManutencao, taxaRendimento;

        System.out.println("Entrando no sistema do banco...");
        System.out.printf("Digite seu nome: ");
        nome = scanner.next();
        account.setNome(nome);
        System.out.printf("Digite seu numero: ");
        numero = scanner.nextInt();
        account.setNumero(numero);
        System.out.printf("Digite um valor para deposito: ");
        do {
            deposito = scanner.nextDouble();
            if (deposito <= 0) System.out.println("valor invalido!\ndigite um valor valido:"); 
        } while (deposito <= 0);
        account.depositar(deposito);
        System.out.println(account.saldo);
        System.out.printf("Digite uma quantidade para saque: ");
        do {
            saque = scanner.nextDouble();
            if(!account.sacar(saque)) 
                System.out.println("Saque invalido, tente um valor válido");
        } while(!account.sacar(saque));
        account.saldo -= saque;
        account.resumoExtrato();
        System.out.println(" ");
        // conta especial 
        System.out.println("Digite um valor para seu limite:");
        do {
            limite = scanner.nextDouble();
            if(limite <= 0) 
                System.out.println("Limite invalido, tente um valor válido");
        } while(limite <= 0);
        System.out.println("Digite um valor para sua taxa de manutencao:");
        do {
            taxaManutencao = scanner.nextDouble();
            if(taxaManutencao > (account.saldo + limite) || taxaManutencao <= 0) 
                System.out.println("taxaManutencao invalido, tente um valor válido");
        } while(taxaManutencao > (account.saldo + limite) || taxaManutencao <= 0);
        specialAccount = new SpecialAccount(numero, nome, limite, taxaManutencao);
        setValuesSpecialAccount(specialAccount, account);
        System.out.printf("Digite uma quantidade para saque + o seu limite: ");
        do {
            saque = scanner.nextDouble();
            if(!specialAccount.sacar(saque)) 
                System.out.println("Saque invalido, tente um valor válido");
        } while(!specialAccount.sacar(saque));
        specialAccount.saldo -= saque;
        System.out.println("Extrato antes da manutencao.");
        specialAccount.resumoExtrato();
        System.out.println("Fazendo a manutencao...");
        specialAccount.fazManutencao();
        specialAccount.resumoExtrato();
        // Investimento
        System.out.println("Digite um valor para sua taxa de rendimento: ");
        do {
            taxaRendimento = scanner.nextDouble();
            if(taxaRendimento <= 0) 
                System.out.println("taxa de Rendimento invalida, tente um valor válido");
        } while(taxaRendimento <= 0);
        investiment = new Investiment(numero, nome, taxaRendimento);
        setValuesInvestiment(investiment, account);
        System.out.println("Valores antes da manutencao");
        investiment.resumoExtrato();
        System.out.println("Valores após a manutencao");
        investiment.fazManutencao();
        investiment.resumoExtrato();
    }

    /**
     * passa os valores do objeto pai para os valores do
     * obj filho.
     * @param objeto é o obj com os valores da conta 
     */
    public static void setValuesSpecialAccount(SpecialAccount specialAccount, Account objeto) {
        specialAccount.saldo = objeto.saldo + specialAccount.limite ;
        specialAccount.nome = objeto.nome;
        specialAccount.numero = objeto.numero;
        return;
    }

    public static void setValuesInvestiment(Investiment investiment, Account objeto) {
        investiment.saldo = objeto.saldo;
        return;
    }

}
