public class Triangle {
    public  double sideA;

    public double sideB;
    public double sideC;
    boolean check ;
    double areaTriangle;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public double getArea() {

        if (sideA > 0 && sideB > 0 && sideC > 0) {
            check = true;
        }

        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA && check == true) {
            double p = (this.sideA + this.sideB + this.sideC) / 2;
            return areaTriangle = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
       }else {
            return 0;
        }
    }






}
