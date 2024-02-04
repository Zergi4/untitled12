package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5};
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {

            temp[i] = array[array.length - 1 - i];

        }
        System.out.println(Arrays.toString(temp));
    }
}


