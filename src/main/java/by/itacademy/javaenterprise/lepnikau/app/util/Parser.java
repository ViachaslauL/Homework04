package by.itacademy.javaenterprise.lepnikau.app.util;

import java.util.LinkedHashMap;
import java.util.Map;

public class Parser {

    public static Map<String, String> parseQueryString(String qStr) {
        Map<String, String> map = new LinkedHashMap<>();

        for (String param : qStr.split("&")) {
            String[] params = param.split("=");

            if (params.length == 2) {
                map.put(params[0], params[1]);
            } else {
                map.put(params[0], "empty");
            }
        }
        return map;
    }

}
