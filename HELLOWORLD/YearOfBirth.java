package HELLOWORLD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Integer;

public class YearOfBirth {
    @SuppressWarnings("removal")
    public static void main(String[] args)throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        System.out.println("Enter your age: ");
        String text = input.readLine();
        // @SuppressWarnings("removal")
        int age = new Integer(text).intValue();
        System.out.println("You are "+age+" years old, now");
        int year = 2025 - age;
        System.out.println("So you were probably born in "+year);

    }
}
