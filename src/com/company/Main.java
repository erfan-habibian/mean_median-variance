package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter count:");
        int count = input.nextInt();
        ArrayList<Float> array = new ArrayList();
        System.out.print("input array items:");
        for (int i = 0; i < count; i++) {
            array.add(input.nextFloat());
        }

        System.out.println();
        System.out.println("mean: " + mean(array) + "");
        System.out.println("median: " + median(array) + "");
        System.out.println("variance: " + variance(array) + "");

    }


    private static float median(ArrayList<Float> array){
        int size = array.size();
        if (size%2 == 0){
            return (array.get((size/2)-1) + array.get((size/2)))/2;
        }
        return array.get((size /2));
    }


    private static float mean(ArrayList<Float> array){
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum+=array.get(i);
        }
        return (float)sum/array.size();
    }

    private static float variance(ArrayList<Float> array){
        float mean = mean(array);
        float sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum+= (array.get(i)-mean)*(array.get(i)-mean);
        }
        return sum/array.size();
    }


}
