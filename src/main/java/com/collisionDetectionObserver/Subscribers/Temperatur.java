/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collisionDetectionObserver.Subscribers;

/**
 *
 * @author mensc
 */
public class Temperatur extends Observers{

    public Temperatur(Sensor sensor){
        this.sensors = sensor;
        this.sensors.attach(this);
    }
    
    @Override
    public void update() {
        System.out.println("This is the Distance");
    }
    
}
