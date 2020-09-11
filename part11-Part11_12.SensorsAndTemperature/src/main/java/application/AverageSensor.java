package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{

    private ArrayList<Sensor> sensors = new ArrayList<>();
    private List<Integer> readings = new ArrayList<>();

    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }

    public List<Integer> readings(){
        return readings;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors){
            if (!sensor.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        sensors.forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        sensors.forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        if (!this.isOn() || sensors.isEmpty()){
            throw new IllegalStateException("AverageSensor is off, or if no sensors have been added to it");
        }
        int sum = sensors.stream()
                .mapToInt(Sensor::read)
                .sum();
        int avg = sum / sensors.size();
        readings.add(avg);
        return avg;
    }
}
