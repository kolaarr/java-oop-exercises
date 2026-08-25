package BibliotekaZadatak;

public class Clan extends Osoba {
    private int clanskiBroj;
    private int brZaduzenihKnjiga;


    public Clan(String ime, String prezime, String jmbg, int clanskiBroj, int brZaduzenihKnjiga) {
        super(ime, prezime, jmbg);
        this.clanskiBroj = clanskiBroj;
        this.brZaduzenihKnjiga = brZaduzenihKnjiga;
    }

    public void ispisiPodatke() {
        System.out.println("JMBG: " + getJmbg());
        System.out.println("Ime: " + getIme());
        System.out.println("Prezime: " + getPrezime());
        System.out.println("Članski broj: " + this.clanskiBroj);
        System.out.println("Broj zaduženih knjiga: " + this.brZaduzenihKnjiga);
        System.out.println("----------------------");

    }

    public int getClanskiBroj() {
        return clanskiBroj;
    }

    public void setClanskiBroj(int clanskiBroj) {
        this.clanskiBroj = clanskiBroj;
    }

    public int getBrZaduzenihKnjiga() {
        return brZaduzenihKnjiga;
    }

    public void setBrZaduzenihKnjiga(int brZaduzenihKnjiga) {
        this.brZaduzenihKnjiga = brZaduzenihKnjiga;
    }
}
