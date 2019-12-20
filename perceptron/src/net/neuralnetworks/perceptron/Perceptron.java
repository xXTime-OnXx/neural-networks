package net.neuralnetworks.perceptron;

import java.util.ArrayList;
import java.util.List;

public class Perceptron {

    private List<List<Integer>> trainingPatterns = new ArrayList<>();

    private List<Integer> patternElementCategory = new ArrayList<>();
    private List<Element> elements = new ArrayList<>();

    private int numberOfWeights;

    public Perceptron(int numberOfWeights) {
        this.numberOfWeights = numberOfWeights;
    }

    public void addElement() {
        elements.add(new Element(numberOfWeights));
    }

    public void addPattern(List<Integer> pattern, Integer category) {
        trainingPatterns.add(pattern);
        patternElementCategory.add(category);
    }

    public void train() {
        System.out.println("Learn Step:");
        for (int element = 0; element < elements.size(); element++) {
            System.out.println("Element: " + element);
            for (int pattern = 0; pattern < trainingPatterns.size(); pattern++) {
                int category = 0;
                if (element == patternElementCategory.get(pattern)) {
                    category = 1;
                }
                elements.get(element).learn(trainingPatterns.get(pattern), category);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public List<Integer> useModel(List<Integer> pattern) {
        List<Integer> result = new ArrayList<>();
        for (Element element : elements) {
            result.add(element.reaction(pattern));
        }
        return result;
    }

}