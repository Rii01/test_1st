public class Circle{
    private double radius;
    final double PI = 3.14;

    Circle(double r){
        this.radius = r;
    }

    public double calcArea(){
        return (this.radius*this.radius)*PI; 
    }

    public double calcCircum(){
        return 2*this.radius*PI;
    }
}