package net.neuralnetworks.perceptron;

import java.util.Arrays;
import java.util.List;

public class PerceptronMain {

    public static void main(String[] args) {
        List<Integer> pattern1 = Arrays.asList(1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0);  // Category 0
        List<Integer> pattern2 = Arrays.asList(1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0);  // Category 0
        List<Integer> pattern3 = Arrays.asList(1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0);  // Category 0
        List<Integer> pattern4 = Arrays.asList(0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0);  // Category 1
        List<Integer> pattern5 = Arrays.asList(0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0);  // Category 1
        List<Integer> pattern6 = Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0);  // Category 1
        List<Integer> pattern7 = Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0);  // Category 1
        List<Integer> pattern8 = Arrays.asList(0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0);  // Category 2
        List<Integer> pattern9 = Arrays.asList(0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0);  // Category 2
        List<Integer> pattern10 = Arrays.asList(0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1); // Category 3

        List<Integer> test1 = Arrays.asList(1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0);
        List<Integer> test2 = Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0);
        List<Integer> test3 = Arrays.asList(0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1);

        Perceptron perceptron = new Perceptron(12);
        perceptron.addElement();
        perceptron.addElement();
        perceptron.addElement();
        perceptron.addElement();

        perceptron.addPattern(pattern1, 0);
        perceptron.addPattern(pattern2, 0);
        perceptron.addPattern(pattern3, 0);
        perceptron.addPattern(pattern4, 1);
        perceptron.addPattern(pattern5, 1);
        perceptron.addPattern(pattern6, 1);
        perceptron.addPattern(pattern7, 1);
        perceptron.addPattern(pattern8, 2);
        perceptron.addPattern(pattern9, 2);
        perceptron.addPattern(pattern10, 3);

        perceptron.train();
        perceptron.train();
        perceptron.train();
        perceptron.train();
        perceptron.train();
        perceptron.train();
        perceptron.train();
        perceptron.train();
        perceptron.train();
        perceptron.train();

        System.out.println("1. Test:");
        System.out.println(perceptron.useModel(test1));
        System.out.println("2. Test:");
        System.out.println(perceptron.useModel(test2));
        System.out.println("3. Test:");
        System.out.println(perceptron.useModel(test3));
    }

}
