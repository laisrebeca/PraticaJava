package aulas.javaDatas;
import java.util.Date;

public class Exemplo03 {
    public static void main (String[] args){
        Date dataP = new Date(1513124807691L);

        Date dataF = new Date(1713124807691L);


        boolean isAfter = dataP.after(dataF);

        System.out.println(isAfter);
        System.out.println(dataF);


        boolean isBefore = dataP.before(dataF);
        System.out.println(isBefore);
    }
}
