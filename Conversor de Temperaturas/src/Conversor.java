public class Conversor {

    // Metodo ESTATICO celcius a farenheit
    public static double aFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Metodo ESTATICO farenheit a celcius
    public static double aCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}