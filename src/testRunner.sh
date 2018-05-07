#!/usr/bin/env bash

# Don't run this yet, it'll make a mess of class files and only runs one test
javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar EdgeTableTest.java EdgeFieldTest.java EdgeConvertFileParserTest.java EdgeConvertCreateDDLTest.java TestDDL.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore EdgeTableTest EdgeFieldTest EdgeConvertFileParserTest EdgeConvertCreateDDLTest TestDDL
