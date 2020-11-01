package com.nc.autumn2020.solutions.lesson6;

import com.plugin.api.Plugin;

import java.io.File;
import java.io.FileFilter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class DinamicClassLoaderExample {

    public void run(String[] args){
        File pluginDir = new File("plugins");
        FileFilter jarsFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".jar");
            }
        };
        File[] files = pluginDir.listFiles(jarsFilter);
        for (File file:files){
            try{
                URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{file.toURI().toURL()});
                Class<?> aClass = urlClassLoader.loadClass("com.ext.HelloPlugin");
                Plugin plugin = (Plugin)aClass.newInstance();
                plugin.invoke();
            } catch (MalformedURLException | ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
