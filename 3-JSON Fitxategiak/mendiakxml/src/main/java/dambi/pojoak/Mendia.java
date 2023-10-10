package dambi.pojoak;

import java.time.LocalDate;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "izena", " altuera", "probintzia", "herria" })
@XmlRootElement(name = "Mendia")

public class Mendia {

    String izena;
    Float altuera;
    String probintzia;
    String herria;

    public String getIzena() {
        return izena;
    }

    @XmlElement(name = "izena")
    public void setIzena(String izena) {
        this.izena = izena;
    }

    public float getAltuera() {
        return altuera;
    }

    @XmlElement(name = "altuera")
    public void setAltuera(float altuera) {
        this.altuera = altuera;
    }

    public String getProbintzia() {
        return probintzia;
    }

    @XmlElement(name = "probintzia")
    public void setProbintzia(String probintzia) {
        this.probintzia = probintzia;
    }

    public String getHerria() {
        return herria;

    }
    @XmlElement(name = "herria")
    public void setHerria(String herria){
        this.herria = herria;
    }
    
    
}


