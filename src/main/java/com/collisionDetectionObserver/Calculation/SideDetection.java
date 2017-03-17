/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collisionDetectionObserver.Calculation;

import com.collisionDetectionObserver.interfaces.ISideDetection;

/**
 *
 * @author mensc
 */
public class SideDetection implements ISideDetection {

    public int sideDetection(int state1, int state2, int state7, int state8) {

        int WARNING_SIDE = 300;
        

        //Rückgaben: leftFree, rightFree, free, not free
        //left: -1, free: 0, right: 1, not free: 9, allerdings, not free macht keinen Sinn, denn, wie ist das Fahrzeug dorthin gekommen und wie kommt es dort wieder weg?
        if (state2 <= WARNING_SIDE && state7 <= WARNING_SIDE) { //linke und rechte Seite ist zu knapp vorne
            if (state1 <= WARNING_SIDE && state8 <= WARNING_SIDE) { //linke und rechte Seite ist zu knapp hinten
                return 0; //es kann nur 0 geben, da das Fahrzeug nur gerade aus fahren kann
            } else if (state1 >= WARNING_SIDE && state8 <= WARNING_SIDE) { //nur die rechte Seite ist zu knapp hinten
                return 0;//es kann nur 0 geben, da das Fahrzeug nur gerade aus fahren kann
            } else if (state1 <= WARNING_SIDE && state8 >= WARNING_SIDE) { //nur die linke Seite ist zu knapp hinten
                return 0;//es kann nur 0 geben, da das Fahrzeug nur gerade aus fahren kann
            } else if (state1 >= WARNING_SIDE && state8 >= WARNING_SIDE) { //keine der beiden Seiten ist zu knapp hinten
                return 0;//es kann nur 0 geben, da das Fahrzeug nur gerade aus fahren kann
            } else { // default
                return 0;//es kann nur 0 geben, da das Fahrzeug nur gerade aus fahren kann
            }
        } else if (state2 >= WARNING_SIDE && state7 <= WARNING_SIDE) { //nur rechte Seite ist zu knapp vorne
            if (state1 <= WARNING_SIDE && state8 <= WARNING_SIDE) { //linke und rechte Seite ist zu knapp hinten
                return -1;
            } else if (state1 >= WARNING_SIDE && state8 <= WARNING_SIDE) { //nur die rechte Seite ist zu knapp hinten
                return -1;
            } else if (state1 <= WARNING_SIDE && state8 >= WARNING_SIDE) { //nur die linke Seite ist zu knapp hinten
                return -1;
            } else if (state1 >= WARNING_SIDE && state8 >= WARNING_SIDE) { //keine der beiden Seiten ist zu knapp hinten
                return -1;
            } else { // default
                return 0;
            }
        } else if (state2 <= WARNING_SIDE && state7 >= WARNING_SIDE) { //nur linke Seite ist zu knapp vorne
            if (state1 <= WARNING_SIDE && state8 <= WARNING_SIDE) { //linke und rechte Seite ist zu knapp hinten
                return 1;
            } else if (state1 >= WARNING_SIDE && state8 <= WARNING_SIDE) { //nur die rechte Seite ist zu knapp hinten
                return 1;
            } else if (state1 <= WARNING_SIDE && state8 >= WARNING_SIDE) { //nur die linke Seite ist zu knapp hinten
                return 1;
            } else if (state1 >= WARNING_SIDE && state8 >= WARNING_SIDE) { //keine der beiden Seiten ist zu knapp hinten
                return 1;
            } else { // default
                return 0;
            }
        } else if (state2 >= WARNING_SIDE && state7 >= WARNING_SIDE) { //keine Seite ist zu knapp vorne
            if (state1 <= WARNING_SIDE && state8 <= WARNING_SIDE) { //linke und rechte Seite ist zu knapp hinten
                return 0;
            } else if (state1 >= WARNING_SIDE && state8 <= WARNING_SIDE) { //nur die rechte Seite ist zu knapp hinten
                return 0;
            } else if (state1 <= WARNING_SIDE && state8 >= WARNING_SIDE) { //nur die linke Seite ist zu knapp hinten
                return 0;
            } else if (state1 >= WARNING_SIDE && state8 >= WARNING_SIDE) { //keine der beiden Seiten ist zu knapp hinten
                return 0;
            } else { // default
                return 0;
            }
        } else { //default
            return 0;
        }
    }

}
