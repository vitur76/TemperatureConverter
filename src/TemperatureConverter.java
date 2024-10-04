public class TemperatureConverter {
    public double toCelsius(double far)
    {
        return (5 * (far - 32)) / 9;
    }

    public double toFahrenheit(double cel)
    {
        return (9 * cel + (32 * 5)) / 5;
    }
}
