package BankAccountPT2;
import java.util.Scanner;


public class Main 
{
    public static void main(String[] args) {
        int opc;
        Scanner s = new Scanner(System.in);
        Client cliente1 = new Client();
        PrimeWallet wallet = new PrimeWallet();
        Client cliente2 = new Client();
        do {
            System.out.println("1 - Cadastrar Clientes \n 2 - Listar clientes prime");
            opc = s.nextInt();
            switch (opc) {
                case 1:
                    criarCliente(s, cliente1, wallet);
                    criarCliente(s, cliente2, wallet);
                    break;
                case 2:
                    System.out.println("Listando clientes prime");
                    wallet.listar();
                    break;
                case 3:
                    // if(wallet.size())
                        // makeDeposit()
                    // else
                        // System.out.println("Não temos clientes cadastrados ainda");
                    // criarCliente();
                    break;
                case 4:
                    // criarCliente();
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (opc != 9);
    }

    /**
     * Metodo para criar um cliente
     * @param s | Scanner
     * @param client | obj do cliente com a conta instanciada. 
     */
    private static void criarCliente(Scanner s, Client cliente, PrimeWallet wallet) {
        int random;
        String nome;
        System.out.println("digite o seu nome: ");
        nome = s.next();
        cliente.setNome(nome);
        System.out.println("digite o seu cpf: ");
        cliente.setCpf(s.next());
        // cliente.conta.setNumero(numero);
        makeSpecialAccount(s, cliente);
        // makeInvestimentAccount(s, cliente);
        System.out.println("--------------------------------");
        System.out.println("Adicionando o cliente para a carteira prime... ");
        System.out.println("--------------------------------");
        wallet.adicionar(cliente);
    }

    private static void makeSpecialAccount(Scanner s, Client cliente) {
        // SpecialAccount special;
        double limite, taxaManutencao;
        cliente.special = new SpecialAccount(0, cliente.getNome(), 0, 0);
        int numero = 1 + (int) (Math.random() * 1000);
        System.out.println("Digite o limite da sua conta especial");
        do {
            limite = s.nextDouble();
            if(limite <= 0) 
                System.out.println("Limite invalido, tente um valor válido");
        } while(limite <= 0);
        System.out.println("Digite um valor para sua taxa de manutencao:");
        do {
            taxaManutencao = s.nextDouble();
            if(taxaManutencao > (cliente.special.saldo + limite) || taxaManutencao <= 0) 
                System.out.println("taxaManutencao invalido, tente um valor válido");
        } while(taxaManutencao > (cliente.special.saldo + limite) || taxaManutencao <= 0);
        cliente.special = new SpecialAccount(
            numero, 
            cliente.getNome(),
            limite,
            taxaManutencao
        );
    }

    private static void makeInvestimentAccount(Scanner s, Client cliente) {
        Investiment investiment;
        double taxaRendimento;
        do {
            taxaRendimento = s.nextDouble();
            if(taxaRendimento <= 0) 
                System.out.println("taxa de Rendimento invalida, tente um valor válido");
        } while(taxaRendimento <= 0);
        investiment = new Investiment(
            cliente.conta.numero, 
            cliente.conta.nome,
            taxaRendimento
        );
    }

    // private static void makeDeposit(Scanner s) {
    //     double deposito;
    //     System.out.println("Quanto deseja depositar?");
    //     deposito = s.nextDouble();

    // }

}
