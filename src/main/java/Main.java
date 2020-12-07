import com.springTest.RadioPlayer;
import com.springTest.entities.Radio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.springTest");
        Radio radioGaga = (Radio) context.getBean("radio gaga");
        Radio randRadio = (Radio) context.getBean("rand radio");
        ArrayList<Radio> radios = new ArrayList<>();
        radios.add(radioGaga);
        radios.add(randRadio);
        RadioPlayer radioPlayer = new RadioPlayer(radios);
        radioPlayer.playSongs();
        radioPlayer.switchStaiton();
        radioPlayer.playSongs();
        radioPlayer.switchStaiton();
    }
}
