public class Book {
    private int Pages;
    private double Weight;
    private String Name;

    public Book(int p, double w, String c){
        Pages = p;
        Weight = w;
        Name = c;
    }
    public Book(double w){
        Pages = 2000;
        Weight = w;
        Name = "War and peace";
    }public Book(){
        Pages = 2000;
        Weight = 2;
        Name = "War and peace";
    }

    public void setPages(int Pages){
        this.Pages = Pages;
    }
    public void setWeight(double Weight){
        this.Weight = Weight;
    }
    public void setPages(String Name){
        this.Name = Name;
    }
    public double getPages(){
        return Pages;
    }
    public double getWeight(){
        return Weight;
    }
    public String getName(String Name){
        return Name;
    }
    public String toString(){
        return "Pages = "+this.Pages+", Weight = "+this.Weight+", Name = "+this.Name;
    }
    public void infoBook(){
        System.out.println("Pages = "+Pages+", Weight = "+Weight+", Name = "+Name);
    }
}
