package isp.MonitoringService;

abstract class Sensor {
    private String installLocation;
    private String name;
    public Sensor(String installLocation, String name)
    {
        this.installLocation = installLocation;
        this.name = name;
    }
}
