package application;
import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean state;
    private int reading;
    public TemperatureSensor(){

    }
    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void setOn() {
        this.state = true;
    }

    @Override
    public void setOff() {
        this.state = false;
    }

    @Override
    public int read() {
        try{
            if(state == false){
                throw new IllegalStateException("The temperature sensor is off.");
            }
            reading = new Random().nextInt(61) - 30;

        } catch (IllegalStateException e){
            System.out.println(e);
            return 0;
        }
            return reading;
    }
}
