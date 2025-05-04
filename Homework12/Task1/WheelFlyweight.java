package Homework12.Task1;

import java.util.HashMap;
import java.util.Map;

public class WheelFlyweight {
    private final Map<Integer, Wheel> wheelCache;

    public WheelFlyweight() {
        this.wheelCache = new HashMap<>();
    }

    public Wheel getWheel(int diametr){
        Wheel wheel = wheelCache.get(diametr);
        if(wheel==null){
            wheel = new Wheel(diametr);
            wheelCache.put(diametr,wheel);
        }
        return wheel;
    }
}
