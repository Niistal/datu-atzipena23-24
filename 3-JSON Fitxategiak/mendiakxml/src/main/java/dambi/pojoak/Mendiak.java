package dambi.pojoak;

import java.lang.annotation.Documented;
import java.util.ArrayList;
import java.util.List;

import dambi.marshal.HiruMendiSortu;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Mendiak")
public class Mendiak {

    List<HiruMendiSortu> mendiak;

    public List<HiruMendiSortu> getMendiak() {
        return mendiak;

    }
    @XmlElement(name = "Mendia")
    public void setMendiak(List<HiruMendiSortu> mendiak) {
        this.mendiak = mendiak;
    }

    /**    @param mendia */
    public void addMendia(HiruMendiSortu mendia) {
        if (this.mendiak == null) {
            this.mendiak = new ArrayList<HiruMendiSortu>();
        }
        this.mendiak.add(mendia);
    }
    
    

}
