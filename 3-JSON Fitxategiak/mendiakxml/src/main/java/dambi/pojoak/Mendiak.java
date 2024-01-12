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
    public List<Mendia> mendiak;
    

}
