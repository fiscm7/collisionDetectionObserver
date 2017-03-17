/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collisionDetectionObserver.observer;

/**
 *
 * @author mensc
 */
abstract class Observer {

    protected SensorData values;

    public abstract void update();

}
