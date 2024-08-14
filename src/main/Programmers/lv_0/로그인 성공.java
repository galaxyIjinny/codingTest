import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < db.length; i++) {
            map.put(db[i][0], db[i][1]);
        }

        String id = id_pw[0];
        String password = id_pw[1];

        if (map.containsKey(id)) {
            if (map.get(id).equals(password)) { // == 쓰면 안된다
                return "login";
            } else return "wrong pw";
        } else return "fail";
    }
}

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] idPw, String[][] db) {
        return getDb(db).get(idPw[0]) != null ? getDb(db).get(idPw[0]).equals(idPw[1]) ? "login" : "wrong pw" : "fail";
    }

    private Map<String, String> getDb(String[][] db) {
        Map<String, String> map = new HashMap<>();

        for (String[] array : db) {
            map.put(array[0], array[1]);
        }
        return map;
    }
}