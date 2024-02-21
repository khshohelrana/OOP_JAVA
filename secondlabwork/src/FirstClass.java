
public class FirstClass {

    FirstClass ( double d, double h, double w){

        double triangle = (d * h * w);
        System.out.println("Triangle: " + triangle);
    }
    FirstClass ( double h) {

        double circle= 3.1416*(h*h);
        System.out.println("Circle: " + circle);

    }
    FirstClass ( double h, double w) {
        double rectangular= h*w;
        System.out.println("rectangular: " + rectangular);
    }
}
