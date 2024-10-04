//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TemperatureConverter tc = new TemperatureConverter();
        double cel = 42.99;
        double far = 88.77;

        System.out.println("Far: " + far + " => Cel: " + tc.toCelsius(far));
        System.out.println("Cel: " + cel + " => Far: " + tc.toFahrenheit(cel));
    }
}