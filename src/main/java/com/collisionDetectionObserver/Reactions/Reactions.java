/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collisionDetectionObserver.Reactions;

/**
 *
 * @author mensc
 */
public class Reactions implements IReactions {

    public void goLeft() {
        System.out.println("Drive Left");
    }

    public void goStop() {
        System.out.println("Stooop!");
    }

    public void goStraightOn() {
        System.out.println("You can drive!");
    }

    public void goRight() {
        System.out.println("Drive Right");
    }

}
