package application;
import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private boolean state;
    private int reading;
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    public AverageSensor(){
        state = true;
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }
    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }
    @Override
    public boolean isOn() {
        for(Sensor sensor: sensors){
            if(!sensor.isOn()){
                return false;
            } else {
                this.state = true;
            }
        }
        return this.state;
    }

    @Override
    public void setOn() {
        for (Sensor sensor: sensors){
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for(Sensor sensor: sensors){
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        try {
            int totalReadings = 0;
                if(sensors.isEmpty()){
                    throw new IllegalStateException("There are no sensors to average.");
                }
                for(Sensor sensor: sensors){
                    if(!sensor.isOn()){
                        throw new IllegalStateException("The sensor is off.");
                    }
                    totalReadings += sensor.read();
                }
                reading = totalReadings / sensors.size();
        } catch (IllegalStateException e){
            System.out.println(e);
        }
            readings.add(reading);
            return reading;
    }
    public List<Integer> readings(){
        return readings;
    }
}
