package zz;

import java.util.*;

public class Str {

    public static void main(String[] args) {
        //  String ip="{\"TABEL\",\"TABLET\",\"LABEL\",\"TABLE\",\"TYRE\",\"\"RYTE\", \"KITE\",\"LANTER\",\"LATER,\"RATEL\"}";
        //  {TABEL,TABLE}
        // {KITE}
        // {TYRE,RYTE}

        String[] ip = {"TABEL", "TABLET", "LABEL", "TABLE", "TYRE", "RYTE", "KITE", "LANTER", "LATER", "RATEL"};
//        String[] ip = {"LABEL"};
        wordsWithSameCharSet(ip, ip.length);

    }

    static final int MAX_CHAR = 26;

    static String getKey(String str) {
        boolean[] visited = new boolean[MAX_CHAR];
        Arrays.fill(visited, false);

        // store all unique characters of current
        // word in key
        for (int j = 0; j < str.length(); j++) {
            visited[str.charAt(j) - 'A'] = true;
        }
        String key = "";
        for (int j = 0; j < MAX_CHAR; j++) {
            if (visited[j]) {
                key = key + (char) ('A' + j);
            }
        }
        return key;
    }

    // Print all words together with same character sets.
    static void wordsWithSameCharSet(String words[], int n) {
        // Stores indexes of all words that have same
        // set of unique characters.
        //unordered_map <string, vector <int> > map;
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        // Traverse all words
        for (int i = 0; i < n; i++) {
            String key = getKey(words[i]);
            System.out.println("key->" + key);
            // if the key is already in the map
            // then get its corresponding value
            // and update the list and put it in the map
            if (map.containsKey(key)) {
                ArrayList<Integer> get_al = map.get(key);
                get_al.add(i);
                map.put(key, get_al);
            }

            // if key is not present in the map
            // then create a new list and add
            // both key and the list
            else {
                ArrayList<Integer> new_al = new ArrayList<>();
                new_al.add(i);
                map.put(key, new_al);
            }
            System.out.println(map);
        }

        // print all words that have the same unique character set
        for (Map.Entry<String, ArrayList<Integer>> it : map.entrySet()) {
            ArrayList<Integer> get = it.getValue();
            for (Integer v : get) {
                System.out.print(words[v] + ", ");
            }
            System.out.println();
        }
    }

    public static void test(String[] s) {

        List<Map> sameStr = new ArrayList();

        for (String ss : s) {
            Map<Character, Integer> map = new LinkedHashMap<>();
            for (int j = 0; j < ss.length(); j++) {
                if (map.containsKey(ss.charAt(j))) {
                    map.put(ss.charAt(j), map.get(ss.charAt(j)) + 1);
                } else {
                    map.put(ss.charAt(j), 1);
                }
            }
            sameStr.add(map);
        }
        System.out.println(sameStr);

        int z = 0;
        while (z != sameStr.size()) {
            ArrayList<Map> al1 = new ArrayList();

            for (int i = z + 1; i < sameStr.size(); i++) {
                if (al1.contains(sameStr.get(i))) {
                    al1.add(sameStr.get(i));
                } else {
                    al1.add(sameStr.get(i));
                }
            }
            for (Map<Character, Integer> mmm : al1) {
                for (Map.Entry<Character, Integer> entry : mmm.entrySet()) {
                    System.out.print(entry.getKey());
                }
                System.out.print(",");
            }


//            for ( Map.Entry<Character, Integer> entry : al1.) {
//                Character key = entry.getKey();
//
//                // do something with key and/or tab
//            }
            z++;
        }
    }
}
