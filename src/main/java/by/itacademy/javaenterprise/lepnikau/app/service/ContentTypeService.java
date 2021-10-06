package by.itacademy.javaenterprise.lepnikau.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContentTypeService {

    private List<String> cTypes = new ArrayList<>(Arrays.asList(
            "text/html",
            "text/plain",
            "application/json"
    ));

    public boolean isExist(String cType) {
        return cTypes.contains(cType);
    }
}
