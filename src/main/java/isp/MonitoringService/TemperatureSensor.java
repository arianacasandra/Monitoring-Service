package isp.MonitoringService;

public class TemperatureSensor extends Sensor {
    private double temperature;
    void setTemperature(double temperature)
    {
        this.temperature = temperature;
    }
    public double getTemperature()
    {
        return this.temperature;
    }
    public TemperatureSensor(String installLocation,String name,double temperature)
    {
        super(installLocation,name);
        this.temperature = temperature;
    }
}
