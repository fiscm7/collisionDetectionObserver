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
public class MotionDetection extends Observers{

    public MotionDetection(Sensor sensor){
        this.sensors = sensor;
        this.sensors.attach(this);
        
    }
    
    @Override
    public void update() {
        System.out.println("Motion Detection");
    }

    
    
}
