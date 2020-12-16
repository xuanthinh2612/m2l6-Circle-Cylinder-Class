public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        setRadius(1.0);
        height = 1.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder( double radius, String color,double height){
            super(radius, color);
            this.height = height;
        }
        public double getHeight () {
            return height;
        }

        public void setHeight ( double height){
            this.height = height;
        }
        public double getVolume() {
        return super.getArea()*height;
        }
        public String toString() {
        return "this is subclass of Circle has "+" height : "+height+super.toString();
        }
    }
