public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(double celcius) {
        double fahrenheit = (celcius * (9.0 / 5.0)) + 32;
        System.out.println(celcius + " °C fica " + fahrenheit + " °F");
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double celcius = (fahrenheit - 32) * (5.0 / 9.0);
        System.out.println(fahrenheit + " °F fica " + celcius + " °C");
    }
}