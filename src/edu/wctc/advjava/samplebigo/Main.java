package edu.wctc.advjava.samplebigo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> newList = new ArrayList<String>();
        ArrayList<String> nullList = new ArrayList<String>();
        newList.add("Fun");
        newList.add("Fun");
        newList.add("Fun");
        newList.add("Fun");
        //newList.add("Fun");
        //newList.add("Fun");
        //newList.add("Fun");
        //newList.add("Fun");
        //newList.add("Fun");
        //newList.add("Fun");
        //newList.add("java");
        //newList.add("java");
        long reference=System.nanoTime();

        nullList.add(null);
        //System.out.println(isFirstElementNull(newList));
        //System.out.println(isFirstElementNull(nullList));
        //System.out.println(containsValue(newList, "java"));
        //System.out.println(containsValue(newList, "boring"));
        System.out.println(containsDuplicates(newList));
        //System.out.println(containsDuplicates(nullList));
        long finishm=System.nanoTime();
        System.out.println(( (double)(finishm-reference) )/1000000000.0 + " Nano Seconds");
    }

        // O(1)
        private static boolean isFirstElementNull(ArrayList<String> elements) {
            return elements.get(0) == null;
        }

        // O(n)
        private static boolean containsValue(ArrayList<String> elements, String value){
            for (String element : elements) {
                if (element == value) {
                    return true;
                }
            }
            return false;
        }

        // O(n^2)
        private static boolean containsDuplicates(ArrayList<String> elements) {
            for (int i = 0; i < elements.size(); i++) {
                for (int j = 0; j < elements.size(); j++) {
                    if (i == j) {
                        continue;
                    }
                    if (elements.get(i) == elements.get(j)) {
                        return true;
                    }
                }
            }
            return false;
        }

        // O(2^n)
        private static int fibonacci(int number){
            if (number <= 1) return number;
            return fibonacci(number - 2) + fibonacci(number - 1);
        }
    }