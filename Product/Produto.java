package Product;

public class Produto {
    private String name;
    private double value;
    private int quantity = 0;
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public boolean verificaDisponibilidade(int qtde) {
        if(qtde <= this.quantity) return true;
        return false;   
    }

    public void addUnidade(int qtde) {
        this.quantity += qtde;
    }

    public boolean removerUnidade(int qtde) {
        if (this.verificaDisponibilidade(qtde)){
            this.quantity -= qtde;
            return true;
        }
        else
            System.out.println("Quantidade maior do que em estoque");
        return false;
    }

    public String toString() {
        return "Nome: "+this.name +" | "+
            "Quantidade: "+this.quantity + " | "+"Valor: "+ this.value;
    }
}
