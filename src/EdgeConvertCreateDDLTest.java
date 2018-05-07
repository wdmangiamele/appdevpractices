import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EdgeConvertCreateDDLTest {
    private EdgeConvertCreateDDL testECC;
    private EdgeTable[] edgeTables;
    private EdgeTable edgeTable;
    private EdgeField[] edgeFields;
    private EdgeField edgeField;

    @Before
    public void setUp() throws Exception {
        edgeTable = new EdgeTable("1|test table|3");
        edgeTable.makeArrays();
        edgeField = new EdgeField("1|test");
        edgeTables = new EdgeTable[1];
        edgeFields = new EdgeField[1];
        edgeTables[0] = edgeTable;
        edgeFields[0] = edgeField;

        testECC = new EdgeConvertCreateDDL(edgeTables, edgeFields) {
            @Override
            public String getDatabaseName() {
                return null;
            }

            @Override
            public String getProductName() {
                return null;
            }

            @Override
            public String getSQLString() {
                return null;
            }

            @Override
            public void createDDL() {

            }
        };
        runner();
    }

    public void runner() {
        testGetField();
        //testGetTable();
    }

    @Test
    public void testGetTable() {
        assertEquals("getTable returns EdgeTable object, expected not null", edgeTables[0], testECC.getTable(1));
    }

    @Test
    public void testGetField() {
        assertEquals("getField returns EdgeField object, expected not null", edgeFields[0], testECC.getField(1));
    }
}
