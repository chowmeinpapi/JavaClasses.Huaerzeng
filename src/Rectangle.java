public class Rectangle {
    //Properties
    private double Length;
    private double Width;

    //Constructor
    public Rectangle(double length, double width) {
        Length = length;
        Width = width;
    }

    //Methods
    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
        Length = length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getArea(){
        return Length*Width;
    }

    public double getDiagonal(){
        return Math.sqrt(Length*Length + Width*Width);
    }

    public boolean isSquared(){
        if(Length == Width){
            return true;
        }else{
            return false;
        }
    }

    public String toString() {
        return "Rectangle{" +
                "Length=" + Length +
                ", Width='" + Width + '\'' +
                '}';
    }

   // public double getDiagonal(){

    }

