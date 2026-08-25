package BibliotekaZadatak;

// Main.java

public class Main {

    public static void main(String[] args) {
        Biblioteka biblioteka = new Biblioteka();
        biblioteka.dodajZanr('F', "Roman");
        biblioteka.dodajZanr('N', "Biografija");

        Clan c1 = biblioteka.dodajClana("1234567890123", "Marko", "Markovic", 1001);

        Clan c2 = biblioteka.dodajClana("9876543210123", "Ana", "Anic", 1002);

        Zanr roman = new Zanr('F', "Roman");

        Knjiga k1 = biblioteka.dodajKnjigu(1, "Na Drini Cuprija", "Ivo Andric", roman);

        biblioteka.zaduziKnjigu(1001, 1);

        Clan najaktivniji = biblioteka.vratiNajaktivnijegClana();
        System.out.println(najaktivniji.getIme());

        for (Clan c : biblioteka.getListaClanova()) {
            c.ispisiPodatke();
        }
    }
}
