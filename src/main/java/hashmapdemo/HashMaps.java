package hashmapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        Map<Integer, String> wuTangClan = new HashMap<>();
        wuTangClan.put(1, "RZA");
        wuTangClan.put(2, "GZA");
        wuTangClan.put(3, "Ghost Face Killah");
        wuTangClan.put(4, "Raekwon");
        wuTangClan.put(5, "Method Man");


//        System.out.println(wuTangClan.entrySet());
//        System.out.println(wuTangClan.keySet());
//        System.out.println(wuTangClan.values());
//        System.out.println(wuTangClan.get(1));
//        wuTangClan.remove(3);
//        System.out.println(wuTangClan);

//        for (Map.Entry<Integer, String> entry : wuTangClan.entrySet()) {
//            System.out.println(entry);
//        }
//
//        for (String value : wuTangClan.values()) {
//            System.out.println(value);
//        }

//        Iterator<Map.Entry<Integer, String>> iterator = wuTangClan.entrySet().iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//        Iterator<Integer> iteratorKey = wuTangClan.keySet().iterator();
//
//        while (iteratorKey.hasNext()) {
//            System.out.println(iteratorKey.next());
//        }

//        Iterator<String> iteratorString = wuTangClan.values().iterator();
//
//        while(iteratorString.hasNext()) {
//            System.out.println(iteratorString.next());
//        }
    }
}
