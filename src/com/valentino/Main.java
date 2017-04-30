package com.valentino;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        //Linked hash Map keys and values stay in the same order
        TreeMap<Integer, String> TreeMap = new TreeMap<Integer, String>();
        //natural order
        //method

        testMap(hashMap);
    }

    public static void testMap (Map<Integer,  String> map) {
        map.put(9, "fox");
        map.put(4, "lion");
        map.put(8, "tiger");
        map.put(1, "leopard");
        map.put(0, "snake");
        map.put(15, "elephant");
        map.put(6, "swan");
        map.put(1, "gazelle");

        for (Integer key: map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }
    }

}
