package MonitoringService;

import isp.MonitoringService.MonitoringService;
import isp.MonitoringService.TemperatureSensor;
import isp.MonitoringService.PressureSensor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MStest {
    @Test
    public void TestMonitoringService()
    {
        TemperatureSensor[] temp= new TemperatureSensor[3];
        temp[0]= new TemperatureSensor("-", "-",1);
        temp[1]= new TemperatureSensor("-", "-",2);
        temp[2]= new TemperatureSensor("-", "-",3);
        MonitoringService m = new MonitoringService();
        m.setTemperatureSensors(temp);
        assertEquals(2.0,m.getAverageTemperatureSensors(),0.0f);

        PressureSensor[] pres = new PressureSensor[3];
        pres[0]= new PressureSensor("-", "-",1);
        pres[1]= new PressureSensor("-", "-",2);
        pres[2]= new PressureSensor("-", "-",3);
        m.setPressureSensors(pres);
        assertEquals(2,m.getAverageTemperatureSensors(),0.0f);

    }
}
