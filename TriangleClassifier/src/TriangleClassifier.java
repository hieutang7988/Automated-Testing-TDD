public class TriangleClassifier {
    double sideA;
    double sideB;
   double sideC;

    public TriangleClassifier(double sideA, double sideB, double sideC) throws Exception{
        if(sideA<=0||sideB<=0||sideC<=0)
            throw new Exception("khong phai la tam giac");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public int checkTriangles() {
      boolean isTriangle = false;
        if ((sideA + sideB < sideC) && (sideA + sideC <sideB) && (sideB + sideC < sideA))
            isTriangle = true;
        if(isTriangle) {
            if (sideA == sideB && sideB == sideC) {
                return 2;
            } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
                return 1;
            } else {
                return 0;
            }
        }
        else {
            return-1;
        }

    }
}