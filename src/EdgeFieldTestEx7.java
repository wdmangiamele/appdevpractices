// To Run the tests for this file...
//        javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar EdgeFieldTest.java
//
//        java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore EdgeFieldTest

// Andrew Diana
// 1-25-18
// App Dev Practices Milestone 1
// EdgeFieldTest.java


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//Prevents Errors from Duplicate Code
// This class is modified to allow for external setting of object for testing purposes

@SuppressWarnings("Duplicates")

public class EdgeFieldTestEx7 {
    // Sets default EdgeField Object
    static EdgeField testEdgeFieldObj = new EdgeField("1|test");
//    @Before
//    public void setUp() throws Exception {
//        testEdgeFieldObj = new EdgeField("1|test");
////        runner();
//    }

    public static void prepare(String testEdge){
        testEdgeFieldObj = new EdgeField(testEdge);
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
        testStrDataType();
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

}