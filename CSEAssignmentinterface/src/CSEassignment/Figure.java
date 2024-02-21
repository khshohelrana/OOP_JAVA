package CSEassignment;

 public interface Figure {
//     double dim1;
//    double dim2;
//    Figure(double a, double b){
//        dim1 = a;
//        dim2 = b;
//    }
     double area();
     int compareTo(Figure X);

}

class Rectangle implements Figure{
    double dim1;
    double dim2;
    Rectangle(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    public double area(){
        return dim1 * dim2;
    }
    public int compareTo(Figure X){
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



class Triangle implements Figure{
    double dim1;
    double dim2;
    Triangle(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    public double area(){
        return (dim1 * dim2)/2;
    }
    public int compareTo(Figure X){
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
