public class ProductReview extends Post implements Evaluable {
    private String brand;
    private int stars;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getStars() {
        return stars;
    }

    @Override
    public void evaluate(int value) {
        this.stars = value;
    }
    
    @Override
    public void show() {
        super.show();
        System.out.println("Marca: " + this.brand);
        System.out.println("Estrelas: " + this.stars);
    }    
}