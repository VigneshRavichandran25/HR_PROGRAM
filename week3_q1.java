// first Abstract class create pandren
abstract class Device {
    private String deviceName;
    private boolean powerStatus;

    public Device(String deviceName) {
        this.deviceName = deviceName;
        this.powerStatus = false; 
// default ta off la iruku 
    }

    // inga Encapsulation use pandrom
    public String getDeviceName() {
        return deviceName;
    }

    public boolean isPowerOn() {
        return powerStatus;
    }

    public void turnOn() {
        powerStatus = true;
// on
    }

    public void turnOff() {
        powerStatus = false;
//off
    }

    // Abstract method (Abstraction)
    abstract void displayStatus();
}

// Derived Class - Light, inheritance use pandren
class Light extends Device {

    public Light(String name) {
        super(name);
    }

    @Override
    void displayStatus() {
        System.out.println("Light: " + getDeviceName() + 
            " is " + (isPowerOn() ? "ON" : "OFF"));
    }
}

// Derived Class - Thermostat, inheritance
class Thermostat extends Device {
    private int temperature;

    public Thermostat(String name, int temp) {
        super(name);
        this.temperature = temp;
    }

    @Override
    void displayStatus() {
        System.out.println("Thermostat: " + getDeviceName() +
            " is " + (isPowerOn() ? "ON" : "OFF") +
            " | Temp: " + temperature + "°C");
    }
}

// Main Class create pandren
public class SmartHome {
    public static void main(String[] args) {
//rendu objects create pandren
        Device light = new Light("Living Room Light");
        Device thermo = new Thermostat("Hall Thermostat", 24);

        light.turnOn();
        thermo.turnOn();

        light.displayStatus();
        thermo.displayStatus();

        light.turnOff();
        light.displayStatus();
    }
}
