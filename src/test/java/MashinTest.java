public class MashinTest {
    class Mashine {
        boolean mashinroshanastyana;
        boolean darbazastyana;

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

        void harekatKardan() {
            if (!darbazastyana && mashinroshanastyana) {
                System.out.println("mojaz be harekat");
            } else {
                System.out.println("gheyre mojaz baraye harekat");
            }
        }

    }
}
