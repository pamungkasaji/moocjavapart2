package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean power;
    private Random random;

    public TemperatureSensor() {
        this.power = false;
        random = new Random();
    }

    @Override
    public boolean isOn() {
        return power;
    }

    @Override
    public void setOn() {
        power = true;
    }

    @Override
    public void setOff() {
        power = false;
    }

    @Override
    public int read() {
        if (power){
            return random.nextInt(61) - 30;
        }
        throw new IllegalStateException();
    }
}
