import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameMashinhaBargardadTest {
    @Test
    void name_khodroha_bargardad() {
        //given
        Khodro benz = new Mashine("benz");
        Khodro volvo = new Mashine("volvo");
        Khodro motor = new Motor("motor");
        Khodro[] khodroha = {benz, volvo, motor};
        BargardanandeName bargardanandeName = new BargardanandeName(khodroha);

        //when
        String namekhodroha =bargardanandeName.execute();

        //then
        Assertions.assertEquals("benzvolvomotor",namekhodroha);

    }
}
