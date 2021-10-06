package by.itacademy.javaenterprise.lepnikau.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IpAddrService {

    private List<String> ips = new ArrayList<>(Arrays.asList(
            "0:0:0:0:0:0:0:0",
            "0:0:0:0:0:0:0:1",
            "0:0:0:0:0:0:0:2"
    ));

    public boolean isExist(String addr) {
        return ips.contains(addr);
    }
}
