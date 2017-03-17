package com.collisionDetectionObserver.observer;

import com.collisionDetectionObserver.Reactions.CollisionWarning;

public class SensorObserver extends Observer {

    CollisionWarning cw = new CollisionWarning();

    public SensorObserver(SensorData sd) {
        this.values = sd;
        this.values.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Message:" + values.getState1() + values.getState2() + values.getState3() + values.getState4() + values.getState5() + values.getState6() + values.getState7() + values.getState8());

        cw.findCollision(values.getState1(), values.getState2(), values.getState3(), values.getState4(), values.getState5(), values.getState6(), values.getState7(), values.getState8());

    }

}
