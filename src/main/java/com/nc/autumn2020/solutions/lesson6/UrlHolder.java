package com.nc.autumn2020.solutions.lesson6;

import com.nc.autumn2020.solutions.LessonApi;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class UrlHolder implements LessonApi {
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


    public void urlDecode(String url) {
        try {
            String decodedURL = URLDecoder.decode(url, "UTF-8");
            System.out.println(decodedURL);
            String[]split = decodedURL.split("\\?", 2);
            split[1] = URLEncoder.encode(split[1], "ASCII");
            System.out.println(split[1]);

        } catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }

    public void executeSolution(String[] args){
        String url = "http://localhost.netcracker.com:6810/product.plain_taskc.nc?tab=_Task&object=9090363151013783084&container=9158610804913819337&task=9158610813113819418&state=update&return=%2Fcommon%2Fuobject.jsp%3Fobject%3D9158610804913819337&object=9090363151013783084";
        urlDecode(url);
    }

}
