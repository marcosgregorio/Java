import java.util.Date;

public class Post {
    private String title;
    private Date date;
    private String content;
    private int likes;
    private int dislikes;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDate() {
        this.date = new Date();
    }

    public Date getDate() {
        return this.date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void like() {
        this.likes++;
    }

    public int getLikes() {
        return this.likes;
    }

    public void dislike() {
        this.dislikes++;
    }

    public int getDislikes() {
        return this.dislikes;
    }

    public void show() {
        System.out.println("Título: " + this.title);
        System.out.println("Data: " + this.date);
        System.out.println("Conteúdo: " + this.content);
        System.out.println("Likes: " + this.likes);
        System.out.println("Dislikes: " + this.dislikes);
    }
}