import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MashinTest {

    @Test
    void mashin_bayad_ba_dar_baste_va_roshan_harekat_konad() {
        //given
        Mashine benz = new Mashine("benz");
        Mashine pride = new Mashine("pride");
        pride.roshanKardan();

        //when
        boolean ayaBenzMojazBeHarekatAst = benz.harekatKardan();
        boolean ayaPrideMojazBeHarekatAst = pride.harekatKardan();

        //then
        assertFalse(ayaBenzMojazBeHarekatAst);
        assertTrue(ayaPrideMojazBeHarekatAst);

    }

}
