import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest{
    Triangle Triangle1, Triangle2;
    Point2D Points1, Points2, Points3;
    toComparator comparator;


    @Before
    public void setup(){
        Points1 = new Point2D(0, 0);
        Points2 = new Point2D(0, 6);
        Points3 = new Point2D(8, 0);
        Triangle1 = new Triangle(Points1, Points2, Points3);
        Triangle2 = new Triangle(0, 0, 3, 0, 0, 4);
        comparator = new toComparator();
    }

    @Test
    public void areaTest(){
        assertEquals(24.0, Triangle1.area(), 0.001);
        assertEquals(6.0, Triangle2.area(), 0.001);
    }

    @Test
    public void perimeterTest(){
        assertEquals(24.0, Triangle1.perimeter(), 0.01);
        assertEquals(12.0, Triangle2.perimeter(), 0.01);
    }

    @Test
    public void toStringTest(){
        assertEquals("((0.0,0.0) , (0.0,6.0) , (8.0,0.0))", Triangle1.toString());
        assertEquals("((0.0,0.0) , (3.0,0.0) , (0.0,4.0))", Triangle2.toString());
    }

    @Test
    public void resizeTest(){
        Triangle newTriangle1 = (Triangle)Triangle1.resize(2);
        assertEquals(48.0, newTriangle1.area(), 0.001);
        Triangle newTriangle2 = (Triangle)Triangle1.resize(0.5);
        assertEquals(12.0, newTriangle2.area(), 0.001);
        assertEquals("((0.0,0.0) , (0.0,4.242640687119286) , (5.656854249492381,0.0))", newTriangle2.toString());
    }

    @Test
    public void compareTest(){
        assertEquals(1, comparator.compare(Triangle1, Triangle2));
    }
}
