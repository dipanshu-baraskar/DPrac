package com.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap<K, V> implements Map {
    private final Map<K, V> map;

    private int countPut;
    private int countPutAll;
    private int countPutIfAbsent;

    public MyMap(Map<K, V> map) {
        this.map = map;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    @Override
    public Object get(Object key) {
        return map.get(key);
    }

    @Override
    public V put(Object key, Object value) {
        countPut++;
        return map.put((K) key, (V) value);
    }

    @Override
    public Object remove(Object key) {
        return map.remove(key);
    }

    @Override
    public void putAll(Map m) {
        countPutAll++;
        map.putAll(m);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Set keySet() {
        return map.keySet();
    }

    @Override
    public Collection values() {
        return map.values();
    }


    @Override
    public Set<Entry<K, V>> entrySet() {
        return map.entrySet();
    }

    @Override
    public V putIfAbsent(Object key, Object value) {
        countPutIfAbsent++;
        V v = (V) get(key);
        if (v == null) {
            v = put(key, value);
        }
        return v;
    }

    // stats getters
    public int getCountPut() {
        return countPut;
    }

    public int getCountPutAll() {
        return countPutAll;
    }

    public int getCountPutIfAbsent() {
        return countPutIfAbsent;
    }

    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put(1, 1);
        m.put(2, 1);

        MyMap mm = new MyMap(m);
        mm.put(1, 1);
        mm.putAll(m);
        mm.put(1, 1);

        System.out.println(mm.getCountPut());
        System.out.println(mm.getCountPutAll());


    }

}
