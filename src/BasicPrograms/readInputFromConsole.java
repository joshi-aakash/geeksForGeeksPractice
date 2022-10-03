//Java Program to Get Input from the User

package BasicPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class readInputFromConsole {
    public static void main(String[] args) throws IOException {

        //Enter data using bufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        //Read data using readLine
        String name = reader.readLine();

        //printing the read line
        System.out.println(name);
    }
}
