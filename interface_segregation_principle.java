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

class cube implements threeDShapes{
    private double side;
    cube(double side){
        this.side = side;
    }
    @java.lang.Override
    void area() {
        double area = 6*side*side;
        System.out.println("Area of cube is: "+area);
    }

    @java.lang.Override
    void volume() {
        double volume = side*side*side;
        System.out.println("Volume of cube is: "+volume);
    }
}

class interface_segregation_principle{
    public static void main(String[] args) {
        twoDShapes twd = new square(4.0,6.0);
        twd.area();
        twoDShapes twd2 = new rectangle(4.0,6.0);
        twd2.area();
        threeDShapes thd =  new cube(6.0);
        thd.area();
        thd.volume();
    }
}