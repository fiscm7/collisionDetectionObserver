/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collisionDetectionObserver.observer;

import java.util.ArrayList;
import java.util.List;

public class SensorData {

    private List<Observer> values = new ArrayList<Observer>();

    private int state1, state2, state3, state4, state5, state6, state7, state8;

    public int getState1() {
        return state1;
    }

    public int getState2() {
        return state2;
    }

    public int getState3() {
        return state3;
    }

    public int getState4() {
        return state4;
    }

    public int getState5() {
        return state5;
    }

    public int getState6() {
        return state6;
    }

    public int getState7() {
        return state7;
    }

    public int getState8() {
        return state8;
    }

    public void setState(int a, int b, int c, int d, int e, int f, int g, int h) {
        this.state1 = a;
        this.state2 = b;
        this.state3 = c;
        this.state4 = d;
        this.state5 = e;
        this.state6 = f;
        this.state7 = g;
        this.state8 = h;
        notifyAllObservers();       
    }

    public void attach(Observer observer) {
        values.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : values) {
            observer.update();
        }
    }

}
