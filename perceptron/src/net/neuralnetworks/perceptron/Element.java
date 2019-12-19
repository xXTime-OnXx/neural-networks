package net.neuralnetworks.perceptron;

import java.util.List;

public class Element {

    double[] w; // weights.

    public Element(int numberOfWeights) {
        w = new double[numberOfWeights];
        for (int i = 0; i < numberOfWeights; i++) {
            w[i] = 1.0;
        }
    }

    private int theta(double value) {
        if (value > 0.0001) {
            return 1;
        } else {
            return 0;
        }
    }

    public int reaction(List<Integer> x) {
        double y = 0;
        for (int i = 0; i < w.length; i++) {
            y += w[i] * x.get(i);
        }
        return theta(y);
    }

    private double e(List<Integer> x) {
        double dividend = 0;
        double divisor = 0;
        for (int i = 0; i < w.length; i++) {
            dividend += w[i] * x.get(i);
            divisor += Math.pow(x.get(i), 2);
        }
        return dividend / divisor;
    }

    public void learn(List<Integer> pattern, int C) {
        int y = reaction(pattern);
        if (y != C) {
            for (int i = 0; i < w.length; i++) {
                w[i] += e(pattern) * pattern.get(i) * (C - y);
            }
        }
    }
}
