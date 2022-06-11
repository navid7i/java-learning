public class Mashine {
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
