package BankAccountPT2;

public class Client
{
    private String nome;
    private String cpf;
    public SpecialAccount special;
    public Investiment investiment;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

   
}