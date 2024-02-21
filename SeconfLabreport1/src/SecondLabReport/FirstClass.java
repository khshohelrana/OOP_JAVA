package SecondLabReport;

public class FirstClass {

    double b,h,l,w,r;

    FirstClass(double a, double b, double h) {


        double triangle = a * b * h;
        System.out.println("Area of a triangle is: " + triangle);
        System.out.println();
      }
    FirstClass(double l,double w) {
            double rectangular = l * w;
            System.out.println("Area of a rectangular; "+rectangular);
            System.out.println();
        }
    FirstClass(double r){


             double  circle= Math.PI*r*r;
                System.out.println("Area of a circle: "+circle);
                System.out.println();

            }

        }






