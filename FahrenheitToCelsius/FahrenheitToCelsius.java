
/**
 * This program will convert 88 degrees Fahrenheit into degrees Celsius.
 * 
 * @author Hannah Pang
 * @version September 9, 2015
 */
public class FahrenheitToCelsius
{
    public static void main(String[] args)
    {
        double degreesFahrenheit = 88.0;
        double degreesCelsius = (degreesFahrenheit - 32) * 5/9;
        System.out.println("88 degrees Fahrenheit = " + degreesCelsius + " degrees Celsius");
    }
}