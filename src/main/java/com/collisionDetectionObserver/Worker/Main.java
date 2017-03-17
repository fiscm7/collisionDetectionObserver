/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collisionDetectionObserver.Worker;

import com.collisionDetectionObserver.connectors.Get1LDB;
import com.collisionDetectionObserver.connectors.Get2LDF;
import com.collisionDetectionObserver.connectors.Get3LS;
import com.collisionDetectionObserver.connectors.Get4LF;
import com.collisionDetectionObserver.connectors.Get5RF;
import com.collisionDetectionObserver.connectors.Get6RS;
import com.collisionDetectionObserver.connectors.Get7RDF;
import com.collisionDetectionObserver.connectors.Get8RDB;
import com.collisionDetectionObserver.interfaces.IConnector;
import com.collisionDetectionObserver.observer.SensorData;
import com.collisionDetectionObserver.observer.SensorObserver;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author mensc
 */
public class Main {
    //Hier werden die Daten abgerufen und in den Thread gejagt, damit die dann vom Objekt weiterverarbeitet werden.
    //thread with setvalue

    static IConnector get1ldb = new Get1LDB();
    static IConnector get2ldf = new Get2LDF();
    static IConnector get3ls = new Get3LS();
    static IConnector get4lf = new Get4LF();
    static IConnector get5rf = new Get5RF();
    static IConnector get6rs = new Get6RS();
    static IConnector get7rdf = new Get7RDF();
    static IConnector get8rdb = new Get8RDB();

    public static void main(String[] args) throws InterruptedException {

        Thread runIt = new Thread();

        SensorData datas = new SensorData();

        new SensorObserver(datas);

        runIt.start();

        while (true) {

//            datas.setState(1, 6, 1, 5, 8, 9, 3, 4);
//
//            datas.setState(5, 7, 3, 6, 6, 3, 6, 7);
//
//            datas.setState(7, 5, 8, 9, 8, 6, 4, 6);
//
//            runIt.sleep(100);

            datas.setState(get1ldb.getData(), get2ldf.getData(), get3ls.getData(), get4lf.getData(), get5rf.getData(), get6rs.getData(), get7rdf.getData(), get8rdb.getData());

        }

    }

}
