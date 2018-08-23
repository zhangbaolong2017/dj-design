package com.zbl.demo.thread;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author:Zhangbaolong
 * @description:
 * @date: create in ${Time} ${Date}
 */
public class CacheDemo {
    private Map<String,Object> cacheMap = new HashMap<>(128);
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
    }

    public  Object get(String key){
        Object result = null;
        readWriteLock.readLock().lock();
        try{
            if(cacheMap.get(key)==null){
                readWriteLock.readLock().unlock();
                readWriteLock.writeLock().lock();
                try{
                    if(result==null){
                        result = "redis-value";
                    }
                    readWriteLock.readLock().lock();
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    readWriteLock.writeLock().unlock();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            readWriteLock.readLock().unlock();
        }
        return result;
    }

}
