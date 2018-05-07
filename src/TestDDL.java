/**
 * This file will test the .sql script created by the program
 */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.File;


public class TestDDL {
    boolean doesFileExist;
    @Before
    public void setUp() throws Exception {
        File tmpDir = new File("../MySQLDB.sql");
        doesFileExist = tmpDir.exists();
    }

    public void runner() {
        testFileExists();
        testRunSQLScript();
        testSQLDatabase();
    }

    @Test
    public void testFileExists() {
        assertEquals("The file should exist. Expecting true.", true, doesFileExist);
    }

    @Test
    public void testRunSQLScript() {
        String output = ExecuteShellCommand.executeCommand("node scripts/runSQLScript.js");

        if(output.toLowerCase().contains("ERROR 1007".toLowerCase())) {
            fail("Database already exists");
        }

        if(output.toLowerCase().contains("ERROR 1064".toLowerCase())) {
            fail("Syntax error in SQL script");
        }
    }

    @Test
    public void testSQLDatabase() {
        String output = ExecuteShellCommand.executeCommand("node scripts/runSQLCheck.js");
    }
}
