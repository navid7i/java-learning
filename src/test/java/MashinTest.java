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

    class Mashine {
        boolean mashinroshanastyana;
        boolean darbazastyana;
        String mark;

        Mashine(String mark) {
            this.mark = mark;
            System.out.println("yek mashin ba name " + this.mark + "sakhte shod");
        }

        void bazKardanDar() {
            System.out.println("dar baz ast");
            darbazastyana = true;
        }

        void bastanDar() {
            System.out.println("dar baste ast");
            darbazastyana = false;
        }

        void roshanKardan() {
            System.out.println("roshan shavad");
            mashinroshanastyana = true;
        }

        void khamoushKardan() {
            System.out.println("khamoush shavad");
            mashinroshanastyana = false;
        }

        boolean harekatKardan() {
            if (!darbazastyana && mashinroshanastyana) {
                System.out.println("mojaz be harekat");
                return true;
            } else {
                System.out.println("gheyre mojaz baraye harekat");
                return false;
            }
        }

    }
}
