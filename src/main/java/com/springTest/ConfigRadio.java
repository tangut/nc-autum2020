package com.springTest;

import com.springTest.entities.Radio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigRadio {
    @Bean("radio gaga")
    public Radio getRadioGaga(){
        return new Radio("name: radio gaga");
    }

    @Bean("rand radio")
    public Radio getRadio(){
        return new Radio("name: random radio");
    }
}
