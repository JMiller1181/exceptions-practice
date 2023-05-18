import application.AverageSensor;
import application.StandardSensor;
import application.TemperatureSensor;

public class ExceptionPractice {
    public static void main(String[] args){
//
//
//        //Throws illegal argument exception for name length
//        //Person ted = new Person("", 12);
//
//        //Throw illegal argument exception for age size
//        //Person jim = new Person("Jim", 130);
//
//        Person ron = new Person("Ron", 13);
//        System.out.println("Person");
//        System.out.println(ron);
//
//        Calculator calculator = new Calculator();
//
//        //Throws illegal argument exception for negative number
//        //System.out.println(calculator.factorial(-4));
//        System.out.println("Factorial");
//        System.out.println(calculator.factorial(4));
//
//        //Throws illegal argument exception for having a larger subset than main set
//        //System.out.println(calculator.binomialCoefficient(4,8));
//
//        //Throws illegal argument exception for having a negative input
//        //System.out.println(calculator.binomialCoefficient(4,-1));
//        System.out.println("Binomial Coefficient");
//        System.out.println(calculator.binomialCoefficient(4,2));
//
//        System.out.println("Standard Sensor");
//        StandardSensor standard = new StandardSensor(5);
//        System.out.println(standard.read());
//
        System.out.println("Temperature Sensor");
        TemperatureSensor temperature = new TemperatureSensor();
        //Trying to read while the sensor is off
        //System.out.println(temperature.read());
        temperature.setOn();
        System.out.println("The temperature is " + temperature.read());

        System.out.println("Average Sensor");
        AverageSensor average = new AverageSensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        average.setOn();
        //Try to read without any sensors
        //System.out.println(average.read());
        average.addSensor(temperature);
        average.addSensor(temperatureSensor);
        //Try to read with a sensor off
        //System.out.println(average.read());
        average.setOn();
        System.out.println("The average temperature is: " + average.read());
        System.out.println(average.readings());
        System.out.println(average.read());
        System.out.println(average.read());
        System.out.println(average.readings());
    }
}
