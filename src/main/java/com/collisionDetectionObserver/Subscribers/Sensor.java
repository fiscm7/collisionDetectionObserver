package com.collisionDetectionObserver.Subscribers;

import com.collisionDetectionObserver.Subscribers.Observers;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mensc
 */
public class Sensor {

    private List<Observers> sensor = new ArrayList<Observers>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int data) {
        this.state = data;
        notifyAllObserver();
    }

    public void attach(Observers observer) {
        sensor.add(observer);
    }

    private void notifyAllObserver() {
        for (Observers observer : sensor) {
            observer.update();
        }
    }

}
