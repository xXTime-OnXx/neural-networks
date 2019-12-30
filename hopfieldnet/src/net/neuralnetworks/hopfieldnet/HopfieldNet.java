package net.neuralnetworks.hopfieldnet;

import java.util.ArrayList;

import static java.lang.Math.pow;

public class HopfieldNet {

    private int numberOfElements;

    private double[][] weights;

    private ArrayList<int[]> categories = new ArrayList<>();

    public HopfieldNet(int site) {
        numberOfElements = (int) pow(site, 2);
        weights = new double[numberOfElements][numberOfElements];
    }

    public void addCategory(int[] pattern) {
        if (pattern.length != numberOfElements)
            return;
        categories.add(pattern);
        System.out.println(categories.size() + ". Category added");
    }

    public void train() {
        for (int x = 0; x < numberOfElements; x++) {
            for (int y = 0; y < numberOfElements; y++) {
                double sum = 0;
                for (int[] pattern : categories) {
                    sum += pattern[x] * pattern[y];
                }
                if (x == y) {
                    weights[x][y] = 0;
                } else {
                    weights[x][y] = 1.0 / (double) numberOfElements * sum;
                }
            }
        }
    }

    public int[] getCategoryForPattern(int[] pattern) {
        for (int x = 0; x < numberOfElements; x++) {
            double sum = 0;
            for (int y = 0; y < numberOfElements; y++) {
                if (x != y) {
                    sum += weights[x][y] * pattern[y];
                }
            }
            if (sum >= 0) {
                pattern[x] = 1;
            } else {
                pattern[x] = -1;
            }
        }
        return pattern;
    }

}
