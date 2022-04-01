package com.nhlstenden.proxyPattern;

import com.nhlstenden.Order;

import java.util.Timer;
import java.util.TimerTask;

public class GPSTracker {
    Order order;


    public GPSTracker(Order order) {
        this.order = order;
    }

    // bezorg pizza
    // Om de x aantal minuten word een message getoond met betrekking tot de bezorging.s
    public void Deliver() {
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Bestelling is onderweg");
            }
        }, 2 * 60 * 1000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("5KM resterend, nog even wachten!");
            }
        }, 4 * 60 * 1000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("2KM resterend, we zijn er bijna!");
            }
        }, 6 * 60 * 1000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Minder dat 1KM resterend, let op! we kunnen er elk moment zijn.");
            }
        }, 7 * 60 * 1000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Eetsmakelijk!");
            }
        }, 8 * 60 * 1000);
    }
}
