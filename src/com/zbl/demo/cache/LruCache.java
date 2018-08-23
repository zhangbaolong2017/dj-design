package com.zbl.demo.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class LruCache<K, V> extends LinkedHashMap<K, V> {
    private Integer maxCapability;

    public LruCache(Integer maxCapability) {
        super(maxCapability, 0.75f, true);
        this.maxCapability = maxCapability;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return this.size() >= maxCapability + 1;
    }


    public static void main(String[] args) {
        LruCache<String,String> cache = new LruCache<>(2);
        cache.put("1","test1");
        cache.put("2","tese2");
        System.out.println("demo"+cache);
        cache.put("3","test3");
        System.out.println("demo2"+cache);

    }

}
