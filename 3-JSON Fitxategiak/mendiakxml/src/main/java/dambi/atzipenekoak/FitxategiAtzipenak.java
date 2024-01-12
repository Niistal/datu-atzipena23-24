package dambi.atzipenekoak;

import dambi.pojoak.Mendiak;

public abstract class FitxategiAtzipenak {
    private String strFileIn;
    private String strFileOut;

    public FitxategiAtzipenak(String fileIn, String fileout) {
        this.strFileIn = fileIn;
        this.strFileOut=fileout;
    }

    public FitxategiAtzipenak(String fileIn) {
        this.strFileIn = fileIn;

    }

    public abstract Mendiak irakurri(){

        return null;
    }

    public abstract idatzi(Mendiak mendiak){

        return idatzi();
    }
}
