package Classes;

public class KontoObject {

    public double kontostand;
    public String name;
    public int kontonummer;
    public int id;

    public KontoObject(int kontonummer, String name, double kontostand, int id){

        this.kontostand = kontostand;
        this.name = name;
        this.kontonummer = kontonummer;
        this.id = id;
    }

    public double getKontostand(){
        return kontostand;
    }

    public void setKontostand(double kontostand){
        this.kontostand = kontostand;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getKontonummer(){
        return kontonummer;
    }

    public void setKontonummer(int kontonummer){
        this.kontonummer = kontonummer;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }



}