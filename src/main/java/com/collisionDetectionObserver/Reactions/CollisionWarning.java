/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collisionDetectionObserver.Reactions;

import com.collisionDetectionObserver.Calculation.*;
import com.collisionDetectionObserver.interfaces.*;

/**
 *
 * @author mensc
 */
public class CollisionWarning {

    
    IFrontDetection fd = new FrontDetection();
    ISideDetection sd = new SideDetection();
    IReactions rs = new Reactions();

    public void findCollision(int state1, int state2, int state3, int state4, int state5, int state6, int state7, int state8) {

        if (fd.frontDetection(state3, state4, state5, state6) == -1 && sd.sideDetection(state1, state2, state7, state8) == -1) {
            rs.goLeft();
        } else if (fd.frontDetection(state3, state4, state5, state6) == -1 && sd.sideDetection(state1, state2, state7, state8) == 0) {
            rs.goLeft();
        } else if (fd.frontDetection(state3, state4, state5, state6) == -1 && sd.sideDetection(state1, state2, state7, state8) == 1) {
            rs.goStop();
        } else if (fd.frontDetection(state3, state4, state5, state6) == 0 && sd.sideDetection(state1, state2, state7, state8) == -1) {
            rs.goStraightOn();
        } else if (fd.frontDetection(state3, state4, state5, state6) == 0 && sd.sideDetection(state1, state2, state7, state8) == 0) {
            rs.goStraightOn();
        } else if (fd.frontDetection(state3, state4, state5, state6) == 0 && sd.sideDetection(state1, state2, state7, state8) == 1) {
            rs.goStraightOn();
        } else if (fd.frontDetection(state3, state4, state5, state6) == 1 && sd.sideDetection(state1, state2, state7, state8) == -1) {
            rs.goStop();
        } else if (fd.frontDetection(state3, state4, state5, state6) == 1 && sd.sideDetection(state1, state2, state7, state8) == 0) {
            rs.goRight();
        } else if (fd.frontDetection(state3, state4, state5, state6) == 1 && sd.sideDetection(state1, state2, state7, state8) == 1) {
            rs.goRight();
        } else if (fd.frontDetection(state3, state4, state5, state6) == 9) {
            rs.goStop();
        } else {
            rs.goStop();
        }

    }

}