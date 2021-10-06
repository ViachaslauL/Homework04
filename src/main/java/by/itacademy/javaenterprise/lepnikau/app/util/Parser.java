package by.itacademy.javaenterprise.lepnikau.app.util;

import java.util.LinkedHashMap;
import java.util.Map;

public class Parser {

    public Map<String, String> parseQueryString(String qStr) {
        Map<String, String> map = new LinkedHashMap<>();
        for (String param : qStr.split("&")) {
            String[] params = param.split("=");
            map.put(params[0], params[1]);
        }
        return map;
    }

}
