package Product;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        menu();
    }

    /**
     * principal metodo que gera o menu e
     * chama outros metodos
     */
    public static void menu() {
        ArrayList<Produto> products = new ArrayList<Produto>();
        int opc;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Selecione uma opcao: ");
            System.out.println(" 1 - Cadastrar Produto\n 2 - Consultar Estoque\n 3 - Remover unidades\n 4 - Adcionar unidades\n 9 - Sair\n");
            opc = s.nextInt();
            switch (opc) {
                case 1:
                    cadastraProd(products, s);
                    break;
                case 2:
                    consultarEstoque(products, s);
                    break;
                case 3:
                    remove(products, s);
                    break;
                case 4:
                    addUnidade(products, s);
                    break;
                default:
                    System.out.println("Valor não encontrado");
                    break;
            }
        }while(opc != 9);
    }
    
    /**
     * Cadastra o objeto produto
     * e insere ele na ultima pos 
     * do arrayList
     * @params arrayList dos Produtos
     * @return void
     */
    public static void cadastraProd(ArrayList<Produto> products, Scanner scan) {
        Produto product = new Produto();
        String name;
        double value;
        int qtde;

        System.out.println("Digite um nome: ");
        name = scan.next();
        product.setName(name);
        System.out.println("Digite um valor: ");
        do{
            value = scan.nextDouble();
            if(value <= 0) System.out.println("Valor invalido, insira um valor valido");
        }while(value <= 0);
        product.setValue(value);
        System.out.println("Digite uma Quantidade: ");
        do{
            qtde = scan.nextInt();
            if(qtde <= 0) System.out.println("Valor invalido, insira uma quantidade valida");
        }while(qtde <= 0);
        product.addUnidade(qtde);
        products.add(product);
        return;
    }

    /**
     * Faz uma consulta no estoque
     * @Exception Produto não encontrado no estoque!
     */
    public static void consultarEstoque(ArrayList<Produto> products, Scanner scan) {
        int index;

        System.out.println("Digte o index do produto");
        index = scan.nextInt();
        try {
            System.out.println(products.get(index).toString());
        } catch (Exception e) {
            System.out.println("Produto não encontrado no estoque!");
        }
    }

    public static void remove(ArrayList<Produto> products, Scanner scan) {
        int index, qtde;

        System.out.println("Digte o index do produto");
        index = scan.nextInt();
        qtde = scan.nextInt();
        try {
            System.out.println(products.get(index).removerUnidade(qtde));
        } catch (Exception e) {
            System.out.println("Produto não encontrado no estoque!");
        }
    }

    public static void addUnidade(ArrayList<Produto> products, Scanner scan) {
        int index, qtde;

        System.out.println("Digte o index do produto");
        index = scan.nextInt();
        do{
            qtde = scan.nextInt();
            if(qtde <= 0) System.out.println("Valor invalido, insira uma quantidade valida");
        }while(qtde <= 0);
        try {
            System.out.println(products.get(index).removerUnidade(qtde));
        } catch (Exception e) {
            System.out.println("Produto não encontrado no estoque!");
        }
    }
}