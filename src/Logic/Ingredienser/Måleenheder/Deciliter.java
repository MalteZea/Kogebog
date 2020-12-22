package Logic.Ingredienser.Måleenheder;

public class Deciliter {

    int deciliter;
    String deciliterForkortes = " dl";

    public String afmålDeciliter(int deciliter){
        String afmåltDeciliter = deciliter + deciliterForkortes;
        System.out.println(afmåltDeciliter);
        return afmåltDeciliter;
    }
}
