import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Blog extends Post {
    private ArrayList<Post> posts = new ArrayList<Post>();

    public void showAll() {
        for(Post post : this.posts) {
            post.show();
            System.out.println();
        }
    }

    public void readData(Post p, Scanner scanner) {
        int estrelas;
        System.out.println("Digite um titulo para o post: ");
        p.setTitle(scanner.nextLine());
        for(Post post : this.posts) {
            if(post.getTitle().equals(p.getTitle()))
                throw new RuntimeException("Titulo já cadastrado");
        }
        System.out.println("Digite o conteudo do post: ");
        p.setContent(scanner.nextLine());
        p.setDate();
        if(p instanceof News) {
            System.out.println("Digite o titulo da noticia: ");
            ((News)p).setContent(scanner.nextLine());
        } else if(p instanceof ProductReview) {
            System.out.println("Digite a marca do produto: ");
            ((ProductReview)p).setBrand(scanner.nextLine());
            System.out.println("De uma avaliação de 1 a 10 estrelas: ");
            do{
                estrelas = scanner.nextInt();
                if(estrelas > 10 && estrelas < 1) System.out.println("Valor invalido")
            }while(estrelas > 10 && estrelas < 1);
            ((ProductReview) p).evaluate(scanner.nextInt());
        }
    }

    public static void main(String[] args) {
        Blog blog = new Blog();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            
        } while (option != 9);
    }
}
