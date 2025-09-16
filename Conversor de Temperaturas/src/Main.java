public class Main {
    public static void main(String[] args) {
        // a farenheit
        double celsius = 25.0;
        double fahrenheit = Conversor.aFahrenheit(celsius);
        System.out.println(celsius + "°C equivale a " + fahrenheit + "°F");

        // a celcius
        fahrenheit = 77.0;
        celsius = Conversor.aCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F equivale a " + celsius + "°C");
    }
}