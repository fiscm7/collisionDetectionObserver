/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collisionDetectionObserver.connectors;

import com.collisionDetectionObserver.interfaces.IConnector;
import com.tinkerforge.AlreadyConnectedException;
import com.tinkerforge.BrickletDistanceUS;
import com.tinkerforge.IPConnection;
import com.tinkerforge.NotConnectedException;
import com.tinkerforge.TimeoutException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mensc
 */
public class Get1LDB implements IConnector {

    private static final String HOST = "localhost";
    private static final int PORT = 4223;

    // Change XYZ to the UID of your Distance US Bricklet
    private static final String UID1 = "jBq"; // Hier ist Sensor I

    /**
     *
     * @return
     */
    @Override
    public IPConnection connectToSensor() {
        IPConnection ipcon = new IPConnection(); // Create IP connection
        try {
            ipcon.connect(HOST, PORT);
            return ipcon;
        } catch (IOException | AlreadyConnectedException ex) {
            Logger.getLogger(Get1LDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ipcon;
    }

    /**
     *
     * @return
     */
    @Override
    public int getData() {
        BrickletDistanceUS dus1 = new BrickletDistanceUS(UID1, connectToSensor()); // Create device object
        try {
            return dus1.getDistanceValue();
        } catch (TimeoutException | NotConnectedException ex) {
            Logger.getLogger(Get1LDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
