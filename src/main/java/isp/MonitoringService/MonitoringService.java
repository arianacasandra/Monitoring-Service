package isp.MonitoringService;

public class MonitoringService {
    private Sensor[] sensor = new TemperatureSensor[10];
    private Sensor[] sensor1 = new PressureSensor[10];
    TemperatureSensor[] temp = (TemperatureSensor[]) sensor;
    PressureSensor[] pres = (PressureSensor[]) sensor1;
    public MonitoringService(){}

    public double getAverageTemperatureSensors() {

        double sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i].getTemperature();
        }
        return sum / temp.length;
    }

    public void setTemperatureSensors(TemperatureSensor[] temp) {
        this.temp = temp;
    }

    public void setPressureSensors(PressureSensor[] pres) {
        this.pres = pres;
    }

    public double getAverageAllSensors() {
        double sum = 0;
        for (int i = 0; i < pres.length; i++)
            sum += pres[i].getPressure();
        double sum2 = 0;
        for (int i = 0; i < temp.length; i++) {
            sum2 += temp[i].getTemperature();
        }


        return (sum + sum2) / (pres.length + temp.length);

    }


    public static void main(String[] args) {

        Sensor[] t= new TemperatureSensor[3];
        TemperatureSensor[] temp= (TemperatureSensor[]) t;
        temp[0]= new TemperatureSensor("-", "-",1);
        temp[1]= new TemperatureSensor("-", "-",2);
        temp[2]= new TemperatureSensor("-", "-",3);
        MonitoringService m = new MonitoringService();
        m.setTemperatureSensors(temp);
        System.out.println(m.getAverageTemperatureSensors());

        Sensor[] p= new PressureSensor[3];
        PressureSensor[] pres = (PressureSensor[]) p;
        pres[0]= new PressureSensor("-", "-",1);
        pres[1]= new PressureSensor("-", "-",2);
        pres[2]= new PressureSensor("-", "-",2);
        m.setPressureSensors(pres);
        System.out.println(m.getAverageAllSensors());

    }
}
