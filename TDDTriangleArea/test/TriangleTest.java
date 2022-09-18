import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void getAreaCase1() {
        double sideA = 3.0;
        double sideB = 4.0;
        double sideC = 5.0;

        double expectedResult = 6.0;

        // test
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        double actualResult = triangle.getArea();

        // test
        assertEquals(expectedResult, actualResult, 0.001);
    }

    @Test
    public void getAreaCase2() {
        double sideA = 1.0;
        double sideB = 2.0;
        double sideC = 3.0;

        double expectedResult = 0.000;

        // test
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        double actualResult = triangle.getArea();

        // test
        assertEquals(expectedResult, actualResult, 0.001);
    }

    @Test
    public void getAreaCase3() {
        double sideA = 4.0;
        double sideB = 4.0;
        double sideC = 4.0;

        double expectedResult = 6.928;

        // test
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        double actualResult = triangle.getArea();

        // test
        assertEquals(expectedResult, actualResult, 0.001);
    }

    @Test
    public void getAreaCase4() {
        double sideA = 5.0;
        double sideB = 6.0;
        double sideC = 7.0;

        double expectedResult = 14.696;

        // test
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        double actualResult = triangle.getArea();

        // test
        assertEquals(expectedResult, actualResult, 0.001);
    }

    @Test
    public void getAreaCase5() {
        double sideA = -3.0;
        double sideB = 7.0;
        double sideC = 5.0;

        double expectedResult = 0.000;

        // test
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        double actualResult = triangle.getArea();

        // test
        assertEquals(expectedResult, actualResult, 0.001);
    }
}