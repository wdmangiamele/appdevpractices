// To Run the tests for this file...
//        javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar EdgeFieldTest.java
//
//        java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore EdgeFieldTest

// Andrew Diana
// 1-25-18
// App Dev Practices Milestone 1
// EdgeFieldTest.java


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EdgeFieldTest {
    EdgeField testEdgeFieldObj;

    @Before
    public void setUp() throws Exception {
        testEdgeFieldObj = new EdgeField("1|test");
//        runner();
    }

    public void runner() {
        testNumFigure();
        testName();
        testTableID();
        testTableBound();
        testFieldBound();
        testDataType();
        testVarcharValue();
        testPrimaryKey();
        testDisallowNull();
        testDefaultValue();
        //Changed Value Tests
        testChangedDefaultValue();
        testChangedTableID();
        testChangedTableBound();
        testChangedFieldBound();
        testChangedDataType();
        testChangedVarcharValue();
        testChangedIsPrimaryKey();
        testChangedDisallowNull();
        testStrDataType();
        testChangedToString();
    }

    // Is not valid if the numFigures isn't set to 1
    @Test
    public void testNumFigure() {
        assertEquals("numFigure was initialized to 1 so it should be 1", 1, testEdgeFieldObj.getNumFigure());
    }

    // Is not valid if the name isn't set to 'test'
    @Test
    public void testName() {
        assertEquals("name was initialized to test so it should be test", "test", testEdgeFieldObj.getName());
    }

    // Is not valid if the tableID isn't 0
    @Test
    public void testTableID() {
        assertEquals("tableID was initialized to 0 so it should be 0", 0, testEdgeFieldObj.getTableID());
    }

    // Is not valid if the tableBound isn't 0
    @Test
    public void testTableBound() {
        assertEquals("tableBound was initialized to 0 so it should be 0", 0, testEdgeFieldObj.getTableBound());
    }

    // Is not valid if the fieldBpund isn't 0
    @Test
    public void testFieldBound() {
        assertEquals("fieldBound was initialized to 0 so it should be 0", 0, testEdgeFieldObj.getFieldBound());
    }

    // Is not valid if the dataType isn't 0
    @Test
    public void testDataType() {
        assertEquals("dataType was initialized to 0 so it should be 0", 0, testEdgeFieldObj.getDataType());
    }

    // Is not valid if the varcharValue isn't 1
    @Test
    public void testVarcharValue() {
        assertEquals("varcharValue was initialized to 1 so it should be 1", 1, testEdgeFieldObj.getVarcharValue());
    }

    // Is not valid if the primaryKey isn't false
    @Test
    public void testPrimaryKey() {
        assertEquals("isPrimaryKey was initialized to false so it should be false", false, testEdgeFieldObj.getIsPrimaryKey());
    }

    // Is not valid if the tableID isn't 0
    @Test
    public void testDisallowNull() {
        assertEquals("disallowNull was initialized to false so it should be false", false, testEdgeFieldObj.getDisallowNull());
    }

    // Is not valid if the tableID isn't 0
    @Test
    public void testDefaultValue() {
        assertEquals("defaultValue was initialized to '' so it should be ''", "", testEdgeFieldObj.getDefaultValue());
    }

    // Is not array of string data types
    @Test
    public void testStrDataType() {
        String[] testValues = {"Varchar", "Boolean", "Integer", "Double"};
        assertEquals("strDataType was initialized to {\"Varchar\", \"Boolean\", \"Integer\", \"Double\"}so it should be {\"Varchar\", \"Boolean\", \"Integer\", \"Double\"}", testValues, testEdgeFieldObj.getStrDataType());
    }

    //************************************  Changed Value Tests ****************************

    // Sets tableID and then checks it
    @Test
    public void testChangedTableID() {
        testEdgeFieldObj.setTableID(1);
        assertEquals("tableID was changed to 1 so it should be 1", 1, testEdgeFieldObj.getTableID());
    }

    // Sets tableBound and then checks it
    @Test
    public void testChangedTableBound() {
        testEdgeFieldObj.setTableBound(1);
        assertEquals("tableBound was changed to 1 so it should be 1", 1, testEdgeFieldObj.getTableBound());
    }

    // Sets fieldBound and then checks it
    @Test
    public void testChangedFieldBound() {
        testEdgeFieldObj.setFieldBound(1);
        assertEquals("fieldBound was changed to 1 so it should be 1", 1, testEdgeFieldObj.getFieldBound());
    }

    // Sets dataType and then checks it
    @Test
    public void testChangedDataType() {
        testEdgeFieldObj.setDataType(1);
        assertEquals("dataType was changed to 1 so it should be 1", 1, testEdgeFieldObj.getDataType());
    }

    // Sets varcharValue and then checks it
    @Test
    public void testChangedVarcharValue() {
        testEdgeFieldObj.setVarcharValue(2);
        assertEquals("varcharValue was changed to 2 so it should be 2", 2, testEdgeFieldObj.getVarcharValue());
    }

    // Sets isPrimaryKey and then checks it
    @Test
    public void testChangedIsPrimaryKey() {
        testEdgeFieldObj.setIsPrimaryKey(true);
        assertEquals("primaryKey was changed to true so it should be true", true, testEdgeFieldObj.getIsPrimaryKey());
    }

    // Sets disallowNull and then checks it
    @Test
    public void testChangedDisallowNull() {
        testEdgeFieldObj.setDisallowNull(true);
        assertEquals("disallowNull was changed to true so it should be true", true, testEdgeFieldObj.getDisallowNull());
    }

    // Sets disallowNull and then checks it
    @Test
    public void testChangedDefaultValue() {
        testEdgeFieldObj.setDefaultValue("defaultTest");
        assertEquals("defaultValue was changed to defaultTest so it should be defaultTest", "defaultTest", testEdgeFieldObj.getDefaultValue());
    }

    // Sets all values of the object and then checks it
    @Test
    public void testChangedToString() {
        testEdgeFieldObj.setTableID(3);
        testEdgeFieldObj.setTableBound(3);
        testEdgeFieldObj.setFieldBound(3);
        testEdgeFieldObj.setDataType(3);
        testEdgeFieldObj.setVarcharValue(3);
        testEdgeFieldObj.setIsPrimaryKey(true);
        testEdgeFieldObj.setDisallowNull(true);
        testEdgeFieldObj.setDefaultValue("toStringTest");
        assertEquals("EdgeField object was changed to 1|test|3|3|3|3|3|true|true|toStringTest so it should be 1|test|3|3|3|3|3|true|true|toStringTest", "1|test|3|3|3|3|3|true|true|toStringTest", testEdgeFieldObj.toString());
    }

}