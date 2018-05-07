import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EdgeTableTest {
    EdgeTable testEdgeTableObj;

    @Before
    public void setUp() throws Exception {
        testEdgeTableObj = new EdgeTable("1|test table|3");
    }

    public void runner() {
        testGetName();
        testGetNumFigure();
    }

    @Test
    public void testGetNumFigure() {
        assertEquals("numFigure was initialized to 1 so it should be 1", 1, testEdgeTableObj.getNumFigure());
    }

    @Test
    public void testGetName() {
        assertEquals("name was initialized to 'test table' so it should be 'test table'", "test table", testEdgeTableObj.getName());
    }
}
