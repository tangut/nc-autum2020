package com.nc.autumn2020.solutions.lesson6;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class UrlHolder {
    private static String protocol;
    private String domain;
    private int port;
    private KeyValueParam[] keyValueParams;

    public static String getProtocol() {
        return protocol;
    }

    public static void setProtocol(String protocol) {
        UrlHolder.protocol = protocol;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public KeyValueParam[] getKeyValueParams() {
        return keyValueParams;
    }

    public void setKeyValueParams(KeyValueParam[] keyValueParams) {
        this.keyValueParams = keyValueParams;
    }

    @Override
    public String toString() {
        return "UrlHolder{" +
                "domain='" + domain + '\'' +
                ", port=" + port +
                ", keyValueParams=" + Arrays.toString(keyValueParams) +
                '}';
    }

    /*
    public void urlDecode() {
        try {
            String decodedURL = URLDecoder.decode(url, "UTF-8");
            System.out.println(decodedURL);
            String[]split = decodedURL.split("\\?", 2);
            split[1] = URLEncoder.encode(split[1], "ASCII");


        } catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }

     */

}
