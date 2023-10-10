package dambi.marshal;

import java.time.LocalDate;
import dambi.mendiak.Mendia;
import dambi.mendiak.Mendiak;


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


public class MendiBatSortu {
    public static void main(String[] args) {
        
        Mendia karakate = new Mendia();
        karakate.setIzena("Karakate");
        karakate.setAltuera(749);
        karakate.setProbintzia("gipuzkoa");
        karakate.setHerriadia("Elgoibar");

    }

    
}
