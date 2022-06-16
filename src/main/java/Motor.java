
public class Motor extends Khodro {
    public String getMark() {
        return mark;
    }

    String mark;

    Motor(String mark) {
        this.mark = mark;
    }


    boolean harekatKardan() {
                if (khodroshanastyana) {
            return true;
        } else {
            return false;
        }
    }
}
