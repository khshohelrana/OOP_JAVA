package CSEassignment;

public class MainClass {

    public static void main(String[] args) {
        double ans,RectangleC,TriangleT;
        Rectangle objectr1 = new Rectangle(6,4);
        Rectangle objectr2 = new Rectangle(8,4);
        Triangle objectt1 = new Triangle(8,6);
        Triangle objectt2 = new Triangle(7,4);


        ans = objectr1.area();
        System.out.println("Area of the Rectangle is: "+ans);
        ans = objectr2.area();
        System.out.println("Area of the Rectangle is: "+ans);
        ans = objectt1.area();
        System.out.println("Area of the Triangle is: "+ans);
        ans = objectt2.area();
        System.out.println("Area of the Triangle is: "+ans);

        RectangleC = objectr2.compareTo(objectr1);
        if(RectangleC == 0){
            System.out.println("Rectangle objects are equal");
        }
        if(RectangleC == 1){
            System.out.println("Invoking rectangle object is larger (with respect to the area) ");
        }
        if(RectangleC == -1){
            System.out.println("Invoking rectangle object is smaller than the object passed as a parameter");
        }

        TriangleT = objectt2.compareTo(objectt1);
        if(TriangleT == 0){
            System.out.println("Triangle objects are equal");
        }
        if(TriangleT == 1){
            System.out.println("Invoking triangle object is larger (with respect to the area)");
        }
        if(TriangleT == -1){
            System.out.println("Invoking triangle object is smaller than the object passed as a parameter");
        }


    }

}
