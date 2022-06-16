public class BargardanandeName {
    Khodro[] khodroha;

    public BargardanandeName(Khodro[] khodroha) {
        this.khodroha = khodroha;
    }

    public String execute() {
        String result = "";
        for (int i = 0; i < khodroha.length; i++) {
            result = result + khodroha[i].getMark();
        }
        return result;
    }
}
