public class Knyga{
    private int isleidimoMetai;
    private Autorius autorius;
    private String pavadinimas;

    public Knyga(int isleidimoMetai, Autorius autorius, String pavadinimas) {
        this.isleidimoMetai = isleidimoMetai;
        this.autorius = autorius;
        this.pavadinimas = pavadinimas;
    }

    public void setIsleidimoMetai(int isleidimoMetai) {
        this.isleidimoMetai = isleidimoMetai;
    }

    public void setAutorius(Autorius autorius) {
        this.autorius = autorius;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public int getIsleidimoMetai() {
        return isleidimoMetai;
    }

    public Autorius getAutorius() {
        return autorius;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }
    public String knygosInfo(){
        return "Knygos pavadinimas: " + pavadinimas + ". " + "Išleidimo data: " + isleidimoMetai + ". " + autorius.getAutoriusInfo();
    }
}
