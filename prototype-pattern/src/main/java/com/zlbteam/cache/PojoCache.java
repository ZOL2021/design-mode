package com.zlbteam.cache;

import com.zlbteam.bean.PojoClazz;
import com.zlbteam.bean.TempClazz;

import java.util.HashMap;

/**
 * @author zhoulibin
 */
public class PojoCache {
    private PojoCache() {}

    private static HashMap<String, TempClazz> tempMap = new HashMap<>();

    public static TempClazz getTemp(String id) {
        TempClazz cache = tempMap.get(id);
        return (TempClazz) cache.clone();
    }

    public static void loadCache() {
        PojoClazz clazz = new PojoClazz();
        clazz.setId("1");
        tempMap.put(clazz.getId(), clazz);
    }
}
