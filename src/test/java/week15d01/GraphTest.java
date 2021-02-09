package week15d01;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void testMaxValueEntry() {
        Graph graph = new Graph();
        Map<Double, Double> testGraph = new HashMap<>();
        testGraph.put(-4d, 6d);
        testGraph.put(5d, -2d);
        testGraph.put(-1d, 2d);
        testGraph.put(0d, -4d);
        Map.Entry<Double, Double> result = graph.maxValueEntry(testGraph);
        assertEquals(-4.0, result.getKey());
        assertEquals(6.0, result.getValue());
    }
}