import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForooshandeTest {
    @Test
    void forooshe_har_mashin_afzayeshe_motoghayere_tedad_foroosh() {
        //given
        Forooshande ali = new Forooshande();
        Forooshande abbas=new Forooshande();
        ali.forooshMashin();
        ali.forooshMashin();
        ali.forooshMashin();
        abbas.forooshMashin();


        //when



        //then
        Assertions.assertEquals(4,Mashine.tedadForoosh);
    }
}
