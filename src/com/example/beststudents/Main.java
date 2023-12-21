package com.example.beststudents;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String s;

        try (BufferedReader br = new BufferedReader(new FileReader("students.txt"));
             FileWriter fw = new FileWriter("students_best.txt")) {
            while ((s = br.readLine()) != null) {
                s = s.trim();
                if (s.endsWith("5")) {
                    s = s + "\r\n";
                    fw.write(s);
                }
            }
        } catch (IOException e) {
            System.out.println("I/O error: " + e);
        }
    }
}
