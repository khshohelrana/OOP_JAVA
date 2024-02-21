package CSEassignment;

public abstract class Figure {
    double dim1;
    double dim2;
    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    abstract double area();
    abstract int compareTo(Figure X);

}

class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a,b);
    }
    double area(){
        return dim1 * dim2;
    }
    int compareTo(Figure X){
        if(this.area() == X.area()){
            return 0;
        }
        if(this.area() > X.area()){
            return 1;
        }
        if(this.area() < X.area()){
            return -1;
        }
        return 0;
    }
}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }
    double area(){
        return (dim1 * dim2)/2;
    }
    int compareTo(Figure X){
        if(this.area() == X.area()){
            return 0;
        }
        if(this.area() > X.area()){
            return 1;
        }
        if(this.area() < X.area()){
            return -1;
        }
        return 0;
    }
}

