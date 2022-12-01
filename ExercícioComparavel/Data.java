package ExercícioComparavel;

public class Data implements Comparavel {
    private int d;
    private int m;
    private int a;

    Data(int d, int m, int a) { 
        this.d = d;
        this.m = m;
        this.a = a;
    }

    public String getDataFormatada() {
        return this.d+"/"+this.m+"/"+this.a;
    }

    /**
     * utilizei o metodo compareTo
     * pois era mais simples e bonito de ser usar
     * kkkkkk
     */
    public boolean maior(Comparavel obj){
        Data data = (Data) obj;
        int res = this.getDataFormatada()
            .compareTo(data.getDataFormatada());
        if(res > 0)
            return true;
        return false;
    }

    public boolean menor(Comparavel obj){
        Data data = (Data) obj;
        int res = this.getDataFormatada()
            .compareTo(data.getDataFormatada());
        if(res < 0)
            return true;
        return false;
    }

    public boolean igual(Comparavel obj){
        Data data = (Data) obj;
        int res = this.getDataFormatada()
            .compareTo(data.getDataFormatada());
        if(res == 0)
            return true;
        return false;
    }
}
