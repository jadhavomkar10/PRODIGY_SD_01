import java.util.*;
public class TemperatureConversion {

    public static Double ConvertToFahrenheit(Double celsius){
        Double fahrenheit = celsius*9/5+32;
        return fahrenheit;
    }
    public static Double convertToKelvin(Double celsius){
        Double kelvin = celsius+273.15;
        return kelvin;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Temperature in Celsius : ");
    double celsius = sc.nextDouble();

    double fahrenheit = ConvertToFahrenheit(celsius);
    double kelvin = convertToKelvin(celsius);

    System.out.print("Temperature in fahrenheit : ");
    System.out.println(fahrenheit);

    System.out.print("Temperature in Kelvin : ");
    System.out.println(kelvin);


    }
}
