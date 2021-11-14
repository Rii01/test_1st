public class Main {
    public static void main(String[] args){
        Circle rect = new Circle(3);
        double area = rect.calcArea();
        double circum = rect.calcCircum();
        System.out.println("Area = " + area);
        System.out.println("Circumference =" + circum);

    } 
}
