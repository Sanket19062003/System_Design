public abstract class twoDShapes{
    void area();
}

public abstract class threeDShapes{
    void area();
    void volume();
}

class square implements twoDShapes{
    double length, breadth,area;
    square(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @java.lang.Override
    void area() {
        area = length*breadth;
        System.out.println("Area of square is: "+area);
    }
}

class rectangle implements twoDShapes{
    double length,breadth,area;
    rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @java.lang.Override
    void area() {
        area = length*breadth;
        System.out.println("Area of rectangle is: "+area);
    }
}

class cube{

}