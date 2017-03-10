/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collisionDetectionObserver.Values;

/**
 *
 * @author mensc
 */
abstract class Observer {

    protected Sensors sensors;

    public abstract void update();
}
