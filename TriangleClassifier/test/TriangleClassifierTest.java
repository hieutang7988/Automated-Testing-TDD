import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {

    @Test
    public void checkTriangles1() throws Exception {
        TriangleClassifier triangleClassifier = new TriangleClassifier(3, 3, 3);
        int actualResult = triangleClassifier.checkTriangles();
        int expected = 2;
        assertEquals(actualResult, expected);
    }
}