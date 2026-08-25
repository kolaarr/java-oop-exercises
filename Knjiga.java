package BibliotekaZadatak;

public class Knjiga {
    private int inventarskiBroj;
    private String nazivKnjige;
    private String autor;
    private Zanr zanr;



    public Knjiga(int inventarskiBroj, String nazivKnjige, String autor, Zanr zanr) {
        this.inventarskiBroj = inventarskiBroj;
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        this.zanr = zanr;
    }
    public void ispisiPodatke() {
        System.out.println("Inventarski broj: " + this.inventarskiBroj);
        System.out.println("Naziv: " + this.nazivKnjige);
        System.out.println("Autor: " + this.autor);
        System.out.println("Žanr: " + zanr.getNazivZanra());
        System.out.println("----------------------");
    }


    public int getInventarskiBroj() {
        return inventarskiBroj;
    }

    public void setInventarskiBroj(int inventarskiBroj) {
        this.inventarskiBroj = inventarskiBroj;
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Zanr getZanr() {
        return zanr;
    }

    public void setZanr(Zanr zanr) {
        this.zanr = zanr;
    }
}
