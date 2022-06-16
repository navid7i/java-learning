
public class Mashine extends Khodro {
    boolean darbazastyana;

    public String getMark() {
        return mark;
    }

    String mark;

    Mashine(String mark) {
        this.mark = mark;
    }

    void bazKardanDar() {
        darbazastyana = true;
    }

    void bastanDar() {
        darbazastyana = false;
    }



    boolean harekatKardan() {
        if (!darbazastyana && khodroshanastyana) {
            return true;
        } else {
            return false;
        }
    }
}
