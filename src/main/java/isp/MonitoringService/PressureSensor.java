package isp.MonitoringService;

public class PressureSensor extends Sensor{
    private double pressure;
    void setPressure(double pressure)
    {
        this.pressure=pressure;
    }
    public double getPressure()
    {
        return this.pressure;
    }
    public PressureSensor(String installLocation,String name,double pressure)
    {
        super(installLocation,name);
        this.pressure = pressure;
    }
}
