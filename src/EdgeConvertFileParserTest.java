import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class EdgeConvertFileParserTest {
    EdgeConvertFileParser testEdgeConvertFileParserObj;
    File constructorFile= new File("../CoursesTest.edg");

    @Before
    public void setUp() throws Exception {
        testEdgeConvertFileParserObj = new EdgeConvertFileParser(constructorFile);
    }

    public void runner() {
        testGetEdgeFields();
        testGetEdgeTables();
    }

    @Test
    public void testGetEdgeTables() {
        assertArrayEquals("EdgeTable[] array", new EdgeTable[0], testEdgeConvertFileParserObj.getEdgeTables());
    }

    @Test
    public void testGetEdgeFields() {
        assertArrayEquals("gets edge tables, expected 1", new EdgeField[0], testEdgeConvertFileParserObj.getEdgeFields());
    }
}
