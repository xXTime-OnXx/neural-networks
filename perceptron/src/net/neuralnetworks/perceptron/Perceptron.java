package net.neuralnetworks.perceptron;

public class Perceptron {

    private Element[] elements;
    private int entriesPerElement;

    public Perceptron(final int amountOfElements, final int entriesPerElement) {
        elements = new Element[amountOfElements];
        for (int i = 0; i < amountOfElements; i++) {
            elements[i] = new Element(entriesPerElement);
        }
        this.entriesPerElement = entriesPerElement;
    }

    public void trainElements(double[] entries, String category, int trainingIterations) {
        for (int i = 0; i < trainingIterations; i++) {
            for (Element element : elements) {
                double isCorrectCategory = element.getCategory().equals(category) ? 1d : 0d;
                element.train(entries, isCorrectCategory);
            }
        }
    }
}
