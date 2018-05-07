import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("Duplicates")

public class MainTester{
    public static void main(String args[]){
        JUnitCore jUnitCore = new JUnitCore();

        if(args[0].equals("-h")){
            //help message
            System.out.println("HELP:");
            System.out.println("-n \"1,2,3,teststyle1,teststyle2\"\t\tEnter in this format to pass in arguments");
            System.out.println("-f textfile.txt\t\t Enter in this format to pass in a data file");
        }
        else if(args[0].equals("-n")){
            List<String> items = new LinkedList<>(Arrays.asList(args[1].split(",")));
            if(items.get(0).equals("field")) {
                String testObject = "";
                items.remove(0);
                for(String item : items) {
                    testObject = testObject + item + "|";
                }
                testObject = testObject.substring(0, testObject.length() - 1);

                EdgeFieldTestEx7.prepare(testObject);

                Result fieldResult = jUnitCore.run(EdgeFieldTestEx7.class);
                for (Failure failure : fieldResult.getFailures()) {
                    System.out.println("TEST FAILED : "+failure.toString());
                }
                System.out.println("EdgeField Tests Successful? : "+fieldResult.wasSuccessful());
            } else if (items.get(0).equals("table")) {
                String testObject = "";
                items.remove(0);
                for(String item : items) {
                    testObject = testObject + item + "|";
                }
                testObject = testObject.substring(0, testObject.length() - 1);

                EdgeTableTestEx7.prepare(testObject);

                Result fieldResult = jUnitCore.run(EdgeTableTestEx7.class);
                for (Failure failure : fieldResult.getFailures()) {
                    System.out.println("TEST FAILED : "+failure.toString());
                }
                System.out.println("EdgeTable Tests Successful? : "+fieldResult.wasSuccessful());
            } else {
                System.out.println("Malformed object");
            }
        }
        else if(args[0].equals("-f")){
            File file = new File(args[1]);
            try {
                Scanner scanner = new Scanner(file);
                while(scanner.hasNextLine()) {
                    List<String> items = new LinkedList<>(Arrays.asList(scanner.nextLine().split(",")));
                    if(items.get(0).equals("field")) {
                        String testObject = "";
                        items.remove(0);
                        for(String item : items) {
                            testObject = testObject + item + "|";
                        }
                        testObject = testObject.substring(0, testObject.length() - 1);

                        EdgeFieldTestEx7.prepare(testObject);

                        Result fieldResult = jUnitCore.run(EdgeFieldTestEx7.class);
                        for (Failure failure : fieldResult.getFailures()) {
                            System.out.println("TEST FAILED : "+failure.toString());
                        }
                        System.out.println("EdgeField Tests Successful? : "+fieldResult.wasSuccessful());
                    } else if (items.get(0).equals("table")) {
                        String testObject = "";
                        items.remove(0);
                        for(String item : items) {
                            testObject = testObject + item + "|";
                        }
                        testObject = testObject.substring(0, testObject.length() - 1);

                        EdgeTableTestEx7.prepare(testObject);

                        Result fieldResult = jUnitCore.run(EdgeTableTestEx7.class);
                        for (Failure failure : fieldResult.getFailures()) {
                            System.out.println("TEST FAILED : "+failure.toString());
                        }
                        System.out.println("EdgeTable Tests Successful? : "+fieldResult.wasSuccessful());
                    } else {
                        System.out.println("Malformed object");
                    }
                }
            }catch(Exception e){
                System.out.println("Exception in filereader: "+e);
            }
        }
    }

}

