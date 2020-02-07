public class Runner {
    public static void main(String[] args) {
        Car myCar = new Car(
                2001, "Audi", 12000, "A4");

        System.out.println(myCar.toString());

        myCar.drive(400);

        System.out.println(myCar.toString());

       Rectangle myRect = new Rectangle(
               5, 5
       );

       System.out.println(myRect.toString());

       myRect.getArea();

       System.out.println(myRect.getArea());

       myRect.getDiagonal();

       System.out.println(myRect.getDiagonal());

       myRect.isSquared();

        System.out.println(myRect.isSquared());


    }
}
