package dambi.unmarshal;

import java.io.File;

import dambi.marshal.HiruMendiSortu;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class GipuzkoakoMendiak {
    public static void main(String[] args) {
        try {
        File file = new File("hirumendi.xml");
        JAXBContext jaxbContext=JAXBContext.newInstance(HiruMendiSortu.class);
        
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        HiruMendiSortu mendiak =(HiruMendiSortu) unmarshaller.unmarshal(file);
        System.out.println(mendiak);     

    } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
