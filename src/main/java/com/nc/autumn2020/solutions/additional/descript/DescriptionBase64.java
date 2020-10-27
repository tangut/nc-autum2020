package com.nc.autumn2020.solutions.additional.descript;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Base64;

public class DescriptionBase64 {
    private final static String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    public static void Descript(String filepath) throws FileNotFoundException {
        try (BufferedReader buff = new BufferedReader(new FileReader(filepath))){
            String text = buff.readLine();
            byte[] codedBytes = text.getBytes();
            Base64.Decoder decoder = Base64.getDecoder();
            byte[] decbytes = decoder.decode(codedBytes);
            BufferedImage image = ImageIO.read(new ByteArrayInputStream(decbytes));
            ImageIO.write(image, "png", new File("D:\\", "result.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
