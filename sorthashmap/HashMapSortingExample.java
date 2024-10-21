package sorthashmap;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapSortingExample {

    public static Map<String, Integer> sortMapByValues(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

//        before Java 8
       /* Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });*/

//        Using Java 8 Lambdas
//            Collections.sort(list,(o1,o2)->o1.getValue().compareTo(o2.getValue()));

//        Using Streams in Java 8
        HashMap<String, Integer> temp
                = map.entrySet().stream().sorted((i1, i2)-> i1.getValue().compareTo(i2.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        Map<String, Integer> tempMap = new LinkedHashMap();
        for(Map.Entry<String,Integer> el:list){
            tempMap.put(el.getKey(), el.getValue());
        }
        return temp;
    }

    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<String, Integer>();
        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        Map<String, Integer> hm1 = sortMapByValues(hm);

        // print the sorted hashmap
        /*for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }*/

        hm1.forEach((k,v)->{
            System.out.println(k+" "+v);
        }); 
    }
}
