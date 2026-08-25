package BibliotekaZadatak;

public class Zanr {
    private char oznaka;
    private String nazivZanra;


    public Zanr(char oznaka, String nazivZanra) {
        this.oznaka = oznaka;
        this.nazivZanra = nazivZanra;
    }
    public void ispisiPodatke() {
        System.out.println("Oznaka: " + this.oznaka);
        System.out.println("Naziv: " + this.getNazivZanra());
        System.out.println("----------------------");
    }


    public char getOznaka() {
        return oznaka;
    }

    public void setOznaka(char oznaka) {
        this.oznaka = oznaka;
    }

    public String getNazivZanra() {
        return nazivZanra;
    }

    public void setNazivZanra(String nazivZanra) {
        this.nazivZanra = nazivZanra;
    }
}
