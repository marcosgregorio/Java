/**
 * Apolice
 */
public class Apolice {
    int numApolice;
    String nomeSegurado;
    int idade;
    double valorPremio;
    static int ultimoNumApolice = 0;

    Apolice() {
        ultimoNumApolice++;
        this.numApolice = ultimoNumApolice;
    }

    Apolice(String nomeSegurado, int idade, double valorPremio) {
        ultimoNumApolice++;
        this.numApolice = ultimoNumApolice;
        this.nomeSegurado = nomeSegurado;
        this.valorPremio = valorPremio;
    }

    public void calcularPremio() {
        if (this.idade >= 18 && this.idade <= 25)
            this.valorPremio += this.valorPremio * 0.2;
        else if (this.idade > 25 && this.idade <= 36)
            this.valorPremio += this.valorPremio * 0.15;
        else if (this.idade > 36)
            this.valorPremio += this.valorPremio * 0.1;
    }

    public void oferecerDesconto(String cidade) {
        if (cidade.equals("Florianopolis"))
            this.valorPremio -= this.valorPremio * 0.05;
        else if (cidade.equals("Chapeco"))
            this.valorPremio -= this.valorPremio * 0.06;
        else if (cidade.equals("Joaçaba"))
            this.valorPremio -= this.valorPremio * 0.07;
        else if (cidade.equals("Joinville"))
            this.valorPremio -= this.valorPremio * 0.07;
        return;
    }

    public static void exibeUltimoNum() {
        System.out.println("Ultima apolice: "+ultimoNumApolice);
    }

    public void imprimir() {
        System.out.println(
                "Atributos: \n" +
                        "\t"+this.numApolice + "\n" +
                        "\t"+this.nomeSegurado + "\n" +
                        "\t"+this.idade + "\n" +
                        "\t"+this.valorPremio + "\n");
    }
    // public static void main(String[] args) {
    // }
}