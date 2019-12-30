package net.neuralnetworks.hopfieldnet;

import java.util.Arrays;

public class HopfieldNetMain {

    public static void main(String[] args) {
        HopfieldNet hopfieldNet = new HopfieldNet(10);

        // Number 1
        int[] pattern1 = {
                -1, -1, -1, -1, 1, 1, -1, -1, -1, -1,
                -1, -1, -1, -1, 1, 1, -1, -1, -1, -1,
                -1, -1, -1, -1, 1, 1, -1, -1, -1, -1,
                -1, -1, -1, -1, 1, 1, -1, -1, -1, -1,
                -1, -1, -1, -1, 1, 1, -1, -1, -1, -1,
                -1, -1, -1, -1, 1, 1, -1, -1, -1, -1,
                -1, -1, -1, -1, 1, 1, -1, -1, -1, -1,
                -1, -1, -1, -1, 1, 1, -1, -1, -1, -1,
                -1, -1, -1, -1, 1, 1, -1, -1, -1, -1,
                -1, -1, -1, -1, 1, 1, -1, -1, -1, -1
        };

        // Number 2
        int[] pattern2 = {
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                -1, -1, -1, -1, -1, -1, -1, -1, 1, 1,
                -1, -1, -1, -1, -1, -1, -1, -1, 1, 1,
                -1, -1, -1, -1, 1, 1, 1, 1, 1, 1,
                -1, -1, -1, -1, 1, 1, 1, 1, 1, 1,
                -1, -1, -1, -1, -1, -1, -1, -1, 1, 1,
                -1, -1, -1, -1, -1, -1, -1, -1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1
        };

        // Number 2
        int[] testee = {
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                -1, -1, -1, -1, -1, -1, -1, -1, 1, 1,
                -1, -1, -1, -1, -1, -1, -1, -1, 1, 1,
                -1, -1, -1, -1, 1, 1, 1, 1, -1, -1,
                -1, -1, -1, -1, 1, 1, 1, 1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, 1, 1,
                -1, -1, -1, -1, -1, -1, -1, -1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1
        };

        hopfieldNet.addCategory(pattern1);
        hopfieldNet.addCategory(pattern2);

        hopfieldNet.train();

        int[] result = hopfieldNet.getCategoryForPattern(testee);

        System.out.println("testee resemble to pattern2: " + (result == pattern2));
        System.out.println(Arrays.toString(result));
    }

}
