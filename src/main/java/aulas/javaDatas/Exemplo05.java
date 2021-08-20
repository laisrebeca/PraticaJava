package aulas.javaDatas;
import java.time.Instant;
import java.util.Date;

public class Exemplo05 {
    public static void main(String[] args) {
        Date dataI = new Date(1613124807691L);
        System.out.println(dataI);


        Instant instant = dataI.toInstant();
        System.out.println(instant);
    }
}
