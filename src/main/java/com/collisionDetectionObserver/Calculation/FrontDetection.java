/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collisionDetectionObserver.Calculation;

import com.collisionDetectionObserver.interfaces.IFrontDetection;

/**
 *
 * @author mensc
 */
public class FrontDetection implements IFrontDetection {

    int WARNING_FRONT = 300;
    int WARNING_FRONT_SIDE = 300;

    public int frontDetection(int state3, int state4, int state5, int state6) {

        //Rückgaben: free, left, right, stop
        //Rückaben: left: -1, free: 0, right: 1, stop: 99
        if (state4 <= WARNING_FRONT && state5 <= WARNING_FRONT) {
            //Beide Frontmesser geben Alarm
            if (state3 <= WARNING_FRONT_SIDE && state6 <= WARNING_FRONT_SIDE) { //Beide Seitenmesser geben Alarm
                return 9;
            } else if (state3 <= WARNING_FRONT_SIDE && state6 >= WARNING_FRONT_SIDE) { //Nur der linke Seitenmesser gibt Alarm
                return 1;
            } else if (state3 >= WARNING_FRONT_SIDE && state6 <= WARNING_FRONT_SIDE) { //Nur der rechte Seitenmesser gibt Alarm
                return -1;
            } else if (state3 >= WARNING_FRONT_SIDE && state6 >= WARNING_FRONT_SIDE) { //Kein Seitenemesser gibt Alarm
                return -1; //Im Normalfall überholt man links.
            } else { //default
                return 9;
            }

        } else if (state4 <= WARNING_FRONT && state5 >= WARNING_FRONT) { //Nur der linke Frontmesser gibt Alarm
            if (state3 <= WARNING_FRONT_SIDE && state6 <= WARNING_FRONT_SIDE) { //Beide Seitenmesser geben Alarm
                return 9;
            } else if (state3 <= WARNING_FRONT_SIDE && state6 >= WARNING_FRONT_SIDE) { //Nur der linke Seitenmesser gibt Alarm
                return 1;
            } else if (state3 >= WARNING_FRONT_SIDE && state6 <= WARNING_FRONT_SIDE) { //Nur der rechte Seitenmesser gibt Alarm
                return -1;
            } else if (state3 >= WARNING_FRONT_SIDE && state6 >= WARNING_FRONT_SIDE) { //Kein Seitenemesser gibt Alarm
                return 1;
            } else { //default
                return 9;
            }

        } else if (state4 >= WARNING_FRONT && state5 <= WARNING_FRONT) { //Nur der rechte Frontmesser gibt Alarm
            if (state3 <= WARNING_FRONT_SIDE && state6 <= WARNING_FRONT_SIDE) { //Beide Seitenmesser geben Alarm
                return 9;
            } else if (state3 <= WARNING_FRONT_SIDE && state6 >= WARNING_FRONT_SIDE) { //Nur der linke Seitenmesser gibt Alarm
                return 1;
            } else if (state3 >= WARNING_FRONT_SIDE && state6 <= WARNING_FRONT_SIDE) { //Nur der rechte Seitenmesser gibt Alarm
                return -1;
            } else if (state3 >= WARNING_FRONT_SIDE && state6 >= WARNING_FRONT_SIDE) { //Kein Seitenemesser gibt Alarm
                return -1;
            } else { //default
                return 9;
            }

        } else if (state4 >= WARNING_FRONT && state5 >= WARNING_FRONT) { //Kein Frontmesser gibt Alarm
            if (state3 <= WARNING_FRONT_SIDE && state6 <= WARNING_FRONT_SIDE) { //Beide Seitenmesser geben Alarm
                return 9;
            } else if (state3 <= WARNING_FRONT_SIDE && state6 >= WARNING_FRONT_SIDE) { //Nur der linke Seitenmesser gibt Alarm
                return 1;
            } else if (state3 >= WARNING_FRONT_SIDE && state6 <= WARNING_FRONT_SIDE) { //Nur der rechte Seitenmesser gibt Alarm
                return -1;
            } else if (state3 >= WARNING_FRONT_SIDE && state6 >= WARNING_FRONT_SIDE) { //Kein Seitenemesser gibt Alarm
                return 0;
            } else { //default
                return 9;
            }
        } else {
            return 9;
        }
    }

}
