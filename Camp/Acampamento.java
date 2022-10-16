package Camp;

public class Acampamento {
    private String nome;
    private int idade;
    private char equipe;

    Acampamento(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    public void definirEquipe() {
        if(this.idade >= 6 && this.idade <= 10)
            this.equipe = 'A';
        else if(this.idade >= 11 && this.idade <= 20)
            this.equipe = 'B';
        else
            this.equipe = 'C';
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString(){
        return "Nome: " + this.nome + "\tIdade: " + this.idade + '\n' 
            + "Equipe: " + this.equipe; 
    }
}
