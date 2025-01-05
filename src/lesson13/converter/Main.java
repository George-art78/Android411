package lesson13.converter;

public class Main {
    public static void main(String[] args) {
        double temperature = 21.5;
        final int N = 3;
        Converter converter[] = new Converter[N];
        converter[0] = new CelsiusConverter();
        converter[1] = new KelvinConverter();
        converter[2] = new FahrenheitConverter();

        for (Converter c : converter) {
            System.out.println("t = " + c.getConvertedValue(temperature));
        }
    }
}

interface Converter {
    double getConvertedValue(double baseValue);
}

class CelsiusConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue;
    }
}

class KelvinConverter implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue + 273.15;
    }
}

class FahrenheitConverter implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
