public class Ball {
    private double radius;
    private double SpAb;
    private String color;

    public Ball(double r, double sa, String c){
        radius = r;
        SpAb = sa;
        color = c;
    }
    public Ball(double sa){
        radius = 2;
        SpAb = sa;
        color = "red";
    }public Ball(){
        radius = 2;
        SpAb = 2;
        color = "red";
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setSpAb(double SpAb){
        this.SpAb = SpAb;
    }
    public void setRadius(String color){
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public double getSpAb(){
        return SpAb;
    }
    public String getRadius(String color){
        return color;
    }
    public String toString(){
        return "Radius = "+this.radius+", SpringAbility = "+this.SpAb+", Color = "+this.color;
    }
    public void infoBall(){
        System.out.println("Radius = "+radius+", SpringAbility = "+SpAb+", Color = "+color);
    }
}
