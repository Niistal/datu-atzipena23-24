package dambi.mendiak;

import java.time.LocalDate;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "izena", " altuera", "probintzia" })
@XmlRootElement(name = "Mendia")
public class MendiBatSortu {
    String izena;
    Float altuera;
    String probintzia;

    public String getIzena() {
        return izena;
    }

    @XmlElement(name = "Mendia_izena")
    public void setIzena(String izena) {
        this.izena = izena;
    }

    public float getAltuera() {
        return altuera;
    }

    @XmlElement(name = "Mendia_altuera")
    public void setAltuera(float altuera) {
        this.altuera = altuera;
    }

    public String getProbintzia() {
        return probintzia;
    }

    @XmlElement(name = "Mendia_probintzia")
    public void setProbintzia(String probintzia) {
        this.probintzia = probintzia;
    }

    
}
