public abstract class Khodro {
    boolean khodroshanastyana;

    void roshanKardan() {
        khodroshanastyana = true;
    }

    void khamoushKardan() {
        khodroshanastyana = false;
    }

    abstract boolean harekatKardan();
    public abstract String getMark();
}
