package StackQueueSetTree.TreeHashSet.HashMapLinkedHashMapTreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class StudentByAge {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Daisy", 19);
        hashMap.put("Anna", 19);
        hashMap.put("Rosy", 19);
        hashMap.put("Bob", 19);
        System.out.println(hashMap);

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Daisy", 19);
        treeMap.put("Anna", 19);
        treeMap.put("Rosy", 19);
        treeMap.put("Bob", 19);
        System.out.println(treeMap);

        LinkedHashMap <String, Integer> linkedHashMap = new LinkedHashMap(4, 0.75f, true);
        linkedHashMap.put("Daisy", 19);
        linkedHashMap.put("Anna", 19);
        linkedHashMap.put("Rosy", 19);
        linkedHashMap.put("Bob", 19);
        System.out.println(linkedHashMap);
    }
}
