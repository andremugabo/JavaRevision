package HELLOWORLD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloAl {
    public static void main (String[] args)throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        System.out.println("Enter your name:");
        String name = input.readLine();
        System.out.println("Hello, "+name+" !!");

    }
}
