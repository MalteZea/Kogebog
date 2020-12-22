package Logic.Opskrifter;

import Logic.Opskrifter.Samling.PastaIPikantostsauce;
import Logic.Opskrifter.Samling.TomatSalat;

public class Opskrift {

    private Opskrift(){
        System.out.println("Et opskrift objekt er blevet oprettet");
    }

    TomatSalat tomatSalat;
    PastaIPikantostsauce pastaIPikantostsauce;
    Object[] samling = {tomatSalat, pastaIPikantostsauce};

    private int vælgOpskrift;
    private int antalPortioner = 1;

    public void setAntalPortioner(int antalPortioner) {
        this.antalPortioner = antalPortioner;
    }

    private void portionTilpasning(){

    }


}

