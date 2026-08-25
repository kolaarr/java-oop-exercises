package BibliotekaZadatak;

import java.util.ArrayList;


public class Biblioteka {
    ArrayList<Clan> listaClanova = new ArrayList<>();
    ArrayList<Zanr> listaZanrova = new ArrayList<>();
    ArrayList<Knjiga> listaKnjiga = new ArrayList<>();
    private static int ukupanBrojClanova = 0;

    public Biblioteka() {
    }

    public Biblioteka(ArrayList<Clan> listaClanova, ArrayList<Zanr> listaZanrova, ArrayList<Knjiga> listaKnjiga) {
        this.listaClanova = listaClanova;
        this.listaZanrova = listaZanrova;
        this.listaKnjiga = listaKnjiga;
    }


    public boolean dodajZanr(char oznaka, String nazivZanra) {
        if (oznaka != 'N' && oznaka != 'F') {
            return false;
        }
        for (Zanr zanr : listaZanrova) {
            if (zanr.getOznaka() == oznaka) {
                return false;
            }
        }
        Zanr novZanr = new Zanr(oznaka, nazivZanra);
        listaZanrova.add(novZanr);
        return true;
    }

    public Clan dodajClana(String jmbg, String ime, String prezime, int clanskiBroj) {
        try {
            if (jmbg.length() != 13) {
                return null;
            }
            for (Clan clan : listaClanova) {
                if (clan.getClanskiBroj() == clanskiBroj) {
                    return null;
                }
            }
            Clan novClan = new Clan(ime, prezime, jmbg, clanskiBroj, 0);
            listaClanova.add(novClan);
            ukupanBrojClanova++;
            return (novClan);
        } catch (Exception ex) {
            System.out.println("Doslo je do greske:" + ex.getMessage());
            return null;
        }
    }

    public Knjiga dodajKnjigu(int inventarskiBroj, String nazivKnjige, String autor, Zanr zanr) {
        if (!listaZanrova.contains(zanr)) {
            return null;
        }
        for (Knjiga knjiga : listaKnjiga) {
            if ((knjiga.getInventarskiBroj()) == inventarskiBroj) {
                return null;
            }
        }
        Knjiga novaKnjiga = new Knjiga(inventarskiBroj, nazivKnjige, autor, zanr);
        listaKnjiga.add(novaKnjiga);
        return (novaKnjiga);
    }

    public int zaduziKnjigu(int clasnkiBroj, int inventarskiBroj) {
        Clan trazeniClan = null;
        Knjiga trazenaKnjiga = null;
        for (Clan clan : listaClanova) {
            if (clan.getClanskiBroj() == clasnkiBroj) {
                trazeniClan = clan;
                break;
            }
        }
        if (trazeniClan == null) {
            return -1;

        }
        for (Knjiga knjiga : listaKnjiga) {
            if (knjiga.getInventarskiBroj() == inventarskiBroj) {
                trazenaKnjiga = knjiga;
                break;
            }
        }
        if (trazenaKnjiga == null) {
            return -1;
        }
        if (trazeniClan.getBrZaduzenihKnjiga() >= 3) {
            return -2;
        }
        trazeniClan.setBrZaduzenihKnjiga(trazeniClan.getBrZaduzenihKnjiga() + 1);
        return 1;
    }


    public Clan vratiNajaktivnijegClana() {

        Clan najaktivniji = listaClanova.get(0);

        for (Clan clan : listaClanova) {

            if (clan.getBrZaduzenihKnjiga() >
                    najaktivniji.getBrZaduzenihKnjiga()) {

                najaktivniji = clan;
            }
        }

        return najaktivniji;
    }

    public static int getUkupanBrojClanova() {
        return ukupanBrojClanova;
    }


    public ArrayList<Clan> getListaClanova() {
        return listaClanova;
    }

    public void setListaClanova(ArrayList<Clan> listaClanova) {
        this.listaClanova = listaClanova;
    }

    public ArrayList<Zanr> getListaZanrova() {
        return listaZanrova;
    }

    public void setListaZanrova(ArrayList<Zanr> listaZanrova) {
        this.listaZanrova = listaZanrova;
    }

    public ArrayList<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }

    public void setListaKnjiga(ArrayList<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }


    public static void setUkupanBrojClanova(int ukupanBrojClanova) {
        Biblioteka.ukupanBrojClanova = ukupanBrojClanova;
    }
}
