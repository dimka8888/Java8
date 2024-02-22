package org.example.myinterface;

import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Collections;
import java.util.Comparator;

import static java.lang.Math.sqrt;

public class MainFormula {
    Formula formula = new Formula() {
        @Override
        public double calculate(int a) {
            return sqrt(a * 100);
        }
    };

    public class Main {
        public static void main(String[] args) {
            List<String> names = new ArrayList<String>(Arrays.asList("petr", "dmitry", "vika"));
            Collections.sort(names, new Comparator<String>() {
                @Override
                public int compare(String a, String b) {
                    return b.compareTo(a);
                }
            });
            System.out.println(names);
        }
    }

    public class Main2 {
        public static void main(String[] args) {
            List<String> names = new ArrayList<>();
            names.add("Alice");
            names.add("Bob");
            names.add("Charlie");
            names.add("David");
            Collections.sort(names, (a, b) -> b.compareTo(a));

            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}