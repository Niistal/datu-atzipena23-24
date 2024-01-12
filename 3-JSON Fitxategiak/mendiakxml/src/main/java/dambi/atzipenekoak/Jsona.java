package dambi.atzipenekoak;

import java.io.FileOutputStream;

import dambi.pojoak.Mendiak;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.Jsonwriter;

public class Jsona extends FitxategiAtzipenak{
    public Jsona(String fileIn) {
        super(fileIn);
        //TODO Auto-generated constructor stub
    }

    public Jsona(String fileIn, String fileout) {
        super(fileIn, fileout);

    }

    public Mendiak irakurri() {

        return null;

    }

    public int idatzi(Mendiak mendiak) {
        try (JsonWriter jsonWriter = Json.createWriter(new FileOutputStream("data/Irteera.json"))) {
            jsonWriter.writeObject(model);
            return 0;
        }
    }
} 
