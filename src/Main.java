public class Main {
    public static void main(String[] args) {
        Biblioteka manoBiblioteka = new Biblioteka();

        Autorius autoriusMarkusZusak = new Autorius("Markus", "Zusak", "1980");
        Autorius autoriusWilliamGolding = new Autorius("William", "Golding", "1977");
        Autorius autoriusKhaledHosseini = new Autorius("Khaled", "Hosseini", "1958");

        Knyga knyga1 = new Knyga(2005, autoriusMarkusZusak, "The Book Thief");
        Knyga knyga2 = new Knyga(1954, autoriusWilliamGolding, "Lord of the Flies");
        Knyga knyga3 = new Knyga(2003, autoriusKhaledHosseini, "The Kite Runner");

        manoBiblioteka.pridedamKnyga(knyga3);
        manoBiblioteka.pridedamKnyga(knyga2);
        manoBiblioteka.pridedamKnyga(knyga1);


        for (Knyga knyga : manoBiblioteka.knygos)  ///////// Eina per kiekviena elementa sarase
        {
            System.out.println(knyga.knygosInfo());
        }
        for (int i = 0; i < manoBiblioteka.knygos.size() - 1; i++) {   ///////////////// Spausdina visa sarasa ( -1 )
            System.out.println(manoBiblioteka.knygos.get(i).knygosInfo());
        }
    }
}