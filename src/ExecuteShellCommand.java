import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ExecuteShellCommand {

    static String executeCommand(String command) {

        StringBuilder output = new StringBuilder();

        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line;
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
                output.append(line).append("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return output.toString();

    }

}