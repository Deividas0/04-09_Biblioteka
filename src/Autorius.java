public class Autorius {
    private String vardas;
    private String pavarde;
    private String gimimoMetai;

    public Autorius(String vardas, String pavarde, String gimimoMetai){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.gimimoMetai = gimimoMetai;
    }


    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public void setGimimoMetai(String gimimoMetai) {
        this.gimimoMetai = gimimoMetai;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public String getGimimoMetai() {
        return gimimoMetai;
    }
    public String getAutoriusInfo(){
        return "Autoriaus vardas ir pavardė: " +vardas + " " + pavarde + " ";
    }

}
