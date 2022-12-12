public class News extends Post{
    private String source;

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }
    //a
    @Override
    public void show() {
        super.show();
        System.out.println("Fonte da notícia: " + source);
    }
}