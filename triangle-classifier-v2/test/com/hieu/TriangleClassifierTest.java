package com.hieu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TriangleClassifierTest {

    @Test
    public void checkTriangles1()  {
        TriangleClassifier triangleClassifier = new TriangleClassifier(2, 2,2 );
        int expectResult = 2;
        int actualResult = triangleClassifier.checkTriangles();
        assertEquals(expectResult, actualResult);
    }

    @Test
    public void checkTriangles2() {
        TriangleClassifier triangleClassifier = new TriangleClassifier(2, 2,3 );
        int expectResult = 1;
        int actualResult = triangleClassifier.checkTriangles();
        assertEquals(expectResult, actualResult);
    }

    @Test
    public void checkTriangles3()  {
        TriangleClassifier triangleClassifier = new TriangleClassifier(3, 4,5 );
        int expectResult = 3;
        int actualResult = triangleClassifier.checkTriangles();
        assertEquals(expectResult, actualResult);
    }

    @Test
    public void checkTriangles4()  {
        TriangleClassifier triangleClassifier = new TriangleClassifier(2, 5.5,5 );
        int expectResult = 0;
        int actualResult = triangleClassifier.checkTriangles();
        assertEquals(expectResult, actualResult);
    }

    @Test
    public void checkTriangles5()  {
        TriangleClassifier triangleClassifier = new TriangleClassifier(8, 2,3 );
        int expectResult = -1;
        int actualResult = triangleClassifier.checkTriangles();
        assertEquals(expectResult, actualResult);
    }

    @Test
    public void checkTriangles6()  {
        TriangleClassifier triangleClassifier = new TriangleClassifier(-1, 2,1 );
        int expectResult = -1;
        int actualResult = triangleClassifier.checkTriangles();
        assertEquals(expectResult, actualResult);
    }

    @Test
    public void checkTriangles7()  {
        TriangleClassifier triangleClassifier = new TriangleClassifier(0, 2,1 );
        int expectResult = -1;
        int actualResult = triangleClassifier.checkTriangles();
        assertEquals(expectResult, actualResult);
    }
}
