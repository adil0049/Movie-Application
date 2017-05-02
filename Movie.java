public class Movie {
    private String title;
    private String actor;
    private int productionYear;

    public Movie(String title, String actor, int productionYear) {
        this.title = title;
        this.actor = actor;
        this.productionYear = productionYear;
    }
    public String getTitle() {
        return title;
        }
    
    public String getActor() {
        return actor;
    }

    public int getProductionYear() {
        return productionYear;
    }
}