package factoryDevice;

import java.util.HashMap;
import java.util.Map;

public class FactoryDevice {
    public static IDevice make (String type){
        Map<String, IDevice> deviceMap = new HashMap<>();
        deviceMap.put("android", new Android());
        //pregunta si hay otro os y si no manda por defecto android
        return deviceMap.containsKey(type.toLowerCase())?
                deviceMap.get(type.toLowerCase()):
                deviceMap.get("android");
    }

}
