package net.neuralnetworks.perceptron;

import java.util.Arrays;

public class Element {

    private String category;
    private double[] weights;

    public Element(final int amountOfEntries) {
        weights = new double[amountOfEntries];
        Arrays.fill(weights, 1);
    }

    public String getCategory() {
        return category;
    }

    public void train(double[] entries, double isCorrectCategory) {
        for (int i = 0; i < weights.length; i++) {
            weights[i] = learnMultiplier(entries) * entries[i] * (isCorrectCategory - calcCorrectCategory(entries));
        }
    }

    public double calcCorrectCategory(double[] entries) {
        double sumWiXi = 0d;
        for (int i = 0; i < weights.length; i++) {
            sumWiXi += weights[i] * entries[i];
        }
        return sumWiXi >= 0 ? 1d : 0d;
    }

    private double learnMultiplier(double[] entries) {
        double sumWiXi = 0d;
        double sumXiXi = 0d;
        for(int i = 0; i < weights.length; i++) {
            sumWiXi = weights[i] * entries[i];
            sumXiXi = entries[i] * entries[i];
        }
        return sumWiXi / sumXiXi;
    }


}
