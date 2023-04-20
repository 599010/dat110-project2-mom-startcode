package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

    private static final int COUNT = 10;

    public static void main(String[] args) {

        // simulated / virtual temperature sensor
        TemperatureSensor sn = new TemperatureSensor();

        // create a client object and use it to
        Client client = new Client("sensor", "localhost", 8080);

        // - connect to the broker - user "sensor" as the user name
        client.connect();

        // - create a temperature topic
        client.createTopic("temperature");

        // - subscribe to the temperature topic
        client.subscribe("temperature");

        // - publish the temperature(s)
        for (int i = 0; i < COUNT; i++) {
            int temp = sn.read();
            client.publish("temperature", String.valueOf(temp));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // - disconnect from the broker
        client.disconnect();

        System.out.println("Temperature device stopping ... ");

        throw new UnsupportedOperationException(TODO.method());

    }
}
