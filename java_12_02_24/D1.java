package java_12_02_24;

import java.util.List;

public class D1 {
    public static void main(String[] args) {
    }

    public double calculateAverageValueForGivenList(List<Double> listOfNumbers) {
        double sumOfAllValues = 0;
        for (double currentValue : listOfNumbers) {
            sumOfAllValues += currentValue;
        }
        return sumOfAllValues / listOfNumbers.size();
    }
}



class AverageCalculator {
    public double calculateAverage(List<Double> numbers) {
        double sum = 0;
        for (double currentValue : numbers) {
            sum += currentValue;
        }
        return sum / numbers.size();
    }
}