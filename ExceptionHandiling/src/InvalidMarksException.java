public class InvalidMarksException extends Exception{

    private double a;
    InvalidMarksException (double i){
        a=i;}
    public String toString()
    {
        return "InvalidMarksException["+a+"]";
    }
}

class Test{

    static void compute (double a) throws InvalidMarksException {


        if (a > 100 || a<0 )
            throw new InvalidMarksException(a);
        System.out.println("Normal Exit");
    }
}
