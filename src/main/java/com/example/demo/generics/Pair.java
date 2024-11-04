package com.example.demo.generics;

import java.util.ArrayList;
import java.util.List;

public class Pair<K,V>{
    private K key;
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public static <K> K getFirstItemOFList(List<K> list){
        return list.get(0);
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

}



